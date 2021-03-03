package com.bsg5.chapter6;

import org.jtwig.spring.JtwigViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.bsg5.chapter6", "com.beginning_spring.chapter3.mem03"})
public class GatewayAppWebConfig implements WebMvcConfigurer {
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.viewResolver(jtwigViewResolver());
    }

    @Bean
    public ViewResolver jtwigViewResolver() {
        JtwigViewResolver viewResolver = new JtwigViewResolver();
        viewResolver.setPrefix("web:/WEB-INF/templates/");
        //This is how we are returning "greeting" in com.bsg5.chapter6.GreetingWithModelController.greeting
        viewResolver.setSuffix(".html");
        return viewResolver;
    }
}
