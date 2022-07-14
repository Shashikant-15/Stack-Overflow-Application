package com.knoldus.trainning.StackOverflowApplication.controller;

import com.knoldus.trainning.StackOverflowApplication.entity.Answer;
import com.knoldus.trainning.StackOverflowApplication.entity.Question;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question/{questionId}/answers")
public class AnswerController {
    @PostMapping()
    public void addAnswer(@RequestBody Answer answer, @PathVariable Long questionId) {
        answer.setQuestion(new Question(questionId, "", ""));
    }

    @GetMapping("/{id}")
    public void getAnswerById(@PathVariable Long id) {
    }

    @GetMapping()
    public void getAllAnswerByQuestionId(@PathVariable Long userId) {
    }

    @DeleteMapping("/{id}")
    public void deleteAnswerById(@PathVariable Long id) {
    }

    @PutMapping("/{id}")
    public void updateAnswerById(@RequestBody Answer answer, @PathVariable Long questionId){
        answer.setQuestion(new Question(questionId, "", ""));
    }
}
