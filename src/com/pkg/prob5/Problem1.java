package com.pkg.prob5;

import java.util.Arrays;
import java.util.List;

public class Problem1 {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange",
				"Cherries", "blums");
		// using lambdas
		System.out.println("Using lambdas.......");
		fruits.forEach(t -> System.out.println(t));
		// using method reference
		System.out.println("\nUsing method refernce");
		fruits.forEach(System.out::println);

	}
}
