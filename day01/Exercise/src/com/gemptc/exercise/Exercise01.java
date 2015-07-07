package com.gemptc.exercise;

public class Exercise01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15;
		boolean flag=true;//默认num是质数
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println(num+"是质数");
		}

	}

}
