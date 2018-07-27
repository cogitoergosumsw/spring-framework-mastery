package com.learn.spring.basics.learnspring.all.cdi;

import org.springframework.stereotype.Component;

import javax.inject.Named;

/**
 * Created by didi on 2018/7/25.
 */

@Named
public class CDIFileDAO {
    public int[] getData() {
        return new int[]{5, 89, 100};
    }
}
