package com.oracle.jike2;

public class teacher {
//将对对象的相同的行为抽取出来，将是方法
//	方法的标准格式：方法的修饰符（public private static final） 返回值类型 
//	修饰符  方法名（参数列表）{方法体}
	private String clup;
	public void eat(String food) {
		System.out.println("老师正在吃"+food);
	}
	public void eat(String food1,String food2) {
		System.out.println("正在吃"+food1+"、"+food2);
	}
	private void playGame() {
		System.out.println("正在学习玩游戏");
	}
	//可变形传参数
	public void eat(String ... foods) {
		System.out.println("正在吃");
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i]);
		}
	}
	//如何区分多个方法；通过方法名+参数列表类型和个数来实现
	//为了避免以下情况出现，java远吗使用可变长参数来实现以下内容：(int...is) 代表当前方法需要0个或N个int类型的参数
//	getMethod(name, Class...cs){}  相当于创建下列各重复的方法
//	getMethod(name)
//	getMethod(name,class)
//	getMethod(name,class,class2)
	public void xunhuan(int m) {
		for (int i = 0; i < 10; i++) {
			m+=i;
		}
		System.out.println(m);
	}
	
}
