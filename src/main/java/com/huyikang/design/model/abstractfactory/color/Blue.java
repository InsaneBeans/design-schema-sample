package com.huyikang.design.model.abstractfactory.color;

import com.huyikang.design.model.abstractfactory.Color;

/**
 * 蓝色
 * 
 * @author InsaneBeans
 *
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Filling with blue color~");
    }

}
