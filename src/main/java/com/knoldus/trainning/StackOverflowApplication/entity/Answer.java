package com.knoldus.trainning.StackOverflowApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.sql.Date;
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
    private Long id;
    @Column(name = "inputAnswer", nullable = false, unique = true)
    private String inputAnswer;
//    @Temporal(TemporalType.DATE)
//    private Date createdAt;
//    @Temporal(TemporalType.DATE)
//    private Date updatedAt;
    @ManyToOne
    private Question question;
}
