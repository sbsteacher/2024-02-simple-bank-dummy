package com.green.simple_bank_dummy.customer;

import com.green.simple_bank_dummy.Dummy;
import com.green.simple_bank_dummy.customer.model.Customer;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

class CustomerDummy extends Dummy {

    final int ADD_ROW_COUNT = 1_000; //더 추가하고 싶은 row count

    @Test
    void generate() {
        SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH);
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);

        int maxId = customerMapper.findMaxId(); //마지막 id값
        int endRowCount = maxId + ADD_ROW_COUNT;
        for(int i=maxId + 1; i<=endRowCount; i++) {
            Customer customer = Customer.builder()
                    .customerId( i )
                    .name(koFaker.name().lastName() + koFaker.name().firstName())
                    .email( i + enFaker.internet().emailAddress() )
                    .build();

            customerMapper.save(customer);
            sqlSession.flushStatements();
        }

    }
}

