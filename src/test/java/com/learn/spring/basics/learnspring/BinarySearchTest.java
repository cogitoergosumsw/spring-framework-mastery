package com.learn.spring.basics.learnspring;

import com.learn.spring.basics.learnspring.all.LearnSpringApplication;
import com.learn.spring.basics.learnspring.all.basic.BinarySearchImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by didi on 2018/7/27.
 */

//load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = LearnSpringApplication.class)
public class BinarySearchTest {

    //get the bean from context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
//      call method on binarySearch
        int result = binarySearch.binarySearch(new int[]{}, 5);
        Assert.assertEquals(3, result);
    }
}
