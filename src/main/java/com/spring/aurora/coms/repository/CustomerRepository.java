package com.spring.aurora.coms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.aurora.coms.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
