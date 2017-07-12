package com.pkg.prob2;

import java.util.function.Supplier;

public class RandomNumberUsingInnerClass {

	class In implements Supplier<Double> {

		@Override
		public Double get() {
			// TODO Auto-generated method stub
			return Math.random();
		}

	}

	public static void main(String[] args) {

		RandomNumberUsingInnerClass innerclass = new RandomNumberUsingInnerClass();
		In theInner = innerclass.new In();
		System.out.println(theInner.get());

	}

}
