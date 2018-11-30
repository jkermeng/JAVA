package com.oracle.jike2.工厂模式;

public class test2 {

	public static void main(String[] args) {
		person p=null;
		p=Creater.refeletCreat("com.oracle.jike2.工厂模式.Leader");
		p.study();
	}

}
