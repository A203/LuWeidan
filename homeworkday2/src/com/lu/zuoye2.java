package com.lu;

public class zuoye2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [][] shuJus=new int[20][8];
			String [] biaoTi={"  ","core C++","coreJava","Servlet","        JSP","        EJB","总分","平均分"};//加了空格
			for(int i=0;i<biaoTi.length;i++)
			{
				System.out.print(biaoTi[i]+"\t");
			}
			    System.out.println();
			for(int h=0;h<shuJus.length;h++)
			{
				int m=0;
				for(int l=0;l<5;l++)
				{
					shuJus[h][l]=(int)(Math.random()*90+10);
					m=m+shuJus[h][l];
					System.out.print("\t"+shuJus[h][l]+"\t");
				}
				System.out.print(m);
				System.out.print("\t"+m/(shuJus[h].length-3));
				System.out.println();
			}
		}

	}

