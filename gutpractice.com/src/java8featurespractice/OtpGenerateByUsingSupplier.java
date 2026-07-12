package java8featurespractice;

import java.util.function.Supplier;

public class OtpGenerateByUsingSupplier {

	public static void main(String[] args) {
		
		Supplier<String> s = () ->{
			String s1 = " ";
			
			for(int i = 0; i< 6 ; i++ ) {
			 
				s1 = s1 + (int)(Math.random()*10);
				
			}
			return s1;
			
		};
		
		System.out.println("the 6 digits otp is "+ s.get());
		
	}

}



/*

bi predicate

bi function 

bi function


*/