package com.day03_2;

class Person {
	//属性
	String name;
	int age;
	String address;
/*	
//  无参构造方法
	Person (){
		System.out.println("Person的默认方法被调用");
	}*/
	//有参构造方法
	Person(String n,int a,String add){
		name = n;
		age=a;
		address=add;
		
	}
	//自我介绍
	void introduce(){
		System.out.println("侬好"+"我是"+name+"我"+age+"岁");
			
		}

	public static void main(String[] args) {
		/*Person person=new Person();//实例化一个person对象
		person.name="丽萨贝里";
		person.age=22;*/
		Person person=new Person("jim",30,"beijing");
		person.introduce();
		
	}

}
//当没有构造方法时，系统会自动生成一个默认构造方法。

//构造方法是一种比较特殊的方法
//没有返回类型，方法名和类同名

//有参数的构造方法

