package com.day03;

public class student {
	//����
    String name;//���Ե��������� ������
	int age;
	String add;
	//��Ϊ��������
	void/*��������*/ SelfIntroduce()/*������*/
	{
		System.out.println("����"+name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//ʵ����һ��student
		student s=new student();
		s.name="father";
		s.age=22;
		s.add="HongKong";
		System.out.println(s.add);
		s.SelfIntroduce();
	
	}
}
