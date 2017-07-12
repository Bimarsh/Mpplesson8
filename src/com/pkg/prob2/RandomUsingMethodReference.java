package com.pkg.prob2;

import java.util.function.Supplier;

public class RandomUsingMethodReference {

	public static void main(String[] args) {

		Supplier<Double> supp = Math::random;
		System.out.println(supp.get());

	}
}
