package com.oracle.jike2.����ģʽ.���󹤳�ģʽ;
/**
 * ������ĳ���ӿ�
 * @author Administrator
 *
 */
public interface ICreator {
public Iphone creatIphoneX();
public Iphone creatIphone8();

}
/**
 * ������������iphone��Ⱥ�Ĺ���
 * @author Administrator
 *
 */
class CNCreator implements ICreator{

	@Override
	public Iphone creatIphoneX() {
		// TODO Auto-generated method stub
		return new CNIphoneX();
	}

	@Override
	public Iphone creatIphone8() {
		// TODO Auto-generated method stub
		return new CNIphone8();
	}
	
}
/**
 * �������������iphone��Ⱥ
 * @author Administrator
 *
 */
class USACreator implements ICreator{

	@Override
	public Iphone creatIphoneX() {
		// TODO Auto-generated method stub
		return new USAIphoneX();
	}

	@Override
	public Iphone creatIphone8() {
		// TODO Auto-generated method stub
		return new USAIphone8();
	}
	
}

