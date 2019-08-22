package com.test.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent2 {

    @Test
    public void test1()
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext2.xml");

        Students student_01= applicationContext.getBean("student_01",Students.class);

        System.out.println(student_01);
    }


}
