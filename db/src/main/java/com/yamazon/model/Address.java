package com.yamazon.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "line_1")
    private String line1;

    @Column(name = "line_2")
    private String line2;

    private String landmark;
    private String vtc;
    private String district;
    private String pincode;
    private String state;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "is_default")
    private Boolean isDefault;
}
