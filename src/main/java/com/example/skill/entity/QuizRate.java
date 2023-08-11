package com.example.skill.entity;

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
    private Float score;
    @ManyToOne
    private Quiz quiz;
    private Long userId;
    private Date ratedAt = new Date();
}
