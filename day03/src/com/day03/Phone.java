package com.day03;

public class Phone {
	String name;
	String brand;
	int price;
	void call(){
		System.out.println("��绰����");
	}
	void sendMsg(){
		System.out.println("�����š���");
	}

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone iphone=new Phone();
		iphone.name="˨��";
		iphone.brand="ƻ��";
		System.out.println(iphone.name);
		iphone.call();

	}

}
