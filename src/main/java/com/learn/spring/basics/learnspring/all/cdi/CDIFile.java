package com.learn.spring.basics.learnspring.all.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by didi on 2018/7/25.
 */

@Named
public class CDIFile {
    @Inject
    CDIFileDAO cdiFileDAO;

    public CDIFileDAO getCdiFileDAO() {
        return cdiFileDAO;
    }

    public void setCdiFileDAO(CDIFileDAO cdiFileDAO) {
        this.cdiFileDAO = cdiFileDAO;
    }

    public int findGreatest() {
        int greatest = Integer.MIN_VALUE;
        int[] data = cdiFileDAO.getData();
        for (int value : data) {
            if (value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }
}
