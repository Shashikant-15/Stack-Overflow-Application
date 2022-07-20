package com.knoldus.trainning.StackOverflowApplication.service;

import com.knoldus.trainning.StackOverflowApplication.entity.Answer;
import com.knoldus.trainning.StackOverflowApplication.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AnswerService {

  @Autowired private AnswerRepository answerRepository;

  public List<Answer> getAllAnswers(Long questionId) {
    return new ArrayList<>(answerRepository.findByQuestionId(questionId));
  }

  public void addAnswer(Answer answer) {
    answerRepository.save(answer);
  }

  public void updateAnswer(Answer answer) {
    answerRepository.save(answer);
  }

  public void deleteAnswer(Long id) {
    answerRepository.deleteById(id);
  }

  public Optional<Answer> getAllAnswersById(Long id) {
    return answerRepository.findById(id);
  }
}
