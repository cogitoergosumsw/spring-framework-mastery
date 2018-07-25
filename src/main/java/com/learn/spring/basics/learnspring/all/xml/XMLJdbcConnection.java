package com.learn.spring.basics.learnspring.all.xml;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by didi on 2018/7/25.
 */

public class XMLJdbcConnection {

    public XMLJdbcConnection() {
        System.out.println("XML JDBC Connection");
    }
}
