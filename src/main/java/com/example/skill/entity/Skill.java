package com.example.skill.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
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
    @Column(nullable = false)
    private String name;
    private String description;
    @Column(nullable = false)
    private Long userId;
    @JsonIgnore
    @OneToMany(mappedBy = "skill")
    private Set<Quiz> quizzes = new HashSet<>();


}
