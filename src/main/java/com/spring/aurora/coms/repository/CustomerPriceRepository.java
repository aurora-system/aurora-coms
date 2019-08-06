package com.spring.aurora.coms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.aurora.coms.entity.CustomerPrice;

public interface CustomerPriceRepository extends JpaRepository<CustomerPrice, Long> {

}
