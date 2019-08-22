package com.test.spel;

import com.test.pojo.Grade;

import java.util.ArrayList;
import java.util.List;

public class TestSpelMethod {

    public static int sum(int a,int b)
    {
        return a+b;
    }

    public List<Grade> getGradeList()
    {
         List<Grade> gradeList=new ArrayList<Grade>();
         gradeList.add(new Grade(1,"1901"));
        gradeList.add(new Grade(2,"1902"));
        gradeList.add(new Grade(3,"1903"));

        return gradeList;
    }
}
