package com.love320.zpro.code;

import java.io.IOException;
import java.sql.SQLException;
import org.springframework.beans.factory.BeanFactory;

import com.love320.zpro.code.services.UserService;

import junit.framework.TestCase;

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
		
		//runstop();//
	}
	
	
}
