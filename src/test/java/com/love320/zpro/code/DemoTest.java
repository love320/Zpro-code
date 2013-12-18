package com.love320.zpro.code;

import org.springframework.beans.factory.BeanFactory;

import com.love320.zpro.code.services.UserService;

import junit.framework.TestCase;

public class DemoTest extends TestCase {
	
	public void testAppSpring(){
		BeanFactory srping = Spring.getSpring();
		System.out.println(srping.getBean(UserService.class));
	}
	
}
