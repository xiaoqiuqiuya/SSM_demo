package com.mybatis.po;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private int student_id;
    private String student_name;
    private String class_id;
    private List<Course> courses;
}
