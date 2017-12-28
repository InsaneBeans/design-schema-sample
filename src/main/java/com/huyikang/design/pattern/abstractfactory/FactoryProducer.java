package com.huyikang.design.pattern.abstractfactory;

/**
 * 工厂生成器
 * 
 * @author InsaneBeans
 *
 */
public class FactoryProducer {
    
    /**
     * 根据选择的需要，生成一个功能工厂
     * 
     * @param choice
     * @return
     */
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        } else if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else {
            return null;
        }
    }

}
