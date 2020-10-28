package co.soft.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import co.soft.beans.UserBean;
import co.soft.beans.UserInfoBean;

public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return UserInfoBean.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		UserInfoBean userBean = (UserInfoBean)target;
		
		String beanName = errors.getObjectName();
		
		if(beanName.equals("joinUserBean") || beanName.equals("modifyUserBean")) {
			if(userBean.getUser_pw().equals(userBean.getUser_pw2()) == false) {
				errors.rejectValue("user_pw", "NotEquals");
				errors.rejectValue("user_pw2", "NotEquals");
			}
		}
			
		if(beanName.equals("joinUserBean")) {
			
			if(userBean.isUserIdExist() == false) {
				errors.rejectValue("user_id", "DontCheckUserIdExist");
			}
		}
	}
	
}
