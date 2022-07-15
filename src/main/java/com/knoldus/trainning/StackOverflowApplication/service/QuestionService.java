package com.knoldus.trainning.StackOverflowApplication.service;


import com.knoldus.trainning.StackOverflowApplication.entity.Question;
import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;

public class QuestionService {


    List<Question> findAll() {
        return null;
    }

    Page<Question> findAll(Pageable pageable) {
        return null;
    }

    Optional<Question> findById(Long id) {
        return Optional.empty();
    }

    Question save(Question question) {


        return question;
    }

    void deleteById(Long id) {
    }

}
