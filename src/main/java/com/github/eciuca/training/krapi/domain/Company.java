package com.github.eciuca.training.krapi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "company")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class Company {
    @Id
    @EqualsAndHashCode.Include
    @Column(name = "COMPANY_ID")
    private String id;
    @Column(name = "COMPANY_NAME")
    private String name;
    @Column(name = "COMPANY_CITY")
    private String city;
}