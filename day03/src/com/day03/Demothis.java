package com.day03;
public class Demothis { 
	public static void main(String[] args) {
			Person1 p =new Person1();
			p.printS();
	}	
}
class Person1{
	String name;
	int age;
	String address;
	public Person1() {
		// TODO Auto-generated constructor stub
	}
	
	public Person1(String name, int age) {
		this.name = name;//this指当前实例对象  
		this.age = age;
	}

	public Person1(String name, int age, String address) {
		this(name,age);//在构造方法中必须是第一句话
		this.address = address;
	}
	
	public void printS()
	{
		System.out.println('S');
	}
	
	//Person this = new Person();
//	this指当前对象
//	1.this可用于构造方法内部，用来区分同名的成员变量和局部变量 
	//3.this 可以用于条用成员属性和成员方法
}