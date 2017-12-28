package com.huyikang.design.pattern.abstractfactory;

import com.huyikang.design.model.abstractfactory.Color;
import com.huyikang.design.model.abstractfactory.Shape;

/**
 * 抽象工厂类
 * 
 * @author InsaneBeans
 *
 */
public abstract class AbstractFactory {
    
    abstract public Color getColor(String color);
    abstract public Shape getShape(String shapeType);
}
