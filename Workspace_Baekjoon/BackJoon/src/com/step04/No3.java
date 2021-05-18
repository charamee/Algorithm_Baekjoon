package com.step04;

import java.util.Scanner;

public class No3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //26 
		
		int num1=0;
		int num2=0;
		
		int tmp=0; 
		int cmp = 0; //1
		int res= num; //26
		
		
		
		do {
			num1= res/10; //2 //6
			num2 = res%10; //6 //8
			
			tmp = num1 + num2; //8
			
			if(tmp>=10) {
				tmp=tmp%10;
			}
			 
			res= num2*10+tmp; //68
			
			cmp++;
			
		}while(num!=res); 
		
		System.out.println(cmp);
	}

}
