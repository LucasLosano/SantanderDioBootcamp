package com.project.SantanderDevWeek.repository;

import com.project.SantanderDevWeek.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

    Optional<Stock> findByNameAndDate(String name, LocalDate date);

    @Query("Select stock " +
            "from Stock stock " +
            "where stock.name = :name AND stock.date = :date AND stock.id <> :id")
    Optional<Stock> findByStockUpdate(Long id, String name, LocalDate date);

    @Query("Select stock " +
            "from Stock stock " +
            "where stock.date = :date")
    Optional<List<Stock>> findByToday(LocalDate date);
}