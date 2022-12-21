package com.project.rishabh.etrade.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue
    @Column
    private Integer addressId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    private String houseNumber;

    private String street;

    private String city;

    private String state;

    private String country;

    private long pincode;
}
