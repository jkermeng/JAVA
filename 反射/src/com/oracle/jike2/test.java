package com.oracle.jike2;

public class test {

	public static void main(String[] args) throws ClassNotFoundException {
Class c=Thread.class;//获取Threadl类在Class类中的实例化对象

System.out.println(c);
	Thread th=new Thread();
	Class c2=th.getClass();
	System.out.println("两个Class对象是否相等"+(c==c2));
	//不光用那种方式来获取Class类对象，只要类相同，那么Class类对象也相同，换言之，每个类在Class类中都只存在一个实例化对象
Class c3=Class.forName("java.lang.Thread");//类名必须是全称（包含包名+类名），
	System.out.println(c2==c3);
	
	
	
	}
	

}
