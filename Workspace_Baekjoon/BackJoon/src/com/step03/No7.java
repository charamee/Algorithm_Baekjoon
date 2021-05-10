package com.step03;

import java.util.Scanner;

public class No7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int arr[] = new int[test];
		for(int i = 0; i< test;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a+b ; 
		}
		
		int x = 0;
		for(int j : arr) {
			x++;
			System.out.printf("Case #%d: %d \n",x,j);
		}
		
	}
}
