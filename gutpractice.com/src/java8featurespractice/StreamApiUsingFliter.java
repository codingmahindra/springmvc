package java8featurespractice;

	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.List;
	//import java.util.stream.Collector;
	import java.util.stream.Collectors;

	public class StreamApiUsingFliter {

		public static void main(String[] args) {

			Collection<Integer> c = new ArrayList<>();
			c.add(10);
			c.add(50);
			c.add(20);
			c.add(60);
			c.add(30);
			c.add(3);
			
			/*
			 1)stream
			 2)filter(can accept the predicate) // returns listofdata list<Integer>
			 3)map(if you want to perfrom whole data then we need map .
			 4)sort()(to sort the the getting data)//optional
			 5)collect(Collector.toList()) 
			 */
	List<Integer> l1 =c.stream()
			 .filter(i -> i % 2 == 0)
			 .sorted()
			 .collect(Collectors.toList());
		System.out.println(l1);

		}

	}

