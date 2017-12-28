package com.huyikang.design.pattern.abstractfactory;

import com.huyikang.design.model.abstractfactory.Color;
import com.huyikang.design.model.abstractfactory.Shape;
import com.huyikang.design.model.abstractfactory.color.Blue;
import com.huyikang.design.model.abstractfactory.color.Green;
import com.huyikang.design.model.abstractfactory.color.Yellow;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
         }        
         if(color.equalsIgnoreCase("yellow")){
            return new Yellow();
         } else if(color.equalsIgnoreCase("green")){
            return new Green();
         } else if(color.equalsIgnoreCase("blue")){
            return new Blue();
         }
         return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

}
