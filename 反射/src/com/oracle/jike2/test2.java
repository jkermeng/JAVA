package com.oracle.jike2;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.jar.Attributes.Name;

/**
 * ʹ��Class������ȡĳ����Ĺؼ���Ϣ
 * @author Administrator
 *
 */
public class test2 {

	public static void main(String[] args) throws SecurityException, Exception {

		Studexnt stu=new Studexnt();
		
		ClassUtil(stu);//��ȡstu����Ϣ
	    String str="123";
	    System.out.println("---------------------");
	   // ClassUtil(str);
	}
public static void ClassUtil(Object obj) throws Exception, SecurityException {
	Class c=obj.getClass();//��ȡ����obj�������Class�����
Package p=c.getPackage();//��ȡC������İ���
System.out.println("�ö���İ���Ϊ��"+p);
String name=c.getName();//��ȡ��İ���+���������ȫ�ƣ�
System.out.println("���ȫ������Ϊ:"+name);
name=c.getSimpleName();//��ȡ�������
System.out.println("�������Ϊ��"+name);
Class c2=c.getSuperclass();//��ȡ���ֱ�Ӹ�������
System.out.println(name+"��ֱ�Ӹ���Ϊ��"+c2.getSimpleName());
//��ȡ��Ľӿ���
Class [] cs=c.getInterfaces();//��ȡ��ʵ�ֵĽӿ�,�ӿڻ�ȡ������ӿ����ݷ���������
System.out.println(name+"��ʵ�ֵĽӿ����£�");
for (Class c3 : cs) {
	System.out.println(c3.getSimpleName());
}
//��ȡ���Ե���Ϣ��fields��:���ַ�ʽ��1��getField��2��getDeclearedFields
//��ʽ1��getFields����ȡ����������ԣ����Ա����ǹ����ģ���ȡ�ķ�ΧΪ��ǰ���Լ����еĸ���
Field [] fs=c.getFields();//��ȡ���еĹ�������
System.out.println(name+"�����й�����������");
for (Field f : fs) {
	System.out.println(f.getName());
}
String fieldName=fs[0].getName();//��ȡ��һ�����Ե�����
Field f=c.getField(fieldName);//�����в����Ƿ���ڶ�Ӧ���ֵĹ������ԣ�������ڣ��򷵻ظ����Զ�����������ڣ��򱨴�
System.out.println("��ȡ���ĵ�һ�����Զ���Ϊ��"+f.getName());
//����2:getDeclearedFields:��ȡ��ǰ����������ԣ����Կ���������ķ������η�
Field fs2[]=c.getDeclaredFields();
for (Field f2 : fs2) {
	System.out.println("��ǰ�����������Ϊ��"+f2.getName());
}
//getDeclearedFields(name),��ȡ��name��ͬ�����������Զ���
System.out.println("----------------------");
//ʹ��Class�����ȡ��ķ�����
//�����ԵĻ�ȡ��ʽ���ƣ�ͬ���ṩ������ ��ʽ
Method[] ms=c.getMethods();
for (Method m : ms) {
	System.out.println("�����ķ���Ϊ��"+m.getName());
}
//��ȡ��ǰ������� ����������������η�������
Method[] ms2=c.getDeclaredMethods();
for (Method m2 : ms2) {
	System.out.println("��ǰ�ඨ��ķ���Ϊ��"+m2.getName());
}
//��ȡ���췽��
//ֻ�ܻ�ȡ��ǰ��Ĺ����Ĺ��췽��
Constructor[] cs2=c.getConstructors();
for (Constructor c4 : cs2) {
	System.out.println("�����Ĺ��췽��Ϊ��"+c4.getName());
}
//��ȡ˽�к͹����Ĺ��췽����
Constructor cs3[]=c.getDeclaredConstructors();
for (Constructor c3 : cs3) {
	System.out.println("���еĹ��췽��Ϊ"+c3.getName());
}
//ͨ��Class��Ĵ�������
Object o=c.newInstance();
Studexnt stu=(Studexnt) o;
stu.study();
//�ж�һ���������ǰ��Class�����Ƿ���ͬ����
Object obj2=new Studexnt();
obj2=new person();
//isInstance(obj)�ж�obj�������Ƿ�͵�ǰClass�����������ͬ;
c.isInstance(obj2.getClass());
boolean b=c.isInstance(obj2);
System.out.println("�ȽϽ����"+b);
//ǿ������ת���ж�
if(Studexnt.class.isInstance(obj2)) {
	System.out.println("������ͬ������ת��");
	Studexnt p2=(Studexnt) obj2;
}
else {
	System.out.println("���Ͳ���ͬ������ת��");
}





}
}
/**
 * �������Բ����һ����
 *
 */

class Studexnt/*����*/ extends person implements Runnable,Serializable{
private String name;/*����*/

private int age;
public void study() {/*����*/
	System.out.println(name+"����ѧϰ");

}
@Override
public void run() {/*���췽��*/

}

public Studexnt() {
	
}
}
class person{
	public int money;
	private String add;
}
