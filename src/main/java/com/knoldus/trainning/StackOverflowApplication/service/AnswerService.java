package com.knoldus.trainning.StackOverflowApplication.service;

import com.knoldus.trainning.StackOverflowApplication.entity.Answer;
import com.knoldus.trainning.StackOverflowApplication.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;
    public List<Answer> getAllAnswers(Long userId) {
        return new ArrayList<>(answerRepository.findByQuestionId(userId));
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