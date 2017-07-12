package com.pkg.prob1;

import java.util.function.Predicate;

public class MyClass {
	int x;
	int y;

	MyClass(int x, int y) {
		this.x = x;
		this.y = y;
	}

	boolean myMethod(MyClass c1) {
		Predicate<MyClass> val = (obj1) -> equals(c1);
		System.out.println("From the lambda: " + val.test(c1));

		Predicate<MyClass> value = this::equals;
		return value.test(c1);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public static void main(String[] args) {
		MyClass one = new MyClass(1, 2);
		MyClass two = new MyClass(1, 2);
		System.out.println(one.myMethod(two));
	}

}
