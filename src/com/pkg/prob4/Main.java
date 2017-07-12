package com.pkg.prob4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<Product>();
		Product p1 = new Product("a", 5.0, 4);
		Product p2 = new Product("sd", 4.0, 2);
		Product p3 = new Product("sd", 4.0, 3);
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		// a.sorting by price
		System.out.println("Sorting by price....................");
		Comparator<Product> forPrice = (x, y) -> {
			if (x.getPrice() < y.getPrice()) {
				return -1;
			} else if (x.getPrice() > y.getPrice()) {
				return 1;
			}
			return 0;
		};

		Collections.sort(productList, forPrice);
		productList.forEach(System.out::println);
		// b. sorting by using title
		System.out.println("\nSorting by title........................");
		Collections.sort(productList, (obj1, obj2) -> obj1.getTitle()
				.compareTo(obj2.getTitle()));
		productList.forEach(System.out::println);

		// c. sort by decreasing order of price
		Collections.sort(productList, (x, y) -> {
			if (x.getPrice() < y.getPrice())
				return 1;
			else if (x.getPrice() < y.getPrice())
				return -1;
			else
				return 0;
		});
		System.out.println("\n decreasing order of price.............");
		productList.forEach(System.out::print);
		// d. sort by decreasing order of title
		Collections.sort(productList,
				(x, y) -> y.getTitle().compareTo(x.getTitle()));
		System.out.println("\n decreasing order of title............");
		productList.forEach(System.out::println);
		// e. if title is same sort by model
		Collections.sort(productList, (x, y) -> {
			if (x.getTitle().compareTo(y.getTitle()) == 0) {
				return x.getModel() - y.getModel();
			}
			return x.getTitle().compareTo(y.getTitle());

		});
		System.out.println("\n if title is same compare by model");
		productList.forEach(System.out::println);

	}
}
