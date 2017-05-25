package com.martinetherton.mysite;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

/**
 * Created by martin on 17/05/17.
 */
@Configuration
@EnableWebMvcSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity webSecurity) throws Exception {
        webSecurity
                .ignoring()
                .antMatchers("/resources/**");
        webSecurity
                .ignoring()
                .antMatchers("/*.js");



//        webSecurity
//                .ignoring()
//                // All of Spring Security will ignore the requests
//                .antMatchers(HttpMethod.POST, "/assignment_callback.json")
//        ;

//        webSecurity
//                .ignoring()
//                // All of Spring Security will ignore the requests
//                .antMatchers(HttpMethod.POST, "/enqueue_call")
//        ;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/signup","/about", "/", "/service-worker.js").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .and()
                .httpBasic();
    }

}
