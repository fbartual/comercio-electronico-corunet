package com.corunet.comercioelectronico.model.entities;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PricesDao extends PagingAndSortingRepository<Prices, Long> {
    @Query("SELECT p FROM Prices p WHERE p.productId=?2 AND p.brandId=?3 AND " +
            "p.startDate <= ?1 AND p.endDate >= ?1 " +
            "AND p.priority = (SELECT MAX(p.priority) " +
            "FROM Prices p WHERE p.productId=?2 AND p.brandId=?3 " +
            "AND p.startDate <= ?1 AND p.endDate >= ?1)")
    Optional<Prices> findPrice(LocalDateTime date, Long productId, Long brandId);
}
