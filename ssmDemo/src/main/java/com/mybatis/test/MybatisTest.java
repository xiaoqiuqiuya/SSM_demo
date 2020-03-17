package com.mybatis.test;

import com.mybatis.po.Customer;
import org.apache.ibatis.session.*;
import org.junit.Test;
import com.mybatis.utils.MyBatisUtil;

import java.util.List;


public class MybatisTest {
    @Test
    public void findCustomerByIdTest() throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        //执行映射文件中定义的sql语句，并返回映射的结果集
        Customer customer = sqlSession.selectOne("com.mybatis.mapper.CustomerMapper.findCustomerById", 1);
        System.out.print(customer);
        sqlSession.close();
    }

    @Test//返回一个数据集合
    public void findCustomer() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Customer> customers = sqlSession.selectList("com.mybatis.mapper.CustomerMapper.findCustomer");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
//        关闭连接
        sqlSession.close();
    }


}
