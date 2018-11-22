package com.iuminov.examinator.examinator.service;

import com.iuminov.examinator.examinator.model.Exercise;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RemoteService {
    public final RestTemplate restTemplate;

    public List<Exercise> getMathExercises(int amount) {
        return restTemplate.exchange("http://localhost:8082/math/{amount}", HttpMethod.GET, null, new ParameterizedTypeReference<List<Exercise>>() {
        }, amount).getBody();
    }
}
