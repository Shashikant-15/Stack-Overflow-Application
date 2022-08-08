package com.knoldus.trainning.StackOverflowApplication.vo.request;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Validated
public class QuestionViewRequest {

    @NotEmpty
    @Size(min = 2, message = "Question title should have at least 2 characters")
    private String questionTitle;

    @NotEmpty
    @Size(min = 2, message = "Question Description should have at least 2 characters")
    private String questionDescription;


    @NotEmpty
    @Size(min = 2, message = "Tag Name should have at least 2 characters")
    private String tagName;

}
