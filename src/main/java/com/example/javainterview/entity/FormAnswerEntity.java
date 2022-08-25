package com.example.javainterview.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "form_answer")
public class FormAnswerEntity {
    @Id
    @Column(name = "id_form_answer", nullable = false)
    private Integer id;

    @Column(name = "answer")
    private String answer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_form_question")
    private FormQuestionEntity idFormQuestion;
}