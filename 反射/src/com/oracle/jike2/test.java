package com.oracle.jike2;

public class test {

	public static void main(String[] args) throws ClassNotFoundException {
Class c=Thread.class;//��ȡThreadl����Class���е�ʵ��������

System.out.println(c);
	Thread th=new Thread();
	Class c2=th.getClass();
	System.out.println("����Class�����Ƿ����"+(c==c2));
	//���������ַ�ʽ����ȡClass�����ֻҪ����ͬ����ôClass�����Ҳ��ͬ������֮��ÿ������Class���ж�ֻ����һ��ʵ��������
Class c3=Class.forName("java.lang.Thread");//����������ȫ�ƣ���������+��������
	System.out.println(c2==c3);
	
	
	
	}
	

}
