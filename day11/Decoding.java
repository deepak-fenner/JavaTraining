package com.celcom.day11;

import java.util.Scanner;

public class Decoding {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.charAt(0) == '0') {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int n = s.length();
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for(int i = 2; i <= n; i++) {
			if(s.charAt(i - 1) != '0') dp[i] += dp[i - 1];
			int temp = Integer.parseInt(s.substring(i - 2, i));
			if(temp >= 10 && temp <= 26) dp[i] += dp[i - 2];
		}
		for(int i = 0; i <= n; i++) {
			System.out.println(dp[i]);
		}
	}

}
