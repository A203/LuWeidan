package com.day03;

public class DemoStatic {
	int age;
    void hello(){
		System.out.println("hello...");
	}
    static String name ="������";
    
    //��̬������Ҳ��֮Ϊ�෽��
    static void hi(){
    	System.out.println("hi...");
    }
	public static void main(String[] args) {
		DemoStatic d =new DemoStatic();
		
	/*	
	//�����ǵ������Ժͷ�����ʱ��һ���ǵ���ĳ��ʵ����������Ի򷽷� 
	 * d.age=10;
		d.hello();*/
		System.out.println(DemoStatic.name);
		DemoStatic.hi();
		d.hi();
	}

}
