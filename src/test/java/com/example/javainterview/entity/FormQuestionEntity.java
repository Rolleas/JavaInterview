package com.example.javainterview.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "form_question", schema = "public", catalog = "postgres")
public class FormQuestionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_form_question", nullable = false)
    private int idFormQuestion;
    @Basic
    @Column(name = "question", nullable = true, length = -1)
    private String question;

    public int getIdFormQuestion() {
        return idFormQuestion;
    }

    public void setIdFormQuestion(int idFormQuestion) {
        this.idFormQuestion = idFormQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormQuestionEntity that = (FormQuestionEntity) o;
        return idFormQuestion == that.idFormQuestion && Objects.equals(question, that.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFormQuestion, question);
    }
}
