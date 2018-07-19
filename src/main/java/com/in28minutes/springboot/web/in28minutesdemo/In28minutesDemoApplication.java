package com.in28minutes.springboot.web.in28minutesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class In28minutesDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(In28minutesDemoApplication.class, args);
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		System.out.println(""+binarySearch.binarySearch(new int[] {124, 6}, 3));
	}
}
