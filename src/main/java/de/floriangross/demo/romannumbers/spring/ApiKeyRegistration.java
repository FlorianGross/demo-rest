package de.floriangross.demo.romannumbers.spring;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ApiKeyRegistration {
    @Bean
    public FilterRegistrationBean<ApiKeyFilter> apiKeyFilterFilter() {
        FilterRegistrationBean<ApiKeyFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new ApiKeyFilter());
        registrationBean.addUrlPatterns("/roman-numbers/*");

        return registrationBean;
    }
}
