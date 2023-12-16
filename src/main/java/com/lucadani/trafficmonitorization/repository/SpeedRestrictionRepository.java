package com.lucadani.trafficmonitorization.repository;

import com.lucadani.trafficmonitorization.entity.SpeedRestriction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeedRestrictionRepository extends JpaRepository<SpeedRestriction, Long> {
}
