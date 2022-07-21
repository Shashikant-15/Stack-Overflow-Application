package com.knoldus.trainning.StackOverflowApplication.controller;

import com.knoldus.trainning.StackOverflowApplication.entity.Answer;
import com.knoldus.trainning.StackOverflowApplication.entity.Question;
import com.knoldus.trainning.StackOverflowApplication.entity.User;
import com.knoldus.trainning.StackOverflowApplication.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users/question/answer")
public class AnswerController {

  @Autowired private AnswerService answerService;

  @PostMapping("/add")
  public void addAnswer(@RequestBody Answer answer, @PathVariable Long questionId) {

  }

  @GetMapping("/get/{id}")
  public Optional<Answer> getAnswerById(@PathVariable Long id) {
    return answerService.getAllAnswersById(id);
  }

  @GetMapping("/getAll")
  public List<Answer> getAllAnswerByQuestionId(@PathVariable Long questionId) {
    return answerService.getAllAnswers(questionId);
  }

  @DeleteMapping("/delete/{id}")
  public void deleteAnswerById(@PathVariable Long id) {
    answerService.deleteAnswer(id);
  }

  @PutMapping("/update/{id}")
  public void updateAnswerById(@RequestBody Answer answer, @PathVariable Long questionId) {
//    answer.setQuestion(new Question(questionId, "", "", new User()));
    answerService.updateAnswer(answer);
  }
}
