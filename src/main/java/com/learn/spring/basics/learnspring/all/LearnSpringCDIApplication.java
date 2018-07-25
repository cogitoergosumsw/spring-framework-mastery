package com.learn.spring.basics.learnspring.all;

import com.learn.spring.basics.learnspring.all.cdi.CDIFile;
import com.learn.spring.basics.learnspring.all.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(LearnSpringCDIApplication.class);

	public static void main(String[] args) {
        // Application Context
        ApplicationContext applicationContext =
                SpringApplication.run(LearnSpringCDIApplication.class, args);

        CDIFile cdiFile =
                applicationContext.getBean(CDIFile.class);

        LOGGER.info("{}", cdiFile);
	}
}
