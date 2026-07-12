package java8featurespractice;

import java.util.function.Function;

public class FunctionTestDemo1 {
	
	public static void main(String []args) {

	Function<Integer,Integer> f = (i) ->  i*i;
	System.out.println("the square of the given number is "+ f.apply(10));
	
	System.out.println("****************");
	
	
	Function<String,Integer> f1 =(i1) -> i1.length();
	System.out.println("length of the is string is "+ f1.apply("manasa"));
	
	
	
	}
}
