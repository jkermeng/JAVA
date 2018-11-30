package com.oracle.jike2.工厂模式;

public class test {

	public static void main(String[] args) {

person p=null;
p=Creater.creat("学生");
System.out.println("获取的对象的类型为："+p.getClass());

p=Creater.creat("老师");
System.out.println("获取的对象的类型为："+p.getClass());

	}

}
