package com.gemptc.array;

public class ArrayLinda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		//int []a1;
		//int a2[5];//申明时不指定数组长度
		//分配内存空间
		a=new int[3];
		
		int size=5;
		a=new int[size];
		
		//数组初始化
		a[0]=1;
		a[2]=2;
		
		
		//方式二
		int b[]={1,2,3,4,5,6};
		//int b1[]=new int[]{1,2,3,4,5};
		//int B2[]=new int[5]{1,2,3,4,5};//如果设置了初始值就不能再制定长度
		/*int []b3;
		 * b3={1,2,3};
		 */
		//输出a的内容
		System.out.println("数组长度"+b.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//冒泡排序
		int []c={1,2,3,4,5};
		int temp=0;
		for(int i=c.length-1;i>0;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(c[i]<c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c);
		}
		
		
		
		

	}

}
