package com.jpa.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user = new User();
//		user.setName("Jasmine");
//		user.setCity("Goa");
//		user.setStatus("Active");
//		User user1 = new User();
//		user1.setName("Jack");
//		user1.setCity("Leo");
//		user1.setStatus("Active");
//		List<User> list = new ArrayList<>();
//		list.add(user1);
//		list.add(user);
//		Save the ultiple objects
//		userRepository.saveAll(list);
//		list.forEach(user2->{
//			System.out.println(user2);
//		});
		
//		Update the use id 253 and get one data as object
		
		
//		Optional<User> optional = userRepository.findById(253);
//		User user = optional.get();
//		user.setName("Coomon jasmine");
//		userRepository.save(user);
//		System.out.println(user);
		
		
//		to et all data from database 
		
		Iterable<User> itr = userRepository.findAll();
		itr.forEach(user->{
			System.out.println(user);
		});
		
	}

}
