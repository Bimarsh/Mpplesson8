package com.pkg.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionTask {

	public static void main(String[] args) {
		/*
		 * (x,y) -> { List<Double> list = new ArrayList<>();
		 * list.add(Math.pow(x,y)); list.add(x * y); return list; };
		 */
		BiFunction<Double, Double, List<Double>> bi = (x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			return list;
		};

		// implementing both ways just for practicing
		bi.apply(2.0, 3.0).forEach(t -> System.out.println(t));
		bi.apply(2.0, 3.0).forEach(System.out::println);

	}
}
