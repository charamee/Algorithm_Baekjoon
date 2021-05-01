package com.step02;

import java.util.Scanner;



public class No9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i<=100 && i>89) {
			System.out.println("A");
		}
		else if(i<90 && i>79) {
			System.out.println("B");
			
		}
		else if(i<80 && i>69) {
			System.out.println("C");
		}
		else if(i<70 && i>59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		sc.close();
		
		
	}
}
