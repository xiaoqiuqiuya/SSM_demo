package com.mybatis.po;

import lombok.Data;

import java.util.List;

@Data
public class TClass {
    private int class_id;
    private String class_name;

    private List<Student> students;
}
