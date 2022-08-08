package com.knoldus.trainning.StackOverflowApplication.vo.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class QuestionViewRequest {

    @NotEmpty(message = "Question Title can't be empty")
    @Size(min = 2, message = "questionTitle should have at least 2 characters")
    private String questionTitle;

    @NotEmpty(message = " questionDescription can't be empty")
    @Size(min = 2,message = "questionDescription should have at least 2 characters")
    private String questionDescription;

    @NotEmpty(message = " Tag can't be empty")
    @Size(min = 2, message = "tagname should have at least 2 characters")
    private String tagName;

}
