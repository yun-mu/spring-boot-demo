package com.example.learn.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class WebSecureConfig  {

    @Value("${app.secret}")
    private String secret;

    @Value("#{'${excluded-urls}'.split(',')}")
    private List<String> excludedURLs;

    @Bean
    public FilterRegistrationBean jwtFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new JWTFilter(secret, excludedURLs));
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
