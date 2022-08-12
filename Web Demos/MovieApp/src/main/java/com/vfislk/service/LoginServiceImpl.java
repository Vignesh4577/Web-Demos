package com.vfislk.service;

import java.util.stream.Stream;

public class LoginServiceImpl implements ILoginService {

	String[] usernames= {"jack","tom","Jerry","chota Bheem"};
//	String npassword="vfi@123";
	@Override
	public boolean validateUserName(String username, String password) {
		
//
//		for(String name:usernames) {
//		    if(name.equals(username))
//		    	return true;
//		
//		}
//		if(password.equals(npassword))
//			return true;
//		
//		return false;
		
		return Stream.of(usernames) //converts array to stream
				.filter(str->str.equals(username) && password.equals("vfi@123")) //filter
				.findAny()
				.isPresent();
		
		
		
		
	}

	
	
}
