package com.learn.spring.basics.learnspring.all;

import com.learn.spring.basics.learnspring.all.basic.BinarySearchImpl;
import com.learn.spring.basics.learnspring.all.xml.XMLPersonDAO;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LearnSpringXMLContextApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(LearnSpringXMLContextApplication.class);
	public static void main(String[] args) {

        // Application Context
        try (ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml")) {

            LOGGER.info("Beans loaded - {}", (Object) applicationContext.getBeanDefinitionNames());

            XMLPersonDAO xmlPersonDAO =
                    applicationContext.getBean(XMLPersonDAO.class);

//            System.out.println(xmlPersonDAO);
//            System.out.println(xmlPersonDAO.getXmlJdbcConnection());

            LOGGER.info("xmlPersonDAO - {}, xmlJdbcConnection - {}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection());
        };
	}
}
