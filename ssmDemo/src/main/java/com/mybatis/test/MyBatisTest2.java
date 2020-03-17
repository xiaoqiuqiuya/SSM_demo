package com.mybatis.test;

import com.mybatis.mapper.CustomerMapper;
import com.mybatis.po.Customer;
import com.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyBatisTest2 {
    @Test
    public void findByid(){

        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = customerMapper.findCustomerById(1);
        System.out.println(customer);

    }

    @Test
    public void findAllCustomer(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        List<Customer> customers = customerMapper.findCustomer();

        for (Customer customer:customers){
            System.out.println(customer);
        }

    }

}
