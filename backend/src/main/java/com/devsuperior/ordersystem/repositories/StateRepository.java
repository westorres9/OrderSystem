package com.devsuperior.ordersystem.repositories;

import com.devsuperior.ordersystem.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}
