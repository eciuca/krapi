package com.github.eciuca.training.krapi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class Order {
    @Id
    @Column(name = "ORD_NUM")
    private Long id;

    @Column(name = "ORD_AMOUNT")
    private BigDecimal amount;
    @Column(name = "ADVANCE_AMOUNT")
    private BigDecimal advanceAmount;
    @Column(name = "ORD_DATE")
    private LocalDate date;
    @Column(name = "CUST_CODE")
    private String customerId;
    @Column(name = "AGENT_CODE")
    private String agentId;
    @Column(name = "ORD_DESCRIPTION")
    private String description;
}
