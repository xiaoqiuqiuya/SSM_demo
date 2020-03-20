package com.mybatis.test;

import com.mybatis.mapper.CustomerMapper;
import com.mybatis.po.Customer;
import com.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 *项目5 动态mysql
 *
 * 请查询姓名中包含“李”并且或者工作为“送货”的客户信息？
 *
 * 当用户姓名不为空，则只能根据用户姓名中包含“李”字的用户信息。
 * 当用户名称为空，而用户的职业不为空的时候，则根据用户的职业进行查询
 * 用户名称和客户职业都为空的时候，则要求查询所有电话不为空的客户信息
 *
 * 请利用<set>元素将customer表中ID=001的jobs改为"教师"
 *
 * 查询customer表中用户ID为001,003,005的用户信息。
 *
 * 为了提高系统的可移植行和防止注入攻击，请使用<bind>元素进行字符拼接。
 *
 */

public class MybatisTest5 {

    @Test
    public void dynamisSelect(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = new Customer();
        customer.setUsername("李");
        customer.setJobs("送货");
        List<Customer> customers = customerMapper.dynamicSelectCustomer(customer);
        for(Customer customer1 : customers){
            System.out.println(customer1);
        }

    }

    @Test
    public void chooseSelect(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = new Customer();
//        customer.setUsername("李");
//        customer.setJobs("医生");
        List<Customer> customers = customerMapper.chooseCustomer(customer);
        for (Customer customer1 :customers){
            System.out.println(customer1);
        }

    }

    @Test
    public void set(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = new Customer();
        customer.setId(1);
        customer.setJobs("教师");
        customer.setPhone("001");
        customerMapper.setCustomer(customer);
        sqlSession.commit();
    }

    @Test
    public void forEach(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        String[] strings = {"6","7","8"};
        List<Customer> customers =customerMapper.foreach(strings);
        for (Customer customer:customers){
            System.out.println(customer);
        }

    }

}
