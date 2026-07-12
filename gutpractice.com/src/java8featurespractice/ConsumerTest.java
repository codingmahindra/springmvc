package java8featurespractice;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String []args) {
	
	Consumer<Integer> c1 = (i) -> System.out.println("the square of the given number is "+ i*i);
	
	c1.accept(6);
	

	}
}
