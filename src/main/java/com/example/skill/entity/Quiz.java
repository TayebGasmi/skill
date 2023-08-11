package com.example.skill.entity;

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
    private String name;
    private String description;
    @ManyToOne()
    private Skill skill;
    @OneToMany(mappedBy = "quiz")
    private Set<Question> questions = new HashSet<>();
    @OneToMany(mappedBy = "quiz")
    private Set<QuizRate> quizRates = new HashSet<>();


}
