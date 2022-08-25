package com.example.javainterview.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "form_answer", schema = "public", catalog = "postgres")
public class FormAnswerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_form_answer", nullable = false)
    private int idFormAnswer;
    @Basic
    @Column(name = "fio", nullable = false, length = -1)
    private String fio;
    @Basic
    @Column(name = "answer", nullable = true, length = -1)
    private String answer;
    @Basic
    @Column(name = "id_form_question", nullable = true)
    private Integer idFormQuestion;

    public int getIdFormAnswer() {
        return idFormAnswer;
    }

    public void setIdFormAnswer(int idFormAnswer) {
        this.idFormAnswer = idFormAnswer;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getIdFormQuestion() {
        return idFormQuestion;
    }

    public void setIdFormQuestion(Integer idFormQuestion) {
        this.idFormQuestion = idFormQuestion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormAnswerEntity that = (FormAnswerEntity) o;
        return idFormAnswer == that.idFormAnswer && Objects.equals(fio, that.fio) && Objects.equals(answer, that.answer) && Objects.equals(idFormQuestion, that.idFormQuestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFormAnswer, fio, answer, idFormQuestion);
    }
}
