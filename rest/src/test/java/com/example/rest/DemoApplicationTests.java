package com.example.rest;

import com.example.core.model.User;
import com.example.core.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		List<User> users = userService.getUserList();
		System.out.println(users.get(0).getUsername());
	}
	@Test
	public void passwordLoads(){
		User user = userService.findByUsername("user");
		System.out.println(user.getUsername());
	}
}
