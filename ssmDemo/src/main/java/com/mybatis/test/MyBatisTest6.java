package com.mybatis.test;

import com.mybatis.mapper.PersonMapper;
import com.mybatis.po.Person;
import com.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyBatisTest6 {
    @Test//嵌套查询
    public void getPerson() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        Person person = new Person();
        person.setPerson_id(1);
        Person person1 = personMapper.getPersonById(person);
        System.out.println(person1);
    }

    @Test//嵌套结果
    public void getPerson2(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        Person person = new Person();
        person.setPerson_id(2);
        Person person1 = personMapper.getPersonById2(person);
        System.out.println(person1);


    }
}
