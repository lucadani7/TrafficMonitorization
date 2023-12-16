package com.lucadani.trafficmonitorization.repository;

import com.lucadani.trafficmonitorization.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
