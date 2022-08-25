package com.example.javainterview.service;

import com.example.javainterview.dto.PageDTO;
import com.example.javainterview.entity.FormQuestionEntity;
import com.example.javainterview.repository.FormRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FormQuestionsService {

    private final FormRepository formRepository;

    private PageDTO convertToDTO(Page<FormQuestionEntity> page) {
        PageDTO pageDTO = new PageDTO();
        pageDTO.setTotalPages(page.getTotalPages());
        pageDTO.setPageNumber(page.getNumber());
        pageDTO.setContent(page.getContent());
        return pageDTO;
    }
    public PageDTO getFormService(Integer pageNumber) {
        return convertToDTO(formRepository.findAll(PageRequest.of(pageNumber, 4)));
    }

}
