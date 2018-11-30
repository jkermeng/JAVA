package com.oracle.jike2;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.jar.Attributes.Name;

/**
 * 使用Class类来获取某个类的关键信息
 * @author Administrator
 *
 */
public class test2 {

	public static void main(String[] args) throws SecurityException, Exception {

		Studexnt stu=new Studexnt();
		
		ClassUtil(stu);//获取stu的信息
	    String str="123";
	    System.out.println("---------------------");
	   // ClassUtil(str);
	}
public static void ClassUtil(Object obj) throws Exception, SecurityException {
	Class c=obj.getClass();//获取对象obj所在类的Class类对象
Package p=c.getPackage();//获取C所在类的包名
System.out.println("该对象的包名为："+p);
String name=c.getName();//获取类的包名+类名（类的全称）
System.out.println("类的全称名字为:"+name);
name=c.getSimpleName();//获取类的类名
System.out.println("类的类名为："+name);
Class c2=c.getSuperclass();//获取类的直接父类类型
System.out.println(name+"的直接父类为："+c2.getSimpleName());
//获取类的接口名
Class [] cs=c.getInterfaces();//获取类实现的接口,接口获取到多个接口数据放入数组中
System.out.println(name+"类实现的接口如下：");
for (Class c3 : cs) {
	System.out.println(c3.getSimpleName());
}
//获取属性的信息（fields）:两种方式：1、getField；2、getDeclearedFields
//方式1、getFields：获取类的所有属性，属性必须是公开的，获取的范围为当前类以及所有的父类
Field [] fs=c.getFields();//获取所有的公开属性
System.out.println(name+"类所有公开属性如下");
for (Field f : fs) {
	System.out.println(f.getName());
}
String fieldName=fs[0].getName();//获取第一个属性的名字
Field f=c.getField(fieldName);//在类中查找是否存在对应名字的公开属性，如果存在，则返回该属性对象，如果不存在，则报错
System.out.println("获取到的第一个属性对象为："+f.getName());
//方法2:getDeclearedFields:获取当前类的所有属性，属性可以是任意的访问修饰符
Field fs2[]=c.getDeclaredFields();
for (Field f2 : fs2) {
	System.out.println("当前类的属性名字为："+f2.getName());
}
//getDeclearedFields(name),获取跟name相同的类名的属性对象
System.out.println("----------------------");
//使用Class对象获取类的方法名
//与属性的获取方式类似，同样提供了两种 方式
Method[] ms=c.getMethods();
for (Method m : ms) {
	System.out.println("公开的方法为："+m.getName());
}
//获取当前类的所有 方法，任意访问修饰符均可以
Method[] ms2=c.getDeclaredMethods();
for (Method m2 : ms2) {
	System.out.println("当前类定义的方法为："+m2.getName());
}
//获取构造方法
//只能获取当前类的公开的构造方法
Constructor[] cs2=c.getConstructors();
for (Constructor c4 : cs2) {
	System.out.println("公开的构造方法为："+c4.getName());
}
//获取私有和公开的构造方法：
Constructor cs3[]=c.getDeclaredConstructors();
for (Constructor c3 : cs3) {
	System.out.println("所有的构造方法为"+c3.getName());
}
//通过Class类的创建对象
Object o=c.newInstance();
Studexnt stu=(Studexnt) o;
stu.study();
//判断一个对象跟当前类Class对象是否相同类型
Object obj2=new Studexnt();
obj2=new person();
//isInstance(obj)判断obj的类型是否和当前Class类对象类型相同;
c.isInstance(obj2.getClass());
boolean b=c.isInstance(obj2);
System.out.println("比较结果："+b);
//强制类型转换判断
if(Studexnt.class.isInstance(obj2)) {
	System.out.println("类型相同，可以转换");
	Studexnt p2=(Studexnt) obj2;
}
else {
	System.out.println("类型不相同，不能转换");
}





}
}
/**
 * 功能相对圆满的一个类
 *
 */

class Studexnt/*类名*/ extends person implements Runnable,Serializable{
private String name;/*属性*/

private int age;
public void study() {/*方法*/
	System.out.println(name+"正在学习");

}
@Override
public void run() {/*构造方法*/

}

public Studexnt() {
	
}
}
class person{
	public int money;
	private String add;
}
