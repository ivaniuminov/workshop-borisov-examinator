package com.iuminov.examinator.examinator.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Exam {
    private String student;
    private String title;
    private Section sections;
}
