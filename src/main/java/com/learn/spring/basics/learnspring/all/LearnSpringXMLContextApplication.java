package com.learn.spring.basics.learnspring.all;

import com.learn.spring.basics.learnspring.all.basic.BinarySearchImpl;
import com.learn.spring.basics.learnspring.all.xml.XMLPersonDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class LearnSpringXMLContextApplication {

	public static void main(String[] args) {

        // BinarySearchImpl binarySearch =
        // new BinarySearchImpl(new QuickSortAlgorithm());
        // Application Context
        try (ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml")) {
            XMLPersonDAO xmlPersonDAO =
                    applicationContext.getBean(XMLPersonDAO.class);

            System.out.println(xmlPersonDAO);
            System.out.println(xmlPersonDAO.getXmlJdbcConnection());
        };
	}
}
