package com.example.javainterview.repository;

import com.example.javainterview.entity.FormQuestionEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FormRepository extends PagingAndSortingRepository<FormQuestionEntity, Integer> {
}
