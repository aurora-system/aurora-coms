package com.spring.aurora.coms;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.aurora.coms.entity.Customer;
import com.spring.aurora.coms.repository.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuroraApplicationTests {

	@Autowired
	private CustomerRepository custRepo;
	
	@Test
	public void contextLoads() {
		List<Customer> customers = custRepo.findAll();
		System.out.println(customers);
	}
	
	@Test
	public void testInsert() {
		Customer c = new Customer(
				0L, "Business", "Customer Name", "Customer Address",
				"Contact", "Main", "Alternate", "Email@Email.com", 10);
		Customer save = custRepo.save(c);
		System.out.println(save);
	}

}
