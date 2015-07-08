package com.day03;

public class student {
	//属性
    String name;//属性的数据类型 属性名
	int age;
	String add;
	//行为（方法）
	void/*返回类型*/ SelfIntroduce()/*方法名*/
	{
		System.out.println("我是"+name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//实例化一个student
		student s=new student();
		s.name="father";
		s.age=22;
		s.add="HongKong";
		System.out.println(s.add);
		s.SelfIntroduce();
	
	}
}
