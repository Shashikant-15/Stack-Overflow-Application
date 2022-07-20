package com.knoldus.trainning.StackOverflowApplication.vo.request;

import lombok.Data;

@Data
public class AnswerViewRequest {

        private Long id;

        private String inputAnswer;

        private Long questionId;

}

