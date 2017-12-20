package com.huyikang.design.pattern.singleton;

/**
 * 单例模式
 * 
 * @author huyikang
 *
 */
public class Singleton {
    /**
     * 实例
     */
    private static Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
	
	private Singleton() {
	}

}
