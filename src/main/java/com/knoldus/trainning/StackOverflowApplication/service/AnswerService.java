package com.knoldus.trainning.StackOverflowApplication.service;

import com.knoldus.trainning.StackOverflowApplication.entity.Answer;
import com.knoldus.trainning.StackOverflowApplication.entity.Question;
import com.knoldus.trainning.StackOverflowApplication.repository.AnswerRepository;
import com.knoldus.trainning.StackOverflowApplication.vo.request.AnswerViewRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class AnswerService {

  @Autowired
  private QuestionService questionService;

  @Autowired private AnswerRepository answerRepository;

  public List<Answer> getAllAnswers(Long userId) {
    List<Answer> answerList = answerRepository.getStudentByEmailAddressNative(userId);
    return answerList;
  }

  public void save(AnswerViewRequest answerViewRequest) {
//    List<Answer> answerList1 = new ArrayList<>();
//    for (String answer1 : answerList) {
//      Answer answer = new Answer();
//      answer.setInputAnswer(answer1);
//      answerList1.add(answer);
//      answerRepository.save(answer);
//    }
//    return answerList1;

    Answer answer = new Answer();
    Question question = new Question();
    answer.setInputAnswer(answerViewRequest.getInputAnswer());
    answer.setId(answerViewRequest.getId());
    Optional<Question> optionalQuestion = questionService.getQuestionById(answerViewRequest.getId());
    question.setId(answerViewRequest.getId());
    Optional<Question> optionalEntity =  questionService.getQuestionById(answerViewRequest.getQuestionId());
    Question roomEntity = optionalEntity.get();
    System.out.println(roomEntity);
    answer.setQuestion(roomEntity);
    if(questionService.getQuestionById(answerViewRequest.getQuestionId()) != null) {
      answerRepository.save(answer);
    } else {
      System.out.println("Question does not exist");
    }
  }

  public void updateAnswer(Answer answer) {
    answerRepository.save(answer);
  }

  public void deleteAnswer(Long id) {
    answerRepository.deleteById(id);
  }

  public Optional<Answer> getAnswersById(Long id) {
    return answerRepository.findById(id);
  }
}
