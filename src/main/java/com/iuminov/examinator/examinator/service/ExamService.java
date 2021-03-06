package com.iuminov.examinator.examinator.service;

import com.iuminov.examinator.examinator.model.Exam;
import com.iuminov.examinator.examinator.model.Section;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ExamService {
    public final RemoteService remoteService;

    public Exam buildExam(Map<String, Integer> map) {
        Exam exam = new Exam();
        exam.setTitle("Mathematics exam");
        exam.setStudent("Evgenij Borisov");

        Section section = new Section();
        section.setTitle("Mathematics");
        section.setDescription("Demo exam on workshop");
        section.setExercises(remoteService.getMathExercises(map.getOrDefault("Math", 2)));

        exam.setSections(section);

        return exam;
    }
}
