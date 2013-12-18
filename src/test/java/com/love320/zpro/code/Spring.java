package com.love320.zpro.code;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Spring {
	
	private static BeanFactory factory = new FileSystemXmlApplicationContext("classpath:app.xml");
	
	public static BeanFactory getSpring(){
		return factory;
	}
	
	public static Object getBean(String name){
		return factory.getBean(name);
	}
	
}
