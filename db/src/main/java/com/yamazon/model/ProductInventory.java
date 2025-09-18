package com.yamazon.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product_inventory")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ProductInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    private Integer count;

    @Column(name = "is_available")
    private Boolean isAvailable;
}
