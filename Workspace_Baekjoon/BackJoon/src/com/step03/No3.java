package com.step03;

import java.util.Scanner;

public class No3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt=0;
		
		for (int i = 1; i<n+1;i++) {
			cnt+=i; //cnt = cnt+i;
		}
		System.out.println(cnt);
	}
}
