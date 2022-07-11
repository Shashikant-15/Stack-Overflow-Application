package com.knoldus.trainning.StackOverflowApplication.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Questions {


    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "questionId",nullable = false)
    private long questionId;

    @Column(name = "questionTitle", nullable = false)
    private String questionTitle;

    private String questionDescription;


    public Long getId() {
        return questionId;
    }

    public void setId(Long id) {
        this.questionId = id;
    }

}
