package com.oracle.jike2.工厂模式;
/**
 * 工厂类
 * @author Administrator
 *
 */
public class Creater {
	
	/**
	 * 使用反射机制来实现对象的创建
	 * @param ClassName
	 * @return
	 */
public static person refeletCreat(String ClassName) {
	person p=null;
	try {
	//通过类的全称获取可的所有信息
	Class c=Class.forName(ClassName);
	
	Object obj=c.newInstance();//调用无参数的构造方法创建对象
	p=(person) obj;
	
	}catch(Exception e) {
	System.out.println("类名出错!!!!");
}
	return p;
	}
	/**
	 * 通过使用者床底的需求来生产部同的对象
	 * @param	name 需求的对象类型名字
	 * @return
	 */
public static person creat(/*写参数*/String name) {
	person p=null;
	switch (name) {
	//如果对象的生产很复杂，那么所有复杂的代码都会写在这里
	case "学生":
		p=new Student();
		break;
	case"老师":
	p=new Teacher();
	break;
	case "雇员":
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
