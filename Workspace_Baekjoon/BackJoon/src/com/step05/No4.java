package com.step05;


import java.util.Scanner;

public class No4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int[10]; //10칸짜리 배열을 만든다. 
		int[] rest= new int[42];
		
		int cnt = 0;
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			int tmp = arr[i]%42;
			
			for(int j= 0 ; j<rest.length;j++) {
				if(rest[tmp]==0) {
					cnt++;
					rest[tmp]= -1;
				}
			}
		}
		System.out.println(cnt);
		sc.close();
		
		
		
	}

}
