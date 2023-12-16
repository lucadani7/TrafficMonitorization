package com.lucadani.trafficmonitorization.repository;

import com.lucadani.trafficmonitorization.entity.FuelPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelPriceRepository extends JpaRepository<FuelPrice, Long> {
}
