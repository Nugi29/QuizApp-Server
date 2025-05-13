package edu.nugi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    private Integer id;
    private Integer paperId;
    private Integer questionId;
    private String answer;
    private Boolean isCorrect;
}
