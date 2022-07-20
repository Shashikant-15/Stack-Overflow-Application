package com.knoldus.trainning.StackOverflowApplication.repository;

import com.knoldus.trainning.StackOverflowApplication.entity.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {
//  List<Answer> findByQuestionId(Long questionId);
}
