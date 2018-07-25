package com.learn.spring.basics.learnspring.all;

import com.learn.spring.basics.learnspring.all.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {

        // BinarySearchImpl binarySearch =
        // new BinarySearchImpl(new QuickSortAlgorithm());
        // Application Context
        ApplicationContext applicationContext =
                SpringApplication.run(LearnSpringApplication.class, args);
        BinarySearchImpl binarySearch =
                applicationContext.getBean(BinarySearchImpl.class);
        int result =
                binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
        System.out.println(result);
	}
}
