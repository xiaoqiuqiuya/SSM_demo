package com.mybatis.test;

import com.mybatis.mapper.PersonMapper;
import com.mybatis.mapper.StudentMapper;
import com.mybatis.po.Person;
import com.mybatis.po.Student;
import com.mybatis.po.TClass;
import com.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.SQLException;

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
    @Test//一对多
    public void test3(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        TClass tClass = new TClass();
        tClass.setClass_id(2);
        TClass tClass1 = studentMapper.getStudent(tClass);
        System.out.println(tClass1);

    }
    @Test//多对多   查询学生课程
    public void test4(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setStudent_id(1);
        Student student1 = studentMapper.getStudentCourse(student);
        System.out.println(student1);
    }
}
