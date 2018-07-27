package com.learn.spring.basics.learnspring;

import com.learn.spring.basics.learnspring.all.LearnSpringApplication;
import com.learn.spring.basics.learnspring.all.basic.BinarySearchImpl;
import com.learn.spring.basics.learnspring.all.cdi.CDIFile;
import com.learn.spring.basics.learnspring.all.cdi.CDIFileDAO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by didi on 2018/7/27.
 */

//load the context
@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes = LearnSpringApplication.class)
public class CDIFileTest {

    //get the bean from context
    @InjectMocks
    CDIFile cdiFile;

    @Mock
    CDIFileDAO cdiFileDAO;

    @Test
    public void testBasicScenario() {
//      call method on binarySearch
        Mockito.when(cdiFileDAO.getData()).thenReturn(new int[]{4, 10});
        int result = cdiFile.findGreatest();
        Assert.assertEquals(10, result);
    }

    @Test
    public void testNoElementScenario() {
//      call method on binarySearch
        Mockito.when(cdiFileDAO.getData()).thenReturn(new int[]{});
        int result = cdiFile.findGreatest();
        Assert.assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void testSameElementsScenario() {
//      call method on binarySearch
        Mockito.when(cdiFileDAO.getData()).thenReturn(new int[]{4, 4});
        int result = cdiFile.findGreatest();
        Assert.assertEquals(4, result);
    }
}
