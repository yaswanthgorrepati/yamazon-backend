package com.yamazon.repository;

import com.yamazon.model.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails, Long> {
    List<PaymentDetails> findByPaymentStatus(String status);

    List<PaymentDetails> findByPaymentDateBetween(java.time.LocalDateTime from, java.time.LocalDateTime to);
}
