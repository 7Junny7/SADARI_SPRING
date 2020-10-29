package co.soft.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

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
		UserInfoBean userInfoBean = (UserInfoBean)target;
		
		String beanName = errors.getObjectName();
		
		if(beanName.equals("joinUserBean") || beanName.equals("modifyUserBean")) {
			if(userInfoBean.getUserPassword().equals(userInfoBean.getUserPassword()) == false) {
				errors.rejectValue("userpassward", "NotEquals");
				errors.rejectValue("userpassward", "NotEquals");
			}
		}
			
		if(beanName.equals("joinUserBean")) {
			
			if(userInfoBean.isUserIdExist() == false) {
				errors.rejectValue("userid", "DontCheckUserIdExist");
			}
		}
	}
	
}
