package com.huyikang.design.model.factory;

/**
 * 行为接口
 * 
 * @author InsaneBeans
 *
 */
public interface Human {
    
    /**
     * 读书
     */
    void read();
    /**
     * 吃饭
     */
    void eat();
    /**
     * 获得职业
     * 
     * @return 职业
     */
    String getProfession();
    /**
     * 获取默认的行为
     * 
     * @return 默认行为
     */
    String getDefaultAction();
}
