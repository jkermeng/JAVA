package com.oracle.jike2;

import java.lang.reflect.Constructor;

public class construtor {

	public static void main(String[] args) throws Exception {
		Class c=teacher.class;
		//ct代表teacher类无参数的构造方法，如果需要带参数的，就将参数类型写入参数列表中
		Constructor ct=c.getConstructor();
//		Constructor 重点方法； newInstance()：可以调用任意的构造方法
//		Class类的newInstance();只能调用类的无参数构造方法
		
		Object obj=ct.newInstance();
		System.out.println("创建的对象类型为："+obj.getClass().getSimpleName());
		ct.getModifiers();//获取访问修饰符
		ct.getParameterCount();//获取参数个数
		ct.getParameterTypes();//获取参数类型
	}

}
