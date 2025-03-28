package com.green.simple_bank_dummy.customer;

import com.green.simple_bank_dummy.customer.model.Customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {
    int save(Customer customer);
    int clear();
    int findMaxId();
}
