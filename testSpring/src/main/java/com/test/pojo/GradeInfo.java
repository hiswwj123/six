package com.test.pojo;

import java.util.List;

public class GradeInfo {


    private int sum;

    private List<Grade> gradeList;

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }
    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "GradeInfo{" +
                "sum=" + sum +
                ", gradeList=" + gradeList +
                '}';
    }
}
