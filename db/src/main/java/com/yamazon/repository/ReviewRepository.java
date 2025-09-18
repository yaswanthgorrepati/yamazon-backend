package com.yamazon.repository;

import com.yamazon.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByProductId(Long productId);

    List<Review> findByUserName(String userName);

    List<Review> findByUserNameAndProductId(String userName, Long productId);


}
