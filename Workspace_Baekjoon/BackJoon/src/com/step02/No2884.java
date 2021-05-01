package com.step02;


import java.util.Scanner;

public class No2884 {
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m-45>=0) {
			m= m-45;
		}
		
		if(m-45<0) {
			m= m+15;
			h= h-1;
		}
		
		if(h==-1) {
			h=23;
		}
		System.out.println(h +" " +m);
		
	}
}
