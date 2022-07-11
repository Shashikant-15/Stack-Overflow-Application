package com.knoldus.trainning.StackOverflowApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerId;
    private String inputAnswer;
    @CreationTimestamp
    private Timestamp createdAt;
    @CreationTimestamp
    private Timestamp updatedAt;
//    @ManyToOne
//    private Question question;

}
