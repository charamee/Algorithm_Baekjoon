package com.step03;

import java.util.Scanner;

public class No2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int arr[] = new int[row];
		
		for(int i=0; i<row;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a+b;
		}
		
		for (int k: arr) {
			System.out.println(k);
		}
	}

}
