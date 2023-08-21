package com.example.skill.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder(toBuilder = true)
@Entity
public class QuizRate extends BaseEntity {
    @Column(nullable = false)

    private Float score;
    @JsonIgnore
    @ManyToOne
    private Quiz quiz;
    @Column(nullable = false)
    private Long userId;
    private Date ratedAt = new Date();
}
