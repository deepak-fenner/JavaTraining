package com.celcom.day11;
import java.util.Scanner;
public class Heist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter te sum");
		int s=sc.nextInt();
		int start=0;
		int end=0;
		int sum;
		int flag=0;
		boolean valid=false;
		for(int i=0;i<a.length;i++) {
			sum=0;
			flag=0;
			start=0;
			end=0;
			for(int j=i;j<a.length;j++) {
				if(sum==s) {
					start=i;
					end=j;
					flag=1;
					valid=true;
					break;
				}
				else if(sum>s) {
					break;
				}
				sum+=a[j];
			}
			if(flag==1) {
				for(int k=start;k<end;k++) {
					System.out.print(a[k]+" ");
				}
			}
			System.out.println();
		}
		if(valid==false) {
			System.out.println("No amount detected");
		}
		

	}

}
