package com.test.pojo;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class TestType {

    private int[] arr;

    private Grade[] grades;

    private List<String> stringList;

    private List<Grade> gradeList;

    private Map<String,String> stringMap;

    private Map<String,Grade> gradeMap;

    private Properties properties;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public Map<String, Grade> getGradeMap() {
        return gradeMap;
    }

    public void setGradeMap(Map<String, Grade> gradeMap) {
        this.gradeMap = gradeMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "TestType{" +
                "arr=" + Arrays.toString(arr) +
                ", grades=" + Arrays.toString(grades) +
                ", stringList=" + stringList +
                ", gradeList=" + gradeList +
                ", stringMap=" + stringMap +
                ", gradeMap=" + gradeMap +
                ", properties=" + properties +
                '}';
    }
}
