package com.step05;

import java.util.Scanner;

public class No7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int line = sc.nextInt();
		

		for (int i = 0; i < line; i++) {
			
			int student = sc.nextInt();
			int[] arr = new int[student]; // 학생 수 만큼 배열
			for (int j = 0; j < arr.length; j++) {

				arr[j] = sc.nextInt(); // 0번지부터 길이만큼 점수 넣어줘
			}

			double total = 0;
			double avg = 0;
			double count = 0;
			for (int k = 0; k < arr.length; k++) {
				total += arr[k];
			}
			avg = total / student;

			for (int h = 0; h < arr.length; h++) {
				if (arr[h] > avg) {
					count++;
				}
			}
			double res = count/student*100;
			System.out.printf("%.3f%% \n",res);
		}
	}
}