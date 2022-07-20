package com.knoldus.trainning.StackOverflowApplication.controller;

import com.knoldus.trainning.StackOverflowApplication.entity.Question;
import com.knoldus.trainning.StackOverflowApplication.service.QuestionService;
import com.knoldus.trainning.StackOverflowApplication.vo.request.QuestionViewRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user/question")
public class QuestionController {

  @Autowired
  private QuestionService questionService;

  @PostMapping("/add")
  public void addNewQuestion(@RequestBody QuestionViewRequest questionViewRequest) {
    questionService.save(questionViewRequest);
  }

  @GetMapping("/get/{id}")
  public Optional<Question> getQuestionById(@PathVariable Long id) {
    Optional<Question> question = questionService.getQuestionById(id);
    return question;
  }

  @GetMapping("/get")
  public List<Question> getAllQuestionByUserId() {
    return questionService.getAllQuestions();
  }

  @DeleteMapping("/delete/{id}")
  public void deleteQuestionById(@PathVariable Long id) {
    questionService.deleteById(id);
  }

  @PutMapping("/update/{id}")
  public Question updateQuestionById(@PathVariable(value = "id") Long id,
                                 @RequestBody Question question) {
    return questionService.updateQuestion(id, question);
  }
}
