package com.day03_2;

class Person {
	//����
	String name;
	int age;
	String address;
/*	
//  �޲ι��췽��
	Person (){
		System.out.println("Person��Ĭ�Ϸ���������");
	}*/
	//�вι��췽��
	Person(String n,int a,String add){
		name = n;
		age=a;
		address=add;
		
	}
	//���ҽ���
	void introduce(){
		System.out.println("ٯ��"+"����"+name+"��"+age+"��");
			
		}

	public static void main(String[] args) {
		/*Person person=new Person();//ʵ����һ��person����
		person.name="��������";
		person.age=22;*/
		Person person=new Person("jim",30,"beijing");
		person.introduce();
		
	}

}
//��û�й��췽��ʱ��ϵͳ���Զ�����һ��Ĭ�Ϲ��췽����

//���췽����һ�ֱȽ�����ķ���
//û�з������ͣ�����������ͬ��

//�в����Ĺ��췽��

