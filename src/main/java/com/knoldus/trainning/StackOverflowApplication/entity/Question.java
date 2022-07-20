package com.knoldus.trainning.StackOverflowApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "question")
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private long id;

  @Column(name = "questionTitle", nullable = false, unique = true)
  private String questionTitle;

  @Column(name = "questionDescription")
  private String questionDescription;

//  @OneToMany(cascade = CascadeType.ALL,
//          fetch = FetchType.LAZY)
//  @JoinColumn(
//          referencedColumnName = "id")
//  private List<Answer> answerList;

  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt;

  @Temporal(TemporalType.TIMESTAMP)
  private Date updatedAt;

  @PrePersist
  public void prePersist() {
    createdAt = new Date();
    updatedAt = new Date();
  }

  @PreUpdate
  public void preUpdate() {
    updatedAt = new Date();
  }

}
