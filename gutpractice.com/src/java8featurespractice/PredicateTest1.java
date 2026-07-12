package java8featurespractice;

import java.util.function.Predicate;

public class PredicateTest1 {

	public static void main(String[] args) {

		Predicate<Integer> p = (i) -> i%2== 0;
		System.out.println("the given number is even "+ p.test(10));
	
	}

}
