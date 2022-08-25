package com.example.javainterview.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "form_bundle", schema = "public", catalog = "postgres")
public class FormBundleEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_form_bundle", nullable = false)
    private int idFormBundle;
    @Basic
    @Column(name = "id_form_question", nullable = true)
    private Integer idFormQuestion;
    @Basic
    @Column(name = "id_form", nullable = true)
    private Integer idForm;

    public int getIdFormBundle() {
        return idFormBundle;
    }

    public void setIdFormBundle(int idFormBundle) {
        this.idFormBundle = idFormBundle;
    }

    public Integer getIdFormQuestion() {
        return idFormQuestion;
    }

    public void setIdFormQuestion(Integer idFormQuestion) {
        this.idFormQuestion = idFormQuestion;
    }

    public Integer getIdForm() {
        return idForm;
    }

    public void setIdForm(Integer idForm) {
        this.idForm = idForm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormBundleEntity that = (FormBundleEntity) o;
        return idFormBundle == that.idFormBundle && Objects.equals(idFormQuestion, that.idFormQuestion) && Objects.equals(idForm, that.idForm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFormBundle, idFormQuestion, idForm);
    }
}
