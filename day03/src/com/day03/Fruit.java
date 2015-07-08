package com.day03;

public class Fruit {
	String name;
	int price;
	String addr;
	//构造方法
	Fruit(){
		
	}
	//有参构造方法
	Fruit(String name,int p,String a){
		this.name=name;
		price=p;
		addr=a;
	}
	public static void main(String args[]){
		Fruit f = new Fruit("苹果",5,"山东");
		System.out.println(f.name);
	}

}
