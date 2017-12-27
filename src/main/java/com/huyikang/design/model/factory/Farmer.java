package com.huyikang.design.model.factory;

/**
 * 农民
 * 
 * @author InsaneBeans
 *
 */
public class Farmer implements Person {
    
    private String defaultAction;
    
    private String profession;
    
    public Farmer() {
        this.profession = "农民";
        this.defaultAction = "种庄稼";
    }

    @Override
    public void read() {
        System.out.println("farmer cannot read~");
    }

    @Override
    public void eat() {
        System.out.println("farmer is eating~");
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
