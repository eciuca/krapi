package com.github.eciuca.training.krapi.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "studentreport")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class StudentReport {
    @Id
    private Long id;
    @JoinColumn(name = "STUDENT_ID")
    private Long studentId;
    private String grade;
    private String semester;
    @Column(name = "CLASS_ATTENDED")
    private Integer classAttended;
}