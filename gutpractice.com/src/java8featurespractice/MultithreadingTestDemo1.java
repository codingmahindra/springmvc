package java8featurespractice;

public class MultithreadingTestDemo1 extends Thread {
	
	@Override
	public void run(){
		
		for(int i = 11 ; i<=20; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String []args) {
		
		MultithreadingTestDemo1 m = new MultithreadingTestDemo1();
		m.start();
		
		
		for(int i = 0 ; i <= 5; i++) {
			
			System.out.println(i);
		}
		
		
	}
}

