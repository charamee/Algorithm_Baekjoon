package com.step05;

import java.util.Scanner;

public class No2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()
				, sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
		
		int maxVal = 0 ; 
		int count = 0 ; 
		int index = 0; 
		
		for(int val : arr) {
			count++;
			if(val>maxVal) {
				maxVal = val; 
				index = count;
			}
			
		}
		System.out.println(maxVal);
		System.out.println(index);
	}
}
