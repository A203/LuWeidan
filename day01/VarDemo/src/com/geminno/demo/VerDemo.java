package com.geminno.demo;

public class VerDemo {
	static int number;//定义类对象
	int age;//定义实例变量
	public void varDefine()
	{

	int $123;
	int productPrice;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VerDemo demo1=new VerDemo();
		demo1.show();
		
		VerDemo demo2=new VerDemo();
		demo1.show();
	
	}
	public void show()
	{
		age++;
		System.out.println(age);
	}
	/*
	 * public static void main(String[] args) {
		// TODO Auto-generated method stub
		VerDemo demo1=new VerDemo();
		demo1.show();
		
		VerDemo demo2=new VerDemo();
		demo1.show();

	}
	public void show()
	{
		number++;
		System.out.println(number);
	}
	*/
	//boolean flag=true;
	//int m=0;
	//		if(flag&&(++m)>0){
		//	}
			
		//		System.out.println(m);
        
	//位操作
    int a=3;//00000000 00000000 00000000 00000011
    int b=2;//00000000 00000000 00000000 00000010
    System.out.println("a&b"+(a&b));
}

}
