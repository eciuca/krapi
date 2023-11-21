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
@Table(name = "foods")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class Food {
    @Id
    @EqualsAndHashCode.Include
    @Column(name = "ITEM_ID")
    private String id;
    @Column(name = "ITEM_NAME")
    private String name;
    @Column(name = "ITEM_UNIT")
    private String unit;
    @Column(name = "COMPANY_ID")
    private String companyId;
}