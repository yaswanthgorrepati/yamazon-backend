package com.yamazon.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "review")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "user_name")
    private String userName;

    @Column(columnDefinition = "text")
    private String comment;

    @Column(name = "rating_id")
    private Long ratingId;
}
