package com.step01;

import java.util.Scanner;

public class No2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int j = sc.nextInt();
		int i = sc.nextInt();
		
		int a= i/100; 
		int b = i%100/10;
		int c = i%100%10;
		System.out.println(j*c);
		System.out.println(j*b);
		System.out.println(j*a);
		System.out.println(j*i);
		
		
	}
}
