package com.oracle.jike2;

import java.lang.reflect.Constructor;

public class construtor {

	public static void main(String[] args) throws Exception {
		Class c=teacher.class;
		//ct����teacher���޲����Ĺ��췽���������Ҫ�������ģ��ͽ���������д������б���
		Constructor ct=c.getConstructor();
//		Constructor �ص㷽���� newInstance()�����Ե�������Ĺ��췽��
//		Class���newInstance();ֻ�ܵ�������޲������췽��
		
		Object obj=ct.newInstance();
		System.out.println("�����Ķ�������Ϊ��"+obj.getClass().getSimpleName());
		ct.getModifiers();//��ȡ�������η�
		ct.getParameterCount();//��ȡ��������
		ct.getParameterTypes();//��ȡ��������
	}

}
