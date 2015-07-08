package com.day03;

import java.util.Scanner;

class Person2{
	String name;
	int age;
	int height;
	
	void introduce(){
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("height:"+height);
	}
	public static void main(String args[]){
		//实例化一个Person对象
		Person2 person=new Person2();
		
		//通过获取外界输入的值给三个属性赋值
		Scanner input = new Scanner(System.in);//java.util
		System.out.println("请输入姓名：");
		
		//next()获取键盘输入的字符串数据
		person.name=input.next();
		System.out.println("请输入年龄：");
		person.age=input.nextInt();
		System.out.println("请输入身高：");
		person.height=input.nextInt();
		
		//调用introduce方法
		person.introduce();
	}
}