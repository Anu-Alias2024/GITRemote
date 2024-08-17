package com.ust.gitrepository;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the limit");
			int n =sc.nextInt();
			ArrayList<Integer> list =new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				list.add(sc.nextInt());
			}
			int sum=0;
			for(int i : list) {
			//	if(i%2==0) {
					
					sum +=i;
					
				//}
			}
System.out.println(sum);
		}
	}

}
