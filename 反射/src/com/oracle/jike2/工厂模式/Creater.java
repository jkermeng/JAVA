package com.oracle.jike2.����ģʽ;
/**
 * ������
 * @author Administrator
 *
 */
public class Creater {
	
	/**
	 * ʹ�÷��������ʵ�ֶ���Ĵ���
	 * @param ClassName
	 * @return
	 */
public static person refeletCreat(String ClassName) {
	person p=null;
	try {
	//ͨ�����ȫ�ƻ�ȡ�ɵ�������Ϣ
	Class c=Class.forName(ClassName);
	
	Object obj=c.newInstance();//�����޲����Ĺ��췽����������
	p=(person) obj;
	
	}catch(Exception e) {
	System.out.println("��������!!!!");
}
	return p;
	}
	/**
	 * ͨ��ʹ���ߴ��׵�������������ͬ�Ķ���
	 * @param	name ����Ķ�����������
	 * @return
	 */
public static person creat(/*д����*/String name) {
	person p=null;
	switch (name) {
	//�������������ܸ��ӣ���ô���и��ӵĴ��붼��д������
	case "ѧ��":
		p=new Student();
		break;
	case"��ʦ":
	p=new Teacher();
	break;
	case "��Ա":
	p=new Employee();
	break;
	default:
		break;
	}
	return p;

}
//	public static Student creatStu() {
//		return new Student();
//	}
//	public static Teacher creatThc() {
//		return new Teacher();
	//}
}
