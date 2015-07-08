package com.day03;

public class Calculator_ {
	public static void main(String[] args){
		Demo02 c1=new Demo02();
		Demo02 c2=new Demo02();
		c1.a();
		System.out.println(c1.num1);
		System.out.println(c1.num2);
		System.out.println("--------");
		System.out.println(c2.num1);
		System.out.println(c2.num2);
	}
}
class Demo02{
	static int num1=1;//全局变量
	int num2=2;
	void a(){
		num1=9;
		num2=10;
		
	}
}
