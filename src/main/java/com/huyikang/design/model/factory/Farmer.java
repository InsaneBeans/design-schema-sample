package com.huyikang.design.model.factory;

/**
 * 农民
 * 
 * @author InsaneBeans
 *
 */
public class Farmer implements Human {
    
    private String defaultAction;
    
    private String profession;
    
    public Farmer() {
        this.profession = "Farmer";
        this.defaultAction = "Farming";
    }

    @Override
    public void read() {
        System.out.println("The farmer cannot read~");
    }

    @Override
    public void eat() {
        System.out.println("The farmer is eating~");
    }

    @Override
    public String getProfession() {
        return profession;
    }

    @Override
    public String getDefaultAction() {
        return defaultAction;
    }
    
    
}
