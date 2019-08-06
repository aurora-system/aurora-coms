package com.spring.aurora.coms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.aurora.coms.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
