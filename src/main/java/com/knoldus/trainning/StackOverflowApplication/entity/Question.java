package com.knoldus.trainning.StackOverflowApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.security.Timestamp;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "question")
public class Question {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "questionId",nullable = false)
    private long questionId;

    @Column(name = "questionTitle", nullable = false,unique = true)
    private String questionTitle;

    private String questionDescription;

//    @ManyToMany
//    private Tag tag;

//    @OneToMany
//   private Answer answer;

//    @ManyToOne
//    private User user;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

}
