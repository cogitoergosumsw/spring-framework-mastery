package com.learn.spring.basics.learnspring.all;

import com.learn.spring.basics.learnspring.all.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learn.spring.basics.learnspring")
public class LearnSpringApplication {

	public static void main(String[] args) {

        // BinarySearchImpl binarySearch =
        // new BinarySearchImpl(new QuickSortAlgorithm());
        // Application Context
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(LearnSpringApplication.class);
        BinarySearchImpl binarySearch =
                applicationContext.getBean(BinarySearchImpl.class);
        int result =
                binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
        System.out.println(result);
        applicationContext.close();
	}
}
