package com.oracle.jike2.工厂模式.抽象工厂模式;
/**
 * 对象类的抽象接口
 * @author Administrator
 *
 */
public interface Iphone {
public void play();
}
class CNIphoneX implements Iphone{

	@Override
	public void play() {
System.out.println("正在玩大陆版的IphoneX");		
	}
	
}
class USAIphoneX implements Iphone{

	@Override
	public void play() {
		System.out.println("正在玩美版的IphoneX");				
	}
	
}
class CNIphone8 implements Iphone{

	@Override
	public void play() {
		System.out.println("正在玩大陆版的Iphone8");
	}
	
}
class USAIphone8 implements Iphone{

	@Override
	public void play() {
		System.out.println("正在玩美版的Iphone8");				
	}
	
}