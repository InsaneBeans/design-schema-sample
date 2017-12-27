package com.huyikang.design.pattern.factory;

import com.huyikang.design.model.factory.Farmer;
import com.huyikang.design.model.factory.Person;
import com.huyikang.design.model.factory.Student;
import com.huyikang.design.model.factory.Teacher;

/**
 * 创建人的工厂
 * 
 * @author InsaneBeans
 * 
 */
public class PersonFactory {
    
    public Person createPerson(String profession) {
        switch (profession) {
        case "farmer":
            return new Farmer();
        case "student":
            return new Student();
        case "teacher":
            return new Teacher();
        default : 
            return null;
        }
    }

}
