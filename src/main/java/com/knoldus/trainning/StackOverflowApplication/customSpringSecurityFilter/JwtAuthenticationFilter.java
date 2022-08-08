//package com.knoldus.trainning.StackOverflowApplication.customSpringSecurityFilter;
//
//import com.knoldus.trainning.StackOverflowApplication.entity.User;
//import com.knoldus.trainning.StackOverflowApplication.entity.UserFilter;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.RememberMeAuthenticationToken;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.filter.OncePerRequestFilter;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Set;
//
//@Component
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//    static{
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("KRISHNA","ADMIN");
//        hashMap.put("SHAKTI","USER");
//    }
//    @Override
//    protected void doFilterInternal(HttpServletRequest request,
//                                    HttpServletResponse response,
//                                    FilterChain filterChain)
//            throws ServletException, IOException {
//        System.out.println("Inside JWT");
//        String username="KRISHNA";
//        System.out.println("Authority is");
//        JwtAuthenticationFilter jwtAuthenticationFilter = new JwtAuthenticationFilter();
//        Set<GrantedAuthority> authorities = new HashSet<>();
//        authorities.add(new SimpleGrantedAuthority("ADMIN"));
//        System.out.println("Authority is");
//        System.out.println(authorities);
//        UserFilter user = new UserFilter(username,"", authorities);
//
//        RememberMeAuthenticationToken authentication =
//                new RememberMeAuthenticationToken(username, user,
//                        Collections.unmodifiableCollection(authorities));
//        System.out.println(authentication);
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        System.out.println("Outside JWT");
//        filterChain.doFilter(request,response);
//
//    }
//}
