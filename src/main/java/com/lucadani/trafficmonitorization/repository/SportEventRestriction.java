package com.lucadani.trafficmonitorization.repository;

import com.lucadani.trafficmonitorization.entity.SportEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportEventRestriction extends JpaRepository<SportEvent, Long> {
}
