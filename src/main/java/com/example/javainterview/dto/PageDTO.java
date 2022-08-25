package com.example.javainterview.dto;

import com.example.javainterview.entity.FormQuestionEntity;
import lombok.Data;

import java.util.List;

@Data
public class PageDTO {
    private List<FormQuestionEntity> content;
    private Integer pageNumber;
    private Integer totalPages;
}
