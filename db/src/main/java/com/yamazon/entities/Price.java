package com.yamazon.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "price")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "actual_price")
    private BigDecimal actualPrice;

    @Column(name = "selling_price")
    private BigDecimal sellingPrice;

    private BigDecimal discount;
}
