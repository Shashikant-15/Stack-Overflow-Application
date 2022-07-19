package com.knoldus.trainning.StackOverflowApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "question")
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "questionId", nullable = false)
  private long id;

  @Column(name = "questionTitle", nullable = false, unique = true)
  private String questionTitle;

  @Column(name = "questionDescription", nullable = false)
  private String questionDescription;

  @ManyToOne private User user;
}
