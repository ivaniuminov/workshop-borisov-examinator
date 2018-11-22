package com.iuminov.examinator.examinator.controller;

import com.iuminov.examinator.examinator.model.Exam;
import com.iuminov.examinator.examinator.service.ExamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class ExamController {
    public ExamService examService;

    @GetMapping("/exercises")
    public Exam getExam(@RequestBody Map<String, Integer> math) {
        return examService.buildExam(math);
    }
}
