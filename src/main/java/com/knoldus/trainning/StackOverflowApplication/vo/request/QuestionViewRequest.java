package com.knoldus.trainning.StackOverflowApplication.vo.request;

import lombok.Data;

@Data
public class QuestionViewRequest {

    private Long id;

    private String questionTitle;

    private String questionDescription;

//    private List<String> answerList;

}
