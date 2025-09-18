package com.yamazon.repository;

import com.yamazon.model.WishListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishListItemRepository extends JpaRepository<WishListItem, Long> {
    List<WishListItem> findByWishListId(Long wishListId);
    List<WishListItem> findByProductId(Long productId);
}
