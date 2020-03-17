package com.mybatis.mapper;

import com.mybatis.po.Customer;

import java.util.List;

public interface CustomerMapper {
     Customer findCustomerById(int id);
     List<Customer> findCustomer();

//     插入
     int insertCustomer(Customer customer);


//     修改
    int updateCustomer(Customer customer);

//    删除
    void delCustomer(int id);
}
