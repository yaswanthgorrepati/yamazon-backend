package com.yamazon.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "wish_list_item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class WishListItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "wish_list_id")
    private Long wishListId;
}
