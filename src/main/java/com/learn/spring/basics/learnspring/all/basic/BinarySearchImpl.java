package com.learn.spring.basics.learnspring.all.basic;

/**
 * Created by didi on 2018/7/24.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        // Search the array
        return 3;
    }


//    !!! The name of the methods does not matter as long as u put the @PostConstruct and @PreDestroy before the methods
    @PostConstruct
    public void postConstruct() {
        logger.info("Post Construct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("Pre Destroy");
    }

}
