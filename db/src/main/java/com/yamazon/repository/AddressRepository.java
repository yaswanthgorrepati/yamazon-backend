package com.yamazon.repository;

import com.yamazon.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByUserId(Long userId);
    List<Address> findByUserIdOrderByIdDesc(Long userId);
    List<Address> findByUserIdAndIsDefaultTrue(Long userId);
}
