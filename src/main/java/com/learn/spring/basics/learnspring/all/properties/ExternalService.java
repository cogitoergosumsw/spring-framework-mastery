package com.learn.spring.basics.learnspring.all.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by didi on 2018/7/26.
 */
@Component
public class ExternalService {
//    get from property file
    @Value("${external.service.url}")
    private String url;

    public String returnServiceURL() {
        return url;
    }
}
