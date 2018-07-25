package com.learn.spring.basics.learnspring.all;

import com.learn.spring.basics.learnspring.all.cdi.CDIFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class LearnSpringCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(LearnSpringCDIApplication.class);

	public static void main(String[] args) {
        // Application Context
        try (AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(LearnSpringCDIApplication.class)) {
            CDIFile cdiFile =
                    applicationContext.getBean(CDIFile.class);

            LOGGER.info("{}", cdiFile);
        }
    }
}
