package com.user.user_service.service.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.user_service.entity.User;
import com.user.user_service.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	//we here create some dummy data
	
	List<User> list = Arrays.asList(
			new User(1201L,"Ganesh Parmar","6266959065"),
			new User(1202L,"Gunjan Parmar","9522752019"),
			new User(1203L,"Yash Parmar","7974929892")
			);
	
	
	@Override
	public User getUser(long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user -> user.getUserId() == id).findAny().orElse(null);
	}

}
