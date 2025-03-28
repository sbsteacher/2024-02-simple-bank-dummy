package com.green.simple_bank_dummy.customer.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Customer {
    private int customerId;
    private String name;
    private String email;
}
