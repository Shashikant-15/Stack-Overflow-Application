package com.knoldus.trainning.StackOverflowApplication.service;

import com.knoldus.trainning.StackOverflowApplication.entity.Answer;
import com.knoldus.trainning.StackOverflowApplication.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class AnswerService {

  @Autowired private AnswerRepository answerRepository;

  public List<Answer> getAllAnswers(Long userId) {
    return new ArrayList<>((Collection) answerRepository.findAll());
  }

  public List<Answer> save(Long id, List<String> answerList) {
    List<Answer> answerList1 = new ArrayList<>();
    for (String answer1 : answerList) {
      Answer answer = new Answer();
      answer.setInputAnswer(answer1);
      answerList1.add(answer);
      answerRepository.save(answer);
    }
    return answerList1;
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
