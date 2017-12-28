package com.huyikang.design.pattern.singleton;

import com.huyikang.design.model.factory.Student;

/**
 * 单例模式
 * 
 * @author huyikang
 *
 */
public class Singleton {
    /**
     * 唯一实例
     */
    private static Singleton instance = new Singleton();
	
    
    /**
     * 只能通过这一个静态方法获取到实例，而且这个实例是全局通用的
     * 
     * @return 单例对象
     */
	public static Singleton getInstance() {
		return instance;
	}
	
	private Singleton() {
	}
	
    public static Student createStudent(String stuId, String stuName, String stuGrade) {
        return new Student(stuId, stuName, stuGrade);
    }

}
