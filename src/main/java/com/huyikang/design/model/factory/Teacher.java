package com.huyikang.design.model.factory;

public class Teacher implements Human {

    @Override
    public void read() {
        System.out.println("The teacher is teaching reading~");
    }

    @Override
    public void eat() {
        System.out.println("The teacher is eating");
    }

    @Override
    public String getProfession() {
        return "Teacher";
    }

    @Override
    public String getDefaultAction() {
        return "Teaching";
    }

}
