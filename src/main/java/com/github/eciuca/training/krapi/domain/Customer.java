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

@Entity
@Table(name = "customer")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class Customer {
    @Id
    @EqualsAndHashCode.Include
    @Column(name = "CUST_CODE")
    private String id;
    @Column(name = "CUST_NAME")
    private String name;
    @Column(name = "CUST_CITY")
    private String city;
    @Column(name = "CUST_COUNTRY")
    private String country;
    @Column(name = "WORKING_AREA")
    private String workingArea;
    private Integer grade;
    @Column(name = "OPENING_AMT")
    private BigDecimal openingAmount;
    @Column(name = "RECEIVE_AMT")
    private BigDecimal receiveAmount;
    @Column(name = "PAYMENT_AMT")
    private BigDecimal paymentAmount;
    @Column(name = "OUTSTANDING_AMT")
    private BigDecimal outstandingAmount;
    @Column(name = "PHONE_NO")
    private String phoneNumber;
    @Column(name = "AGENT_CODE")
    private String agentCode;
}