package com.test.spel;

import com.test.pojo.Grade;
import org.junit.Test;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.List;

public class TestSpel {

    @Test
    public void test1()
    {
        //1.创建一个sepl表达式转换器对象
        ExpressionParser expressionParser= new SpelExpressionParser();

        //2.强转字符串为表达式，并执行表达式 返回结果
        String str=(String)expressionParser.parseExpression("'aa'+'bb'").getValue();

        //3.打印结果
        System.out.println(str);
    }

    @Test
    public void test2()
    {
        //1.创建一个sepl表达式转换器对象
        ExpressionParser expressionParser= new SpelExpressionParser();

        //2.强转字符串为表达式，并执行表达式 返回结果
        int result=(int)expressionParser.parseExpression("2*3+4*5").getValue();

        //3.打印结果
        System.out.println(result);
    }

    //执行静态方法
    @Test
    public void test3()
    {
        //1.创建一个sepl表达式转换器对象
        ExpressionParser expressionParser= new SpelExpressionParser();

        //2.强转字符串为表达式，并执行表达式 返回结果
        double d=(double)expressionParser.parseExpression("T(java.lang.Math).random()").getValue();

        //3.打印结果
        System.out.println(d);
    }

    //调用自定义的静态方法
    @Test
    public void test4()
    {
        //1.创建一个sepl表达式转换器对象
        ExpressionParser expressionParser= new SpelExpressionParser();

        //2.强转字符串为表达式，并执行表达式 返回结果
        int sum=(int)expressionParser.parseExpression("T(com.test.spel.TestSpelMethod).sum(3,5)").getValue();

        //3.打印结果
        System.out.println(sum);
    }

    //调用自定义的非静态方法
    @Test
    public void test5()
    {
        //1.创建一个sepl表达式转换器对象
        ExpressionParser expressionParser= new SpelExpressionParser();

        //2.创建方法所在的对象  并存入到上下文对象中
        TestSpelMethod testSpelMethod=new TestSpelMethod();
        //将对象存到这个上下文对象中
        EvaluationContext evaluationContext=new StandardEvaluationContext(testSpelMethod);

        //3强转字符串为表达式，并执行表达式 返回结果
        List<Grade> gradeList=(List<Grade>)expressionParser.parseExpression("getGradeList()").getValue(evaluationContext);

        //3.打印结果
        System.out.println(gradeList);
    }




}
