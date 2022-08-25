package com.example.javainterview.controller;

import com.example.javainterview.dto.AnswerDTO;
import com.example.javainterview.dto.PageDTO;
import com.example.javainterview.entity.FormQuestionEntity;
import com.example.javainterview.repository.FormRepository;
import com.example.javainterview.service.FormQuestionsService;
import com.example.javainterview.service.FromAnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/form")
@RequiredArgsConstructor
public class FormController {

    private final FormQuestionsService formQuestionsService;
    private final FromAnswerService fromAnswerService;

    @RequestMapping(params = "page")
    public PageDTO getQuestions(Integer page) {
        return formQuestionsService.getFormService(page);
    }

    @PostMapping("/")
    public PageDTO saveAnswers(@RequestBody List<AnswerDTO> answers, Integer page) {
        fromAnswerService.saveAnswerService(answers);
        return getQuestions(page);
    }
}
