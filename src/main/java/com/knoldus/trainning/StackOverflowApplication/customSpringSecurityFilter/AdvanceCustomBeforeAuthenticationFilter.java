package com.knoldus.trainning.StackOverflowApplication.customSpringSecurityFilter;

import com.knoldus.trainning.StackOverflowApplication.entity.User;
import com.knoldus.trainning.StackOverflowApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Component
public class AdvanceCustomBeforeAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    @Autowired
    private UserService userService;

    @Autowired
    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        super.setAuthenticationManager(authenticationManager);
    }

    @Autowired
    @Override
    public void setAuthenticationFailureHandler(AuthenticationFailureHandler failureHandler) {
        super.setAuthenticationFailureHandler(failureHandler);
    }

    @Autowired
    @Override
    public void setAuthenticationSuccessHandler(AuthenticationSuccessHandler successHandler) {
        super.setAuthenticationSuccessHandler(successHandler);
    }

    public void CustomBeforeAuthenticationFilter() {
        setUsernameParameter("username");
        super.setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher(
                "/login", "POST"));
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException {

        String username = request.getParameter("username");
        Optional<User> user = userService.getUser(1l);
        User user1 = user.get();
        System.out.println(user1);
        System.out.println(username);
        return super.attemptAuthentication(request, response);
    }
}
