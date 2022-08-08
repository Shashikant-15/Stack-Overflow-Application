package com.knoldus.trainning.StackOverflowApplication.securityConfig;

import com.knoldus.trainning.StackOverflowApplication.customSpringSecurityFilter.AdvanceCustomBeforeAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Autowired private UserDetailsService userDetailsService;

//  @Autowired
//  JwtAuthenticationFilter jwtAuthenticationFilter;

    @Bean
    AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        return provider;
    }


//
//    private static final String[] AUTH_LIST = {
//            // -- swagger ui
//            "**/swagger-resources/**", "/swagger-ui.html", "/v2/api-docs", "/webjars/**"
//    };

  private static final String[] AUTH_LIST = {
    // -- swagger ui
    "**/swagger-resources/**", "/swagger-ui.html", "/v2/api-docs", "/webjars/**"
  };



  @Override
  protected void configure(HttpSecurity http) throws Exception {
      http.authorizeRequests()
        .antMatchers(AUTH_LIST)
        .permitAll()
        .antMatchers("/", "/new", "/save")
        .permitAll()
        .anyRequest()
        .authenticated()
        .and()
            .addFilterBefore(customBeforeAuthenticationFilter, AdvanceCustomBeforeAuthenticationFilter.class)
            .formLogin()
            .and()
            .oauth2Login()
        .and()
        .httpBasic()
            .and().csrf().disable();

//      http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);;



//    http.authorizeRequests()
//            .antMatchers(AUTH_LIST)
//            .permitAll()
//            .antMatchers("/", "/new", "/save")
//            .permitAll()
//            .antMatchers("/user/home")
//            .hasRole("admin")
//            .anyRequest()
//            .authenticated()
//            .and()
//            .formLogin()
//            .and()
//            .oauth2Login()
//            .and()
//            .httpBasic()
//            .and().csrf().disable();
  }

//    public UsernamePasswordAuthenticationFilter getBeforeAuthenticationFilter() throws Exception {
//        CustomBeforeAuthenticationFilter filter = new CustomBeforeAuthenticationFilter();
//        filter.setAuthenticationManager(authenticationManager());
//        filter.setAuthenticationFailureHandler(new SimpleUrlAuthenticationFailureHandler() {
//
//            @Override
//            public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
//                                                AuthenticationException exception) throws IOException, ServletException {
//                System.out.println("Login error: " + exception.getMessage());
//                super.setDefaultFailureUrl("/login?error");
//                super.onAuthenticationFailure(request, response, exception);
//            }
//
//        });
//
//        return filter;
//    }

    @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Autowired
    public AdvanceCustomBeforeAuthenticationFilter customBeforeAuthenticationFilter;

}
