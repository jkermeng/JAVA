package com.oracle.jike2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 
 * @author Administrator
 *
 */
public class take {

	public static void main(String[] args) throws Exception {
Class c=teacher.class;
//�����ȡ��Χ�ǵ�ǰ����ѣ�ʹ��getDeclearedMethod��������ȡ����͵�ǰ�๫���ķ�������ʹ��getMethod
		Method m=c.getDeclaredMethod("eat",String.class,String.class);
		System.out.println(m);
		Object t=c.newInstance();//����class���ͱ�������һ�����󣬸ö���Ϊc�������ʵ��������
//Method����ص㷽����invoke������
//		��t�����в����Ƿ��и�m��Ӧ�ķ���������У���ִ�и÷��������������б�����ݴ��ݹ�ȥ
	m.invoke(t, "����","����");
	m=c.getDeclaredMethod("playGame");
	m.setAccessible(true);
	m.invoke(t);//���ִ�еķ�����private����(˽��)�ģ���ô��Ҫ��ִ��setAccessible();
//	MEthod����Բ����õķ�����
	System.out.println("��ǰ���������η�Ϊ:"+Modifier.toString(m.getModifiers()));
	System.out.println("��ǰ�����ķ���ֵ���ͣ�"+m.getReturnType());

	System.out.println("��ǰ������Ϊ��"+m.getName());
	System.out.println("��ǰ�����Ĳ�������Ϊ��"+m.getParameterCount());
	System.out.println("��ǰ�����Ĳ����б���������");
	Class cs[]=m.getParameterTypes();//cs�д��в����б����������

	
	//--------------------------------------
//		m=c.getDeclaredMethod("xunhuan",int.class);
//		System.out.println(m);
	}

}
