package com.oracle.jike2.����ģʽ.���󹤳�ģʽ;

public class text {

	public static void main(String[] args) {

		ICreator c=new CNCreator();
	Iphone i8=c.creatIphone8();
	Iphone ix=c.creatIphoneX();
	i8.play();
	ix.play();
	ICreator c1=new USACreator();
	Iphone USAi8=c1.creatIphone8();
	Iphone USAix=c1.creatIphoneX();
	USAi8.play();
	USAix.play();
	}

}
