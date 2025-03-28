package com.green.simple_bank_dummy.customer;

import com.green.simple_bank_dummy.customer.model.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    int save(Customer customer);
    int clear();
    int findMaxId();
    List<Integer> findIdAll();
}
