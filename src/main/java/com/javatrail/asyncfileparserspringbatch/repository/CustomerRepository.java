package com.javatrail.asyncfileparserspringbatch.repository;

import com.javatrail.asyncfileparserspringbatch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
