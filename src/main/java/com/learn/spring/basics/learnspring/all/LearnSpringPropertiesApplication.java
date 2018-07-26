package com.learn.spring.basics.learnspring.all;

import com.learn.spring.basics.learnspring.all.basic.BinarySearchImpl;
import com.learn.spring.basics.learnspring.all.properties.ExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.learn.spring.basics.learnspring")
@PropertySource("app.properties")
public class LearnSpringPropertiesApplication {

	public static void main(String[] args) {

        // BinarySearchImpl binarySearch =
        // new BinarySearchImpl(new QuickSortAlgorithm());
        // Application Context
        try (AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(LearnSpringPropertiesApplication.class)) {
            ExternalService externalService =
                    applicationContext.getBean(ExternalService.class);
            System.out.println(externalService);
            System.out.println(externalService.returnServiceURL());
        }
    }
}
