package com.love320.zpro.code.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.love320.zpro.code.bean.Page;
import com.love320.zpro.code.entity.User;

@Service
public class UserService extends BaseService<User> {
	
	public Page find(Page page,Map parameterMap){
		return super.find(page,parameterMap);
	}
	
	public List list(Map parameterMap){
		return super.list(parameterMap);
	}
	
	public boolean save(User entity) {
		entity = super.add(entity);
		if(entity.getId() != null && entity.getId() > 0){
			return true;
		}else{
			return false;
		}
	} 

}
