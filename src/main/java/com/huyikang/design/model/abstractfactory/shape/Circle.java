package com.huyikang.design.model.abstractfactory.shape;

import com.huyikang.design.model.abstractfactory.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle~");
    }

}
