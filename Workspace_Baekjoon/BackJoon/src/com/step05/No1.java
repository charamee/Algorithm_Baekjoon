package com.step05;

import java.util.Arrays;
import java.util.Scanner;

public class No1 {
	
	public static void main(String[] args) {
		int value = Integer.parseInt("가나다");
	
		System.out.println(value);
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int []arr= new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
				
		Arrays.sort(arr);
		
		System.out.println(arr[0]+" "+arr[n-1]);
		
		
		
		
		
		
	}

}
