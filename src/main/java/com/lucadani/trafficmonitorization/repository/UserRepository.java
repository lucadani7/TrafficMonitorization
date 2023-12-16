package com.lucadani.trafficmonitorization.repository;

import com.lucadani.trafficmonitorization.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
