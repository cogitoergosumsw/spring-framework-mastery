package com.learn.spring.basics.learnspring.all;

import com.learn.spring.basics.learnspring.all.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class LearnSpringScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(LearnSpringScopeApplication.class);

	public static void main(String[] args) {
        // Application Context
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(LearnSpringScopeApplication.class);

        PersonDAO personDAO =
                applicationContext.getBean(PersonDAO.class);

        PersonDAO personDAO2 =
                applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getJdbcConnection());
        LOGGER.info("{}", personDAO.getJdbcConnection());
        LOGGER.info("{}", personDAO2);
        LOGGER.info("{}", personDAO2.getJdbcConnection());
	}
}
