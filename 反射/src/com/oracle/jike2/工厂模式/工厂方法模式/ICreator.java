package com.oracle.jike2.工厂模式.工厂方法模式;
/**
 * 工厂类的抽象接口
 * @author Administrator
 *
 */
public interface ICreator {
	/**
	 * 生产对象的方法
	 * @return 生产的对象
	 */
public person creat();
}
class stuCreator implements ICreator {

	@Override
	public person creat() {
		return new student();
	}
} 
class teacherCreator implements ICreator{

	@Override
	public person creat() {
		return new teacher();
	}
}
class employeeCreator implements ICreator{

	@Override
	public person creat() {
		return new employee();
	}

	
	
}
