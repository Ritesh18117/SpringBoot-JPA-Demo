package com.jpaexample.jpa;

import com.jpaexample.jpa.dao.UserRepository;
import com.jpaexample.jpa.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

//		Creating a User "Create"=======================================================
		User user = new User();
		user.setName("Prachi");
		user.setCity("Sitamarhi");
		user.setState("Bihar");
		user.setCountry("India");
		User user1 = userRepository.save(user);
		System.out.println(user1);

//		Read=====================================================================
//		Optional<User> optional = userRepository.findById(552);
//		optional.ifPresent(x->{
//			System.out.println(x.getIdUser());
//			System.out.println(x.getName());
//			System.out.println(x.getCity());
//			System.out.println(x.getState());
//			System.out.println(x.getCountry());
//		});
//
//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while (iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println("ID: " + user.getIdUser());
//			System.out.println("Name: " + user.getName());
//			System.out.println("Email: " + user.getCity());
//			// Print other user properties as needed
//			System.out.println();
//		}

//		Update
//		Optional<User> optional = userRepository.findById(552);
//		User user = optional.get();
//		System.out.println(user);
//		System.out.println();
//		user.setName("Ritesh Kumar Gupta");
//		User u = userRepository.save(user);
//		System.out.println(u);

//		Delete
//		userRepository.deleteById(602);

//		List<User> user = userRepository.findByName("Prachi");
//		user.forEach(u-> System.out.println(u));
//
//		userRepository.deleteAll(user);
	}
}
