package com.oracle.jike2.����ģʽ.��������ģʽ;
/**
 * ������ĳ���ӿ�
 * @author Administrator
 *
 */
public interface ICreator {
	/**
	 * ��������ķ���
	 * @return �����Ķ���
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
