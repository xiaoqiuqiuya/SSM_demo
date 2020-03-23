package com.mybatis.po;

import lombok.Data;

@Data
public class Person {
    private int person_id;
    private String name;
    private int age;
    private String sex;
    private IdCard idCard;
}
