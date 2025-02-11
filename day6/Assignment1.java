package com.celcom.day6;
import java.util.Scanner;
class DuplicateElementException extends Exception{
	@Override
	public String toString() {
		return "Duplicate Element found";
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					try {
						Scanner sc=new Scanner(System.in);
						System.out.println("Enter the size:");
						int n=sc.nextInt();
						int[]a=new int[n];
						for(int i=0;i<n;i++) {
							System.out.println("Enter the number:");
							int num=sc.nextInt();
							boolean flag=false;
							for(int j=0;j<n;j++) {
								if(a[j]==num) {
									flag=true;
									break;
								}
							}
							if(flag==false) {
								a[i]=num;
							}
							else {
								throw new DuplicateElementException();
							}
					}
				}
					catch(DuplicateElementException e) {
						System.out.println(e);
					}
				
	}

}
