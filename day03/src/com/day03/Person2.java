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
		//ʵ����һ��Person����
		Person2 person=new Person2();
		
		//ͨ����ȡ��������ֵ���������Ը�ֵ
		Scanner input = new Scanner(System.in);//java.util
		System.out.println("������������");
		
		//next()��ȡ����������ַ�������
		person.name=input.next();
		System.out.println("���������䣺");
		person.age=input.nextInt();
		System.out.println("��������ߣ�");
		person.height=input.nextInt();
		
		//����introduce����
		person.introduce();
	}
}