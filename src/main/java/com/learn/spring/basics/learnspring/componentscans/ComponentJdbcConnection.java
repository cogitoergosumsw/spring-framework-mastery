package com.learn.spring.basics.learnspring.componentscans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by didi on 2018/7/25.
 */

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcConnection {

    public ComponentJdbcConnection() {
        System.out.println("Component JDBC Connection");
    }
}
