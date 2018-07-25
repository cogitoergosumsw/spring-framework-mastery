package com.learn.spring.basics.learnspring.all;

import com.learn.spring.basics.learnspring.componentscans.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.learn.spring.basics.learnspring.componentscans")
public class LearnSpringComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(LearnSpringComponentScanApplication.class);

	public static void main(String[] args) {
        // Application Context
        ApplicationContext applicationContext =
                SpringApplication.run(LearnSpringComponentScanApplication.class, args);

        ComponentDAO componentDAO =
                applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO);
	}
}
