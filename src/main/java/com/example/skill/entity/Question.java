package com.example.skill.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder(toBuilder = true)
@Entity
public class Question extends BaseEntity {
    @OneToOne
    Option correctOption;
    private String questionText;
    private String responseDescription;
    @ManyToOne
    private Quiz quiz;
    @OneToMany(mappedBy = "question")
    private Set<Option> options = new HashSet<>();
}
