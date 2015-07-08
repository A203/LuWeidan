package com.day03;

public class Phone {
	String name;
	String brand;
	int price;
	void call(){
		System.out.println("打电话。。");
	}
	void sendMsg(){
		System.out.println("发短信。。");
	}

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone iphone=new Phone();
		iphone.name="栓子";
		iphone.brand="苹果";
		System.out.println(iphone.name);
		iphone.call();

	}

}
