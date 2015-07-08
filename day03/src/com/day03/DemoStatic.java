package com.day03;

public class DemoStatic {
	int age;
    void hello(){
		System.out.println("hello...");
	}
    static String name ="长孙三";
    
    //静态方法，也称之为类方法
    static void hi(){
    	System.out.println("hi...");
    }
	public static void main(String[] args) {
		DemoStatic d =new DemoStatic();
		
	/*	
	//当我们调用属性和方法的时候，一定是调用某个实例对象的属性或方法 
	 * d.age=10;
		d.hello();*/
		System.out.println(DemoStatic.name);
		DemoStatic.hi();
		d.hi();
	}

}
