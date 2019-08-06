package com.spring.aurora.coms;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.aurora.coms.entity.Customer;
import com.spring.aurora.coms.repository.ContainerRepository;
import com.spring.aurora.coms.repository.CustomerPriceRepository;
import com.spring.aurora.coms.repository.CustomerRepository;
import com.spring.aurora.coms.repository.OrderRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuroraApplicationTests {

	@Autowired private CustomerRepository customerRepo;
	@Autowired private OrderRepository orderRepo;
	@Autowired private ContainerRepository containerRepo;
	@Autowired private CustomerPriceRepository custPriceRepo;
	
	@Test
	public void contextLoads() {
		List<Customer> customers = customerRepo.findAll();
		System.out.println(customers);
		System.out.println(orderRepo.findAll());
		System.out.println(containerRepo.findAll());
		System.out.println(custPriceRepo.findAll());
	}
	
	@Test
	public void testInsert() {
		Customer c = new Customer(
				0L, "Business", "Customer Name", "Customer Address",
				"Contact", "Main", "Alternate", "Email@Email.com", 10);
		Customer save = customerRepo.save(c);
		System.out.println(save);
	}

}
