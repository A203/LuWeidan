package com.gemptc.array;

public class Arraymaopaopaixu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
