package com.javatrail.asyncfileparserspringbatch.config;

import com.javatrail.asyncfileparserspringbatch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        /*May do some processing*/
            return customer;
    }
}
