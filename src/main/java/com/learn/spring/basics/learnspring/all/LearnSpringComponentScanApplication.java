package com.learn.spring.basics.learnspring.all;

import com.learn.spring.basics.learnspring.componentscans.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learn.spring.basics.learnspring.componentscans")
public class LearnSpringComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(LearnSpringComponentScanApplication.class);

	public static void main(String[] args) {
        // Application Context
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(LearnSpringComponentScanApplication.class);

        ComponentDAO componentDAO =
                applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO);
	}
}
