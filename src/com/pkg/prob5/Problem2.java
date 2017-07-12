package com.pkg.prob5;

import java.util.Arrays;

public class Problem2 {
	public static void main(String[] args) {
		String[] names = { "Alexis", "Tim", "Kyleen", "KRISTY" };
		Arrays.sort(names, String::compareToIgnoreCase);
		Arrays.sort(names, (String a, String b) -> a.compareTo(b));
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
