package com.step04;

import java.util.Scanner;

public class No1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		while(i==0) {
			
			
			int a = sc.nextInt();
			int b = sc.nextInt();		
			
			
			if(a==0 && b==0) {
				i++;
			}else{
				System.out.println(a+b);
			}
			
		}
		
		
	}

}
