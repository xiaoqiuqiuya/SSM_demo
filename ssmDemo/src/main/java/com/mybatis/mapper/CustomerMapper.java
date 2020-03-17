package com.mybatis.mapper;

import com.mybatis.po.Customer;

import java.util.List;

public interface CustomerMapper {
     Customer findCustomerById(int id);
     List<Customer> findCustomer();

}
