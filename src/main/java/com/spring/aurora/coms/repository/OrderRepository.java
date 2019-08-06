package com.spring.aurora.coms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.aurora.coms.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
