package com.celcom.day4;
import java.util.Scanner;
public class PronicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int flag=0;
		for(int i=1;i<=num/2;i++) {
			if(i*(i+1)==num) {
				flag=1;
				System.out.println("Pronic Number");
				break;
			}
		}
		if(flag==0) {
			System.out.println("Not a Pronic Number");
		}

	}

}
