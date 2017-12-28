package com.huyikang.design.demo;

import com.huyikang.design.model.abstractfactory.Shape;
import com.huyikang.design.model.factory.Human;
import com.huyikang.design.pattern.factory.HumanFactory;
import com.huyikang.design.pattern.factory.ShapeFactory;

public class FactoryDemo {
    
    public static void main(String[] args) {
        HumanFactory humanFactory = new HumanFactory();
        
        Human human1 = humanFactory.getHuman("farmer");
        human1.eat();
        human1.getProfession();
        
        Human human2 = humanFactory.getHuman("teacher");
        human2.eat();
        human2.getProfession();
        
        Human human3 = humanFactory.getHuman("student");
        human3.eat();
        human3.getProfession();
        
        // Shape
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
        
        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
        
        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();
    }

}
