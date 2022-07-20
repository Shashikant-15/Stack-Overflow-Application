package com.knoldus.trainning.StackOverflowApplication.repository;

import com.knoldus.trainning.StackOverflowApplication.entity.Answer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {

//  List<Answer> findByQuestionId(Long questionId);

    @Transactional
    @Modifying
    @Query(
            value = "select * from answer s where s.question_id = ?1",
            nativeQuery = true
    )
    List<Answer> getStudentByEmailAddressNative(Long id);

}
