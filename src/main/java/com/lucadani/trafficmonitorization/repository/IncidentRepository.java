package com.lucadani.trafficmonitorization.repository;

import com.lucadani.trafficmonitorization.entity.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, Long> {
}
