package com.oracle.jike2.����ģʽ.��������ģʽ;

public class test {

	public static void main(String[] args) {

		ICreator ic=new stuCreator();
		ICreator ic1=new teacherCreator();
		ICreator ic2=new employeeCreator();
		//����ӿڱ��
		person p=ic.creat();
		person p1=ic1.creat();
		person p2=ic2.creat();
		p.printMsg();
		p1.printMsg();
		p2.printMsg();
		
	}

}
