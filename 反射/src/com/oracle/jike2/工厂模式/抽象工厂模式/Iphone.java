package com.oracle.jike2.����ģʽ.���󹤳�ģʽ;
/**
 * ������ĳ���ӿ�
 * @author Administrator
 *
 */
public interface Iphone {
public void play();
}
class CNIphoneX implements Iphone{

	@Override
	public void play() {
System.out.println("�������½���IphoneX");		
	}
	
}
class USAIphoneX implements Iphone{

	@Override
	public void play() {
		System.out.println("�����������IphoneX");				
	}
	
}
class CNIphone8 implements Iphone{

	@Override
	public void play() {
		System.out.println("�������½���Iphone8");
	}
	
}
class USAIphone8 implements Iphone{

	@Override
	public void play() {
		System.out.println("�����������Iphone8");				
	}
	
}