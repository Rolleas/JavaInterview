package com.example.javainterview.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "form", schema = "public", catalog = "postgres")
public class FormEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_form", nullable = false)
    private int idForm;

    public int getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    @Basic
    @Column(name = "name", nullable = false, length = -1)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormEntity that = (FormEntity) o;
        return idForm == that.idForm && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idForm, name);
    }
}
