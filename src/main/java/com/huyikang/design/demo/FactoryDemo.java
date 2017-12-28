package com.huyikang.design.demo;

import com.huyikang.design.model.factory.Human;
import com.huyikang.design.pattern.factory.HumanFactory;

public class FactoryDemo {
    
    public static void main(String[] args) {
        HumanFactory humanFactory = new HumanFactory();
        
        Human human1 = humanFactory.getHuman("farmer");
        human1.eat();
        human1.getProfession();
        
        Human human2 = humanFactory.getHuman("teacher");
        human2.eat();
        human2.getProfession();
    }

}
