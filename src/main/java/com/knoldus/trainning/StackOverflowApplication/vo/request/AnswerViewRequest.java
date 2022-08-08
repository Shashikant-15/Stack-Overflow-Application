package com.knoldus.trainning.StackOverflowApplication.vo.request;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class AnswerViewRequest {

        @NotEmpty
        @Size(min = 2, message = "Answer should have at least 2 characters")
        private String inputAnswer;

        @NotNull
        @Min(value = 1, message = "Minimum 1 valid required")
        private Long questionId;

}

