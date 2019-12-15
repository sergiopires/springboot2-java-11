package com.sergioramos.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sergioramos.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
