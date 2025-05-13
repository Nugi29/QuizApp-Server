package edu.nugi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private Integer id;
    private String name;
    private String description;
    private Integer teacher_id;
    private String subject;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
