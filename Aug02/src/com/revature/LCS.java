package com.revature;

public class LCS {

	public static void LongestCommonSubsequence(String a, String b) {
		char[] ac = a.toLowerCase().toCharArray();
		char[] bc = b.toLowerCase().toCharArray();
		int al = a.length();
		int bl = b.length();
		int lengthT = LCSTabulation(ac, bc, al, bl);
		System.out.println(a + " and " + b +  " have a longest common subsequence of " + lengthT);
		return;
	}
	
	private static int LCSTabulation(char[] a, char[] b, int al, int bl) {
		int[][] table = new int[al+1][bl+1];
		
		for(int i = 0; i <= al; i++) {
			for(int j = 0; j <= bl; j++) {
				if(i == 0 || j == 0) {
					table[i][j] = 0;
				} else if(a[i-1] == b[j-1]) {
					table[i][j] = table[i-1][j-1] + 1;
				} else {
					table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
				}
			}
		}
		
		return table[al][bl];
	}
}
