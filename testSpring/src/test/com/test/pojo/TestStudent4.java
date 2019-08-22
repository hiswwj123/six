package com.test.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent4 {

    @Test
    public void test1()
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext4.xml");

        TestType testType_01= applicationContext.getBean("testType_01",TestType.class);

        System.out.println(testType_01);
    }


}
