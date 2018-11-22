package com.iuminov.examinator.examinator.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Section {
    private String title;
    private String description;
    private List<Exercise> exercises;
}
