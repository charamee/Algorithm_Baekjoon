package com.step05;

import java.util.Arrays;
import java.util.Scanner;

public class No5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double arr [] = new double [n];
		
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		double sum = 0;
		double avg = 0;
		
		for(int j = 0;j<n; j++) {
		 	arr[j] = arr[j]/arr[n-1]*100;
		 	sum+=arr[j];
		}
		
		avg = sum/n;
		System.out.println(avg);
	}
}
