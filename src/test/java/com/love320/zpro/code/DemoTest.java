package com.love320.zpro.code;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.BeanFactory;

import com.love320.zpro.code.entity.User;
import com.love320.zpro.code.services.UserService;

public class DemoTest extends TestCase {
	
	private boolean isserver = false;
	
	private void runstop(){
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void runH2(){
		if(isserver) return;
		H2Server h2server = new H2Server();
		try {
			h2server.runTool(null);
			isserver = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testAppSpring(){
		runH2();//
		
		BeanFactory srping = Spring.getSpring();
		System.out.println(srping.getBean(UserService.class));
		
		runstop();//
	}
	
	//like %% 查询方法
	public void testName(){
		runH2();//
		
		BeanFactory srping = Spring.getSpring();
		UserService user = srping.getBean(UserService.class);
		
		Map<String,Object> pare = new HashMap<String,Object>();
		pare.put("VS_~_name", "中国");
		List list = user.list(pare);
		System.out.println(list.size());
	}
	
	public void test2Name(){
		runH2();//
		
		BeanFactory srping = Spring.getSpring();
		UserService user = srping.getBean(UserService.class);
		
		Map<String,Object> pare = new HashMap<String,Object>();
		pare.put("VS_~_name|email", "习");
		List list = user.list(pare);
		System.out.println(list.size());
		
	}
	
	
	public void testAddUser(){
		runH2();//
		
		BeanFactory srping = Spring.getSpring();
		UserService user = srping.getBean(UserService.class);
		User entity = new User();
		entity.setName("习惯");
		entity.setEmail("lb@love320.com");
		
		user.save(entity);
	}
	
	public void testString(){
		System.out.println(StringUtils.substringAfterLast("说好点什么好呢", "好"));
	}
		
	
}
