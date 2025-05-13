package edu.nugi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paper {
    private Integer id;
    private Integer userId;
    private Integer examId;
}
