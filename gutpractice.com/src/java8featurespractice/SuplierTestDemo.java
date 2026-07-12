package java8featurespractice;

import java.util.Date;
import java.util.function.Supplier;

public class SuplierTestDemo {

	public static void main(String[] args) {
		
		Supplier<Date> s = ()-> new Date();
		System.out.println(s.get());

	}

}
