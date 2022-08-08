package com.knoldus.trainning.StackOverflowApplication.vo.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class AnswerViewRequest {

        @NotEmpty(message = " inputAnswer can't be empty")
        @Size(min = 2, message = "inputAnswer should have at least 2 characters")
        private String inputAnswer;

        private Long questionId;

}

