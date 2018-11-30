package com.oracle.jike2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 
 * @author Administrator
 *
 */
public class take {

	public static void main(String[] args) throws Exception {
Class c=teacher.class;
//如果获取范围是当前类而已，使用getDeclearedMethod；如果想获取父类和当前类公开的方法，则使用getMethod
		Method m=c.getDeclaredMethod("eat",String.class,String.class);
		System.out.println(m);
		Object t=c.newInstance();//利用class类型变量创建一个对象，该对象为c所代表的实例化对象
//Method类的重点方法：invoke（）；
//		在t对象中查找是否有跟m对应的方法，如果有，则执行该方法，并将参数列表的数据传递过去
	m.invoke(t, "豆浆","油条");
	m=c.getDeclaredMethod("playGame");
	m.setAccessible(true);
	m.invoke(t);//如果执行的方法是private修饰(私有)的，那么需要先执行setAccessible();
//	MEthod类相对不常用的方法：
	System.out.println("当前方法的修饰符为:"+Modifier.toString(m.getModifiers()));
	System.out.println("当前方法的返回值类型："+m.getReturnType());

	System.out.println("当前方法名为："+m.getName());
	System.out.println("当前方法的参数个数为："+m.getParameterCount());
	System.out.println("当前方法的参数列表类型如下");
	Class cs[]=m.getParameterTypes();//cs中存有参数列表的所有类型

	
	//--------------------------------------
//		m=c.getDeclaredMethod("xunhuan",int.class);
//		System.out.println(m);
	}

}
