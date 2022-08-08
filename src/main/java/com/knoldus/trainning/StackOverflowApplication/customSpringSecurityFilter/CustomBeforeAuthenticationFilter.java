//package com.knoldus.trainning.StackOverflowApplication.customSpringSecurityFilter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//public class CustomBeforeAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
//    public CustomBeforeAuthenticationFilter() {
//        setUsernameParameter("username");
//        super.setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher("/login",
//                "POST"));
//    }
//
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request,
//                                                HttpServletResponse response)
//            throws AuthenticationException {
//        String email = request.getParameter("username");
//        System.out.println("The user " + email + " is about to login");
//        return super.attemptAuthentication(request, response);
//    }
//}
