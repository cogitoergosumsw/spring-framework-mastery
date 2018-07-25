package com.learn.spring.basics.learnspring;

import com.learn.spring.basics.learnspring.basic.BinarySearchImpl;
import com.learn.spring.basics.learnspring.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(LearnSpringScopeApplication.class);

	public static void main(String[] args) {
        // Application Context
        ApplicationContext applicationContext =
                SpringApplication.run(LearnSpringScopeApplication.class, args);

        PersonDAO personDAO =
                applicationContext.getBean(PersonDAO.class);

        PersonDAO personDAO2 =
                applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getJdbcConnection());
        LOGGER.info("{}", personDAO2);
        LOGGER.info("{}", personDAO2.getJdbcConnection());
	}
}
