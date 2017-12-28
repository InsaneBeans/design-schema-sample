package com.huyikang.design.demo;

import com.huyikang.design.model.abstractfactory.Color;
import com.huyikang.design.model.abstractfactory.Shape;
import com.huyikang.design.pattern.abstractfactory.AbstractFactory;
import com.huyikang.design.pattern.abstractfactory.FactoryProducer;

/**
 * 抽象 工厂模式Demo
 * 
 * @author InsaneBeans
 *
 */
public class AbstractFactoryDemo {
    
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        //获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape("circle");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取形状为 Rectangle 的对象
        Shape shape2 = shapeFactory.getShape("rectangle");

        //调用 Rectangle 的 draw 方法
        shape2.draw();
        
        //获取形状为 Square 的对象
        Shape shape3 = shapeFactory.getShape("square");

        //调用 Square 的 draw 方法
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor("yellow");

        //调用 Red 的 fill 方法
        color1.fill();

        //获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor("green");

        //调用 Green 的 fill 方法
        color2.fill();

        //获取颜色为 Blue 的对象
        Color color3 = colorFactory.getColor("blue");

        //调用 Blue 的 fill 方法
        color3.fill();
     }
}
