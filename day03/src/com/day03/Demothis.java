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
		this.name = name;//thisָ��ǰʵ������  
		this.age = age;
	}

	public Person1(String name, int age, String address) {
		this(name,age);//�ڹ��췽���б����ǵ�һ�仰
		this.address = address;
	}
	
	public void printS()
	{
		System.out.println('S');
	}
	
	//Person this = new Person();
//	thisָ��ǰ����
//	1.this�����ڹ��췽���ڲ�����������ͬ���ĳ�Ա�����;ֲ����� 
	//3.this �����������ó�Ա���Ժͳ�Ա����
}