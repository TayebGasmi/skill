package com.example.skill.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
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
public class Skill extends BaseEntity {
    @Column(nullable = false)
    private String name;
    private String description;
    @JsonIgnore
    @OneToMany(mappedBy = "skill", orphanRemoval = true)
    private Set<Quiz> quizzes = new HashSet<>();
    @ManyToOne()
    private Domain domain;
    @ManyToOne
    private Activity activity;


}
