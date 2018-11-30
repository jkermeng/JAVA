package com.oracle.jike2.工厂模式.抽象工厂模式;
/**
 * 工厂类的抽象接口
 * @author Administrator
 *
 */
public interface ICreator {
public Iphone creatIphoneX();
public Iphone creatIphone8();

}
/**
 * 用于生产国内iphone族群的工厂
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
 * 用于生产美版的iphone族群
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

