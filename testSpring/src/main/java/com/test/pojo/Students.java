package com.test.pojo;

public class Students {

    private int sid;

    private String name;

    private int age;

    private Grade grade;

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    public Students()
    {
        System.out.println("创建了student对象");
    }

    public Students(String name)
    {
        this.name=name;
    }

    public Students(int name)
    {
        this.sid=name;
    }

    public Students(int sid,String name)
    {
        this.sid=sid;
        this.name=name;
        System.out.println("sid....name");
    }

    public Students(String name,int sid)
    {
        this.sid=sid;
        this.name=name;
        System.out.println("name....sid");
    }

    public Students(Grade grade)
    {
        this.grade=grade;
    }

    public Students(int sid,String name,int age,Grade grade)
    {
        this.sid=sid;
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
}
