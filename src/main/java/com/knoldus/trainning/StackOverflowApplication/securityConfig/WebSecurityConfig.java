//package com.knoldus.trainning.StackOverflowApplication.securityConfig;
//
//import com.knoldus.trainning.StackOverflowApplication.filter.CustomBeforeAuthenticationFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.BeanIds;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().addFilterBefore(customBeforeAuthenticationFilter, CustomBeforeAuthenticationFilter.class)
//                .formLogin()
//                .loginPage("/login")
//                .usernameParameter("email")
//                .permitAll();
//    }
//
//
//    @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
//    @Override
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
//
//    @Autowired
//    public CustomBeforeAuthenticationFilter customBeforeAuthenticationFilter;
//
//}