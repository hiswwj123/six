package com.test.spel;

import com.test.pojo.Grade;
import com.test.pojo.GradeInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.List;

public class TestSpel2 {

    @Test
    public void test1()
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext5.xml");

        GradeInfo gradeInfo= applicationContext.getBean("gradeInfo",GradeInfo.class);

        System.out.println(gradeInfo);

    }




}
