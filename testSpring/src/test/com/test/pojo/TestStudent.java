package com.test.pojo;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

    @Test
    public void test1()
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");

        Students student_02= applicationContext.getBean("student_02",Students.class);

        System.out.println(student_02);
    }

    @Test
    public void test2()
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");

        Students student_03= applicationContext.getBean("student_03",Students.class);

        System.out.println(student_03);
    }

    @Test
    public void test3()
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");

        Students student_04= applicationContext.getBean("student_04",Students.class);

        System.out.println(student_04);
    }

    @Test
    public void test4()
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");

        Students student_05= applicationContext.getBean("student_05",Students.class);

        System.out.println(student_05);
    }
}
