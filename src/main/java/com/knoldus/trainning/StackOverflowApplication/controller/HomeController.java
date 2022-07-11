package com.knoldus.trainning.StackOverflowApplication.controller;

import com.knoldus.trainning.StackOverflowApplication.entity.UserCO;
import com.knoldus.trainning.StackOverflowApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public ModelAndView homePage() {
        ModelAndView mv = new ModelAndView("home");

        return mv;
    }

    @GetMapping("/new")
    public ModelAndView newForm()
    {
        ModelAndView mv = new ModelAndView("user_form");
        mv.addObject("user",new UserCO());
        return mv;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("User") UserCO user)
    {
        ModelAndView mv = new ModelAndView("redirect:/");
        userRepository.save(user);
        return mv;
    }

    /**
     *
     * @return home page  .
     */
    @GetMapping("/user/home")
    public String userDetails() {

        return "Hello";
    }
}

