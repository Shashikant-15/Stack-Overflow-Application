package com.knoldus.trainning.StackOverflowApplication.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("user/{userId}/questions")
@AllArgsConstructor
@RestController
public class QuestionController {


    @PostMapping()
    public void addNewQuestion( ) {

    }


    @GetMapping("/{id}")
    public void getQuestionById(@PathVariable Long id ) {

    }
    @GetMapping()
    public void getAllQuestionByUserId(@PathVariable Long userId ) {

    }

    @DeleteMapping("/{id}")
    public void deleteQuestionById(@PathVariable Long id) {

    }


    @PutMapping("/{id}")
    public void updateQuestionById(){

    }


}
