package com.yamazon.repository;

import com.yamazon.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitleContainingIgnoreCase(String titlePart);

    @Query("""
    SELECT p FROM Product p
    WHERE LOWER(p.title) LIKE LOWER(CONCAT('%', :text, '%'))
       OR LOWER(p.description) LIKE LOWER(CONCAT('%', :text, '%'))
       OR LOWER(p.productInfo) LIKE LOWER(CONCAT('%', :text, '%'))
    """)
    List<Product> searchByText(@Param("text") String text);

    /*
    for paGINATION

        @Query("""
        SELECT p FROM Product p
        WHERE LOWER(p.title) LIKE LOWER(CONCAT('%', :text, '%'))
           OR LOWER(p.description) LIKE LOWER(CONCAT('%', :text, '%'))
           OR LOWER(p.productInfo) LIKE LOWER(CONCAT('%', :text, '%'))
        """)
    Page<Product> searchByText(@Param("text") String text, Pageable pageable);

    public void searchProducts(String query) {
    Pageable pageable = PageRequest.of(0, 10, Sort.by("title").ascending());
    Page<Product> page = productRepository.searchByText(query, pageable);

    System.out.println("Total Products Found: " + page.getTotalElements());
    System.out.println("Total Pages: " + page.getTotalPages());
    page.getContent().forEach(p -> System.out.println(p.getTitle()));
}
     */



}
