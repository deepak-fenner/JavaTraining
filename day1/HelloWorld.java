package com.celcom.day1;
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f;
		int count=1;
		int val=1;
		for(int i=1;i<=(n*(n+1))/2;i++) {
			f=0;
			System.out.print("*"+" ");
			if(count%val==0) {
				System.out.println();
				val+=1;
				count=1;
				f=1;
			}
			if(f==0) {
				count+=1;
			}
			
		}

	}

}
