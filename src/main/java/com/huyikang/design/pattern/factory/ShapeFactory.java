package com.huyikang.design.pattern.factory;

import com.huyikang.design.model.abstractfactory.Shape;
import com.huyikang.design.model.abstractfactory.shape.Circle;
import com.huyikang.design.model.abstractfactory.shape.Rectangle;
import com.huyikang.design.model.abstractfactory.shape.Square;

public class ShapeFactory {
    
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
         }        
         if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
         } else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
         } else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
         }
         return null;
    }

}
