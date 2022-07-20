package com.knoldus.trainning.StackOverflowApplication.controller;

import com.knoldus.trainning.StackOverflowApplication.entity.Answer;

import com.knoldus.trainning.StackOverflowApplication.service.AnswerService;
import com.knoldus.trainning.StackOverflowApplication.vo.request.AnswerViewRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user/answer")
public class AnswerController {

  @Autowired private AnswerService answerService;

  @PostMapping("/add")
  public void addAnswer(@RequestBody AnswerViewRequest answerViewRequest) {
    answerService.save(answerViewRequest);

  }

  @GetMapping("/get/{id}")
  public Optional<Answer> getAnswerById(@PathVariable Long id) {
    return answerService.getAnswersById(id);
  }

  @GetMapping("/getAll")
  public List<Answer> getAllAnswer(@PathVariable Long questionId) {
    System.out.println(answerService.getAllAnswers(questionId));
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
