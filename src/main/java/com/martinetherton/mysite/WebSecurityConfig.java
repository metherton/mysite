//package com.martinetherton.mysite;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
//
///**
// * Created by martin on 17/05/17.
// */
//@Configuration
//@EnableWebMvcSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    public void configure(WebSecurity webSecurity) throws Exception {
//        webSecurity
//                .ignoring()
//                .antMatchers("/resources/**");
//        webSecurity
//                .ignoring()
//                .antMatchers("/*.js");
////        webSecurity.ignoring()
////                .antMatchers("/login");
//
//
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/home", "/signup","/about", "/", "/service-worker.js").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin().loginPage("/login").permitAll()
//                .and()
//                .logout()
//                .permitAll()
//                .and()
//                .httpBasic();
//    }
//
//}
