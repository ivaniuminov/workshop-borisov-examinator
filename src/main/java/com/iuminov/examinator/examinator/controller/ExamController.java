package com.iuminov.examinator.examinator.controller;

import com.iuminov.examinator.examinator.model.Exam;
import com.iuminov.examinator.examinator.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ExamController {
    public final ExamService examService;

    @GetMapping("/exercises")
    public Exam getExam(@RequestBody Map<String, Integer> math) {
        return examService.buildExam(math);
    }
}
