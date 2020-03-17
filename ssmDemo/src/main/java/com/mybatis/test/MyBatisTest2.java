package com.mybatis.test;

import com.mybatis.mapper.CustomerMapper;
import com.mybatis.po.Customer;
import com.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyBatisTest2 {
    @Test//查询单个
    public void findByid(){

        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = customerMapper.findCustomerById(1);
        System.out.println(customer);

    }

    @Test//查询所有
    public void findAllCustomer(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        List<Customer> customers = customerMapper.findCustomer();

        for (Customer customer:customers){
            System.out.println(customer);
        }

    }

    @Test//添加
    public void insert(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = new Customer();
        customer.setUsername("李四");
        customer.setJobs("医生");
        customer.setPhone("120");
        customerMapper.insertCustomer(customer);
        sqlSession.commit();
        System.out.println(customer.getId());
    }

    @Test//修改
    public void update(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = new Customer();
        customer.setId("11");
        customer.setUsername("修改");
        customerMapper.updateCustomer(customer);
        sqlSession.commit();
    }

    @Test//删除
    public void del(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        customerMapper.delCustomer(10);
        sqlSession.commit();
    }
}
