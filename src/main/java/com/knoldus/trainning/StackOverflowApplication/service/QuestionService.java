package com.knoldus.trainning.StackOverflowApplication.service;

import com.knoldus.trainning.StackOverflowApplication.entity.Question;
import com.knoldus.trainning.StackOverflowApplication.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    List<Question> questionsList = new ArrayList<>();

    public void save(Question question){
        Question questions=new Question();

        questionRepository.save(questions);
    }

    public List<Question> getAllQuestions(){
        questionsList = (List<Question>) questionRepository.findAll();
        return questionsList;
    }

    public void deleteById(Long Id){
        questionRepository.deleteById(Id);
    }

    public Optional<Question> getQuestionById(Long Id){
        return questionRepository.findById(Id);

    }

    public void updateQuestion(Question question){
        questionRepository.save(question);
    }

}
