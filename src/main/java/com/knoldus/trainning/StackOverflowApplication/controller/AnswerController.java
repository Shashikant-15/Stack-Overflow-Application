package com.knoldus.trainning.StackOverflowApplication.controller;

import com.knoldus.trainning.StackOverflowApplication.entity.Answer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question/{questionId}/answers")
public class AnswerController {

    @GetMapping
    public List<Answer> getAllAnswers(@PathVariable String questionId) {
        
    }

    @PostMapping
    public void addAnswer(@RequestBody Question question, @PathVariable String questionId) {

    }
}
