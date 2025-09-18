package com.yamazon.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @Column(name = "product_info")
    private String productInfo;

    @Column(name = "price_id")
    private Long priceId;

    @Column(name = "rating_id")
    private Long ratingId;
}
