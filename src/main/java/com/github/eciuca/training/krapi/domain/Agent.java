package com.github.eciuca.training.krapi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;


@Entity
@Table(name = "agents")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class Agent {
    @Id
    @EqualsAndHashCode.Include
    private String agentCode;
    private String agentName;
    private String workingArea;
    private BigDecimal commission;
    private String phoneNo;
    private String country;

}
