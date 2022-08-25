package com.example.javainterview.service;

import com.example.javainterview.dto.AnswerDTO;
import com.example.javainterview.entity.FormAnswerEntity;
import com.example.javainterview.repository.FormAnswerRepository;
import com.example.javainterview.repository.FormRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FromAnswerService {

    private final FormAnswerRepository formAnswerRepository;
    private final FormRepository formRepository;

    private FormAnswerEntity convertToAnswerEntity(AnswerDTO answerDTO) {
        FormAnswerEntity formAnswerEntity = new FormAnswerEntity();
        formAnswerEntity.setIdFormQuestion(formRepository.findById(answerDTO.getQuestionId()).get());
        formAnswerEntity.setAnswer(answerDTO.getAnswer());
        return formAnswerEntity;
    }

    public void saveAnswerService(List<AnswerDTO> answers) {
        answers.forEach(answer -> formAnswerRepository.save(convertToAnswerEntity(answer)));
    }
}
