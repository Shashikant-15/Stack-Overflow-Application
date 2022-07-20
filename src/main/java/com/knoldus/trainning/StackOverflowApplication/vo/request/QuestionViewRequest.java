package com.knoldus.trainning.StackOverflowApplication.vo.request;

import com.knoldus.trainning.StackOverflowApplication.entity.Answer;
import lombok.Data;

import java.util.List;

@Data
public class QuestionViewRequest {

    private Long id;

    private String questionTitle;

    private String questionDescription;

    private List<String> answerList;

}
