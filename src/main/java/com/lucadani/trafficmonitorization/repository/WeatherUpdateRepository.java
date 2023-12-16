package com.lucadani.trafficmonitorization.repository;

import com.lucadani.trafficmonitorization.entity.WeatherUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherUpdateRepository extends JpaRepository<WeatherUpdate, Long> {
}
