package com.knoldus.trainning.StackOverflowApplication.controller;

import com.knoldus.trainning.StackOverflowApplication.entity.QuestionPost;
import com.knoldus.trainning.StackOverflowApplication.repository.QuestionRepository;
import com.knoldus.trainning.StackOverflowApplication.service.QuestionService;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/control")
@AllArgsConstructor
@RestController
public class QuestionController {


    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuestionRepository questionRepository;



    @PostMapping("/add")
    public void add( ) {

    }


    @GetMapping("/get/{id}")
    public Optional<QuestionPost> getPostById(@PathVariable("id") Long id) {

        return getPostById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePostById(@PathVariable("id") Long id) {

    }


    @PutMapping("/author/{id}")
    public QuestionPost update(){
        return new  QuestionPost();
    }


}
