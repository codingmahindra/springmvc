package java8featurespractice;

import java.util.List;
import java.util.ArrayList;
//import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamApiUsingMap {
	public static void main(String[]args) {
		
		List<Double> sal = new ArrayList<>();
		sal.add(20000.00);
		sal.add(25000.00);
		sal.add(46000.00);
		sal.add(53000.00);
		
		List<Double> l2 = sal.stream()
							 .filter(i -> i%2==0)
							 .map(i -> i+10000)
							 .sorted()
							 .collect(Collectors.toList());
		System.out.print(l2 + " ");
		
		sal.forEach(System.out::println);
	}
}
