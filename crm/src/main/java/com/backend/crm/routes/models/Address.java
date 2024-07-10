package com.backend.crm.routes.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_address;

    @Column
    private String zipcode;

    @Column
    private String country;

    @Column
    private String region;

    @Column
    private String city;

    @Column
    private String street;

    @Column
    private String house;

    @Column
    private String apartment;

    @OneToOne
    private Company company;
}
