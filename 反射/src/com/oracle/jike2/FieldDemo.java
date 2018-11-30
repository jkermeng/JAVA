package com.oracle.jike2;

import java.awt.Dialog.ModalityType;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
/**
 * ������������ѧϰ
 * setAccessible����ʱ���ŵ�ǰ���Ե�Ȩ�޷���
 * set(obj,str):��obj����ĵ�ǰ��������ֵΪstr
 * @author Administrator
 *
 */
public class FieldDemo {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//Class<? extends Studexnt> c=stu.getClass();
		Studexnt stu=new Studexnt();
		Class c=stu.getClass();
		Field f=c.getDeclaredField("age");
		//ʹ��f�����ָ�˸�ֵ��
		//��ʱ���ŵ�ǰ���Եķ���Ȩ��
		f.setAccessible(true);
		//�����ǰf�����Ӧ��������˽���࣬��ô��Ҫ��ʱ���ŷ���Ȩ��
		//f.set(stu,"����");//��stu�����name����(��f�������õ�)��ֵ��������Ͳ��ԣ�Ҳ�ᱨ��
		f.setInt(stu, 30);
		stu.study();
		//get(obj)����ȡobj�����Ӧ��ǰf�ֶΣ�name��ֵ
		System.out.println("��ȡ�����ֶ�Ϊ��"+f.get(stu));	

//Field����Զ��Բ����õķ���
		System.out.println("��ǰ���Ե�����Ϊ��"+f.getType());
		System.out.println("��ǰ���Ե�����Ϊ��"+f.getName());
		System.out.println("��ǰ���Ե����η�Ϊ��"+f.getModifiers());
		//Modifier���ṩ��һ���������ܽ�int���͵�����ת��Ϊ�ַ���
		System.out.println("��ǰ���Ե����η�Ϊ��"+Modifier.toString(f.getModifiers()));
	}
}