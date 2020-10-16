package com.liu.config;


import com.liu.Interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(new MyInterceptor()).
                    addPathPatterns("/user/**").
                    excludePathPatterns("/user/findAll","/user/save");
    }
}
