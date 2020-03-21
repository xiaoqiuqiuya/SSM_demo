package com.mybatis.test;

import com.mybatis.mapper.IdCardMapper;
import com.mybatis.mapper.PersonMapper;
import com.mybatis.po.IdCard;
import com.mybatis.po.Person;
import com.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyBatisTest6 {

    @Test
    public void getPerson() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        Person person = new Person();
        person.setPerson_id(2);
        Person person1 = personMapper.getPersonById(person);
        System.out.println(person1);
    }

    @Test
    public void getCode(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        IdCardMapper idCardMapper = sqlSession.getMapper(IdCardMapper.class);
        IdCard idCard = idCardMapper.findByIdCard(2);
        System.out.println(idCard);

    }
}
