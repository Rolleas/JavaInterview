package com.example.javainterview.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "form_question")
public class FormQuestionEntity {
    @Id
    @Column(name = "id_form_question", nullable = false)
    private Integer id;

    @Column(name = "question")
    private String question;
}