package com.mybatis.mapper;

import com.mybatis.po.Person;

public interface PersonMapper {

    Person getPersonById(Person person);

    Person getPersonById2(Person person);

}
