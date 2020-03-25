package com.mybatis.po;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Course {
    private int course_id;
    private String course_name;
    private List<Student> students;

}
