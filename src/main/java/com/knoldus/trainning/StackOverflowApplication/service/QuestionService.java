package com.knoldus.trainning.StackOverflowApplication.service;

import com.knoldus.trainning.StackOverflowApplication.entity.Answer;
import com.knoldus.trainning.StackOverflowApplication.entity.Question;
import com.knoldus.trainning.StackOverflowApplication.exception.ResourceNotFoundException;
import com.knoldus.trainning.StackOverflowApplication.repository.QuestionRepository;
import com.knoldus.trainning.StackOverflowApplication.vo.request.QuestionViewRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

  @Autowired
  private AnswerService answerService;

    @Autowired
    private QuestionRepository questionRepository;

    List<Question> questionsList = new ArrayList<>();

    public void save(QuestionViewRequest questionViewRequest) {

      Question question = new Question();
      question.setQuestionTitle(questionViewRequest.getQuestionTitle());
      question.setQuestionDescription(questionViewRequest.getQuestionDescription());
      List<Answer> answerList = answerService.save(questionViewRequest.getId(),
              questionViewRequest.getAnswerList());
      question.setAnswerList(answerList);
      questionRepository.save(question);
    }

    public List<Question> getAllQuestions() {
      questionsList = (List<Question>) questionRepository.findAll();
      return questionsList;
    }

    public Optional<Question> getQuestionById(Long Id) {
      return questionRepository.findById(Id);
    }

    public void deleteById(Long id) {
      questionRepository.deleteById(id);
    }

    public Question updateQuestion(Long id, Question request) {
      return questionRepository.findById(id).map(question -> {
        question.setQuestionTitle(request.getQuestionTitle());
        question.setQuestionDescription(request.getQuestionDescription());
        question.setAnswerList(request.getAnswerList());
        return questionRepository.save(question);
      }).orElseThrow(() -> new ResourceNotFoundException("Question with id : " + id + " not found"));
    }
  }
