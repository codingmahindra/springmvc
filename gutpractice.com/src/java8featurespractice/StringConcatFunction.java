package java8featurespractice;


interface interface1{
	
	public abstract void addTwoNames(String n1, String n2);
}



public class StringConcatFunction {

	public static void main(String[] args) {
		
		interface1 i1 = (n1,n2) -> System.out.println(n1.concat(n2));
		
		
		i1.addTwoNames("mahi","manasa");

	}

}
