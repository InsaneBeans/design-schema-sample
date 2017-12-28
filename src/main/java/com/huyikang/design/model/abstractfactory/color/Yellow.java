package com.huyikang.design.model.abstractfactory.color;

import com.huyikang.design.model.abstractfactory.Color;

/**
 * 黄色
 * 
 * @author InsaneBeans
 *
 */
public class Yellow implements Color {

    @Override
    public void fill() {
        System.out.println("Filling with yellow color~");
    }

}
