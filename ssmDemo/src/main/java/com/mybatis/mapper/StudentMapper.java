package com.mybatis.mapper;

import com.mybatis.po.Student;
import com.mybatis.po.TClass;

public interface StudentMapper {
    TClass getStudent(TClass tClass);

    Student getStudentCourse(Student student);
}
