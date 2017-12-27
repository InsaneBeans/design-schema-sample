package com.huyikang.design.model.factory;

public class Teacher implements Person {

    @Override
    public void read() {
        System.out.println("老师正在教学生读书~");
    }

    @Override
    public void eat() {
        System.out.println("老师正在吃饭~");
    }

    @Override
    public String getProfession() {
        return "teacher";
    }

    @Override
    public String getDefaultAction() {
        return "教学";
    }

}
