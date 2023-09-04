package com.example.skill.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Quiz extends BaseEntity {
    @Column(nullable = false)
    private String name;
    private String description;
    @ManyToOne()
    private Skill skill;
    @OneToMany(mappedBy = "quiz", orphanRemoval = true)
    @JsonIgnore
    private Set<Question> questions = new HashSet<>();
    @OneToMany(mappedBy = "quiz", orphanRemoval = true)
    @JsonIgnore
    private Set<QuizRate> quizRates = new HashSet<>();


}
