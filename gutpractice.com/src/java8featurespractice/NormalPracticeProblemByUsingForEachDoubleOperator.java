package java8featurespractice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class NormalPracticeProblemByUsingForEachDoubleOperator {

/*	
	public static void main(String []args) {
		List<Integer> l1 = Arrays.asList(5,4,8,9,0,2,7);
		List<Integer>l2 = l1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		l2.forEach(System.out::println);
		
	}
*/
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size");
		
		int n = sc.nextInt();
		
		List<Integer> l = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			
			l.add(sc.nextInt());
		}
		
		List<Integer> l2 = l.stream().filter(i -> i%2 == 0).sorted().collect(Collectors.toList());
		
	//	l2.forEach(System.out::print);
		l2.forEach(i -> System.out.println(i + " "));
		
		
	}
	

	}
