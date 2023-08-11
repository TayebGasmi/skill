package com.example.skill.entity;

import jakarta.persistence.Entity;
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
public class Skill extends BaseEntity {
    private String name;
    private String description;
    private Long userId;
    @OneToMany(mappedBy = "skill")
    private Set<Quiz> quizzes = new HashSet<>();

}
