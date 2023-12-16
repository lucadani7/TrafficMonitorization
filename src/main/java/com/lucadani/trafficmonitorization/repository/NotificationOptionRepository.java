package com.lucadani.trafficmonitorization.repository;

import com.lucadani.trafficmonitorization.entity.NotificationOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationOptionRepository extends JpaRepository<NotificationOption, Long> {
}
