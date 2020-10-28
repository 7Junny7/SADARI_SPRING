<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>map</title>
</head>
<body>
	<!-- 메뉴 인터셉터 -->
	
<c:import url="/WEB-INF/views/include/top_menu.jsp" />
	<p style="margin-top: -12px"></p>
	<div id="map" style="width: 50%; height: 250px;"></div>
	<script type="text/javascript"
		src="//dapi.kakao.com/v2/maps/sdk.js?appkey=fa75c9503662359585ac536ec9b0f6e5"></script>
	<script>
		var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
		mapOption = {
			center : new kakao.maps.LatLng(37.57025451352222, 126.98295506457401), // 지도의 중심좌표
			level : 5
		// 지도의 확대 레벨 
		};

		var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
	
		function zoomIn() {        
		    // 현재 지도의 레벨을 얻어옵니다
		    var level = map.getLevel();
		    // 지도를 1레벨 내립니다 (지도가 확대됩니다)
		    map.setLevel(level - 1);
		    // 지도 레벨을 표시합니다
		    displayLevel();
		}    

		function zoomOut() {    
		    // 현재 지도의 레벨을 얻어옵니다
		    var level = map.getLevel(); 
		    // 지도를 1레벨 올립니다 (지도가 축소됩니다)
		    map.setLevel(level + 1);
		    // 지도 레벨을 표시합니다
		    displayLevel(); 
		}    
		
		// HTML5의 geolocation으로 사용할 수 있는지 확인합니다 
		if (navigator.geolocation) {

			// GeoLocation을 이용해서 접속 위치를 얻어옵니다
			navigator.geolocation.getCurrentPosition(function(position) {

				var lat = position.coords.latitude, // 위도
					lon = position.coords.longitude; // 경도

				var locPosition = new kakao.maps.LatLng(lat, lon), // 마커가 표시될 위치를 geolocation으로 얻어온 좌표로 생성합니다
				message = '<div style="padding:5px;">사람 정보입력</div>'; // 인포윈도우에 표시될 내용입니다
				

				// 마커와 인포윈도우를 표시합니다
				displayMarker(locPosition);
				
			});

		} else { // HTML5의 GeoLocation을 사용할 수 없을때 마커 표시 위치와 인포윈도우 내용을 설정합니다
			var message = 'geolocation을 사용할수 없어요..'
			displayMarker(message);
		}

		// 지도에 마커와 인포윈도우를 표시하는 함수입니다
		function displayMarker(locPosition) {

			// 마커를 생성합니다
			var marker = new kakao.maps.Marker({
				map : map,
				position : locPosition
			});

			var iwContent = message, // 인포윈도우에 표시할 내용
			iwRemoveable = true;

			// 인포윈도우를 생성합니다
			var infowindow = new kakao.maps.InfoWindow({
				content : iwContent,
				removable : iwRemoveable
			});

			// 인포윈도우를 마커위에 표시합니다 
			infowindow.open(map, marker);

			// 지도 중심좌표를 접속위치로 변경합니다
			map.setCenter(locPosition);
		} 
	</script>
</body>
</html>