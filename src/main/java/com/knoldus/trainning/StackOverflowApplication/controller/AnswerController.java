package com.knoldus.trainning.StackOverflowApplication.controller;

import com.knoldus.trainning.StackOverflowApplication.entity.Answer;
import com.knoldus.trainning.StackOverflowApplication.service.AnswerService;
import com.knoldus.trainning.StackOverflowApplication.vo.request.AnswerViewRequest;
import com.knoldus.trainning.StackOverflowApplication.vo.responce.AnswerResponce;
import com.knoldus.trainning.StackOverflowApplication.vo.responce.AnswerResponseWithView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users/question/answer")
public class AnswerController {

  @Autowired private AnswerService answerService;

  Long totalNumberOfViews = 0l;

  @PostMapping("/add")
  public Long addAnswer(@Valid @RequestBody @Min(value = 1, message = "Minimum 1 value required") AnswerViewRequest answerViewRequest) {
    return answerService.save(answerViewRequest);
  }

  @GetMapping("/get/{id}")
  public AnswerResponseWithView getAnswerById(@PathVariable Long id) {
    totalNumberOfViews++;
    AnswerResponseWithView answerResponce = new AnswerResponseWithView();
    Optional<Answer> optionalEntity =  answerService.getAnswersById(id);
    Answer answer = optionalEntity.get();
    answerResponce.setInputAnswer(answer.getInputAnswer());
    answerResponce.setTotalView(totalNumberOfViews);
    answerResponce.setQuestionId(answer.getId());
    answerResponce.setCreatedAt(answer.getCreatedAt());
    answerResponce.setUpdatedAt(answer.getUpdatedAt());
    return answerResponce;
  }

  @DeleteMapping("/delete/{id}")
  public void deleteAnswerById(@PathVariable Long id) {
    answerService.deleteAnswer(id);
  }

  @PutMapping("/update/{id}")
  public AnswerResponce updateAnswerById(@PathVariable Long id,
                                         @RequestBody AnswerViewRequest answerViewRequest) {
//    answer.setQuestion(new Question(questionId, "", "", new User()));
    return answerService.updateAnswer(id, answerViewRequest);
  }

  @GetMapping("/getAll/{questionId}")
  public List<AnswerResponce> getAllAnswer(@PathVariable Long questionId) {
    return answerService.getAllAnswers(questionId);
  }
}
