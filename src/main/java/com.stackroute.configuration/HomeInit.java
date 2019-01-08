package com.stackroute.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HomeInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{HomeConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
}
