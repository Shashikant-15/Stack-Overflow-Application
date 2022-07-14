package com.knoldus.trainning.StackOverflowApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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
    @Column(name = "answerId",nullable = false)
    private Long answerId;
    @Column(name = "inputAnswer", nullable = false, unique = true)
    private String inputAnswer;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp updatedAt;
    @ManyToOne
    private Question question;
}
