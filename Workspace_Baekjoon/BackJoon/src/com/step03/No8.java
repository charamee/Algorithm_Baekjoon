package com.step03;

import java.util.Scanner;

public class No8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int brr[] = new int[n];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			brr[i] = sc.nextInt();
			
			
		}
		for(int i= 0; i<arr.length;i++) {
			System.out.println("Case #"+(i+1)+":"+arr[i]+"+"+brr[i]+"="+ (arr[i]+brr[i]));	
		}
		
		
		
	}

}
