package com.step05;

import java.util.Scanner;

public class No3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int x = (a*b*c); 
		String s = String.valueOf(x);
		
		String arr[] = s.split("");
		
		String [] brr = {"0","1", "2", "3", "4", "5", "6","7","8","9"};
		
		int cnt = 0;
		for(int i = 0 ; i<10;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j].equals(brr[i])) {
				 cnt++;
				}
			}
			System.out.println(cnt);
			cnt=0;
		}
	}

}
