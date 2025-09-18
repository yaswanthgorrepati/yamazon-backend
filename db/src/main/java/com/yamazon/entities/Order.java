package com.yamazon.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "payment_details_id")
    private Long paymentDetailsId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_count")
    private Integer productCount;

    @Column(name = "address_id")
    private Long addressId;

    @Column(name = "order_booking_date")
    private LocalDateTime orderBookingDate;

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "review_id")
    private Long reviewId;
}
