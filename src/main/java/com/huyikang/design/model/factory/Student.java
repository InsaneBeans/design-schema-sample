package com.huyikang.design.model.factory;

/**
 * 学生实体类
 * 
 * @author InsaneBeans
 *
 */
public class Student implements Human{
    
    private String stuId;
    private String stuName;
    private String stuGrade;
    
    public Student() {
    }
    
    public Student(String stuId, String stuName, String stuGrade) {
        setStuGrade(stuGrade);
        setStuName(stuName);
        setStuId(stuId);
    }
    
    public String getStuId() {
        return stuId;
    }
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public String getStuGrade() {
        return stuGrade;
    }
    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade;
    }

    @Override
    public void read() {
        System.out.println("The student is reading~");
    }

    @Override
    public void eat() {
        System.out.println("The student is eating!");
    }

    @Override
    public String getProfession() {
        return "Student";
    }

    @Override
    public String getDefaultAction() {
        return "Reading";
    }
    
}
