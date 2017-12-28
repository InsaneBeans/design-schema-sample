package com.huyikang.design.model.abstractfactory.color;

import com.huyikang.design.model.abstractfactory.Color;

/**
 * 绿色
 * 
 * @author InsaneBeans
 *
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Filling with green color~");
    }

}
