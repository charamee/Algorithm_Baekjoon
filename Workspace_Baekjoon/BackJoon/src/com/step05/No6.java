package com.step05;

import java.util.Arrays;
import java.util.Scanner;

public class No6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		String arr [] = new String[test];
		String brr [] = null; 
		for(int i = 0 ; i<test;i++) {
			arr[i] = sc.next();
			
			brr = arr[i].split("");
			
			int cnt = 0 ; 
			int sum = 0; 
			
			for(int j=0; j<brr.length;j++) {
				if(brr[j].equals("O")) {
					
					cnt++; // 1 
				}else {
					cnt = 0 ; 
				}
				sum += cnt;
				
			}
			System.out.println(sum);
		}
		
	}
}
