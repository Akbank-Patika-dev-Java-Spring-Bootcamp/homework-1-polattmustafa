package com.example.countries.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "COUNTRY")
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(generator = "Customer", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "Customer", sequenceName = "CUSTOMER_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 50)
    private String name;

    @Column(name = "PRESIDENT", length = 100)
    private String president;
}