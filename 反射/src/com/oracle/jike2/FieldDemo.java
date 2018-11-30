package com.oracle.jike2;

import java.awt.Dialog.ModalityType;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
/**
 * 针对属性类进行学习
 * setAccessible：暂时开放当前属性的权限访问
 * set(obj,str):将obj对象的当前属性设置值为str
 * @author Administrator
 *
 */
public class FieldDemo {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//Class<? extends Studexnt> c=stu.getClass();
		Studexnt stu=new Studexnt();
		Class c=stu.getClass();
		Field f=c.getDeclaredField("age");
		//使用f对象对指端赋值、
		//暂时开放当前属性的访问权限
		f.setAccessible(true);
		//如果当前f对象对应的属性是私有类，那么需要暂时开放访问权限
		//f.set(stu,"张三");//对stu对象的name属性(由f对象来得到)赋值，如果类型不对，也会报错
		f.setInt(stu, 30);
		stu.study();
		//get(obj)；获取obj对象对应当前f字段（name）值
		System.out.println("获取到的字段为："+f.get(stu));	

//Field类相对而言不常用的方法
		System.out.println("当前属性的类型为："+f.getType());
		System.out.println("当前属性的名字为："+f.getName());
		System.out.println("当前属性的修饰符为："+f.getModifiers());
		//Modifier类提供有一个方法，能将int类型的整数转换为字符串
		System.out.println("当前属性的修饰符为："+Modifier.toString(f.getModifiers()));
	}
}