package com.oracle.jike2;

public class teacher {
//���Զ������ͬ����Ϊ��ȡ���������Ƿ���
//	�����ı�׼��ʽ�����������η���public private static final�� ����ֵ���� 
//	���η�  �������������б�{������}
	private String clup;
	public void eat(String food) {
		System.out.println("��ʦ���ڳ�"+food);
	}
	public void eat(String food1,String food2) {
		System.out.println("���ڳ�"+food1+"��"+food2);
	}
	private void playGame() {
		System.out.println("����ѧϰ����Ϸ");
	}
	//�ɱ��δ�����
	public void eat(String ... foods) {
		System.out.println("���ڳ�");
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i]);
		}
	}
	//������ֶ��������ͨ��������+�����б����ͺ͸�����ʵ��
	//Ϊ�˱�������������֣�javaԶ��ʹ�ÿɱ䳤������ʵ���������ݣ�(int...is) ����ǰ������Ҫ0����N��int���͵Ĳ���
//	getMethod(name, Class...cs){}  �൱�ڴ������и��ظ��ķ���
//	getMethod(name)
//	getMethod(name,class)
//	getMethod(name,class,class2)
	public void xunhuan(int m) {
		for (int i = 0; i < 10; i++) {
			m+=i;
		}
		System.out.println(m);
	}
	
}
