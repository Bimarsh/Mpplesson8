package com.pkg.prob2;

import java.util.function.Supplier;

public class RandomUsingLambdaExpression {
	public static void main(String[] arg) {
		Supplier<Double> doub = () -> Math.random();
		System.out.println(doub.get());

	}

}
