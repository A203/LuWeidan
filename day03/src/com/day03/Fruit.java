package com.day03;

public class Fruit {
	String name;
	int price;
	String addr;
	//���췽��
	Fruit(){
		
	}
	//�вι��췽��
	Fruit(String name,int p,String a){
		this.name=name;
		price=p;
		addr=a;
	}
	public static void main(String args[]){
		Fruit f = new Fruit("ƻ��",5,"ɽ��");
		System.out.println(f.name);
	}

}
