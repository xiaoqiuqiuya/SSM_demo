package com.mybatis.po;

import lombok.Data;

import java.util.List;

@Data
public class TClass {
    private int id;
    private String name;

    private List<Student> students;
}
