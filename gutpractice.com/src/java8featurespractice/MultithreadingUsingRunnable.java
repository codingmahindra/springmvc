package java8featurespractice;

public class MultithreadingUsingRunnable {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i <= 10; i++)
				System.out.println(i);
		};

		Thread t = new Thread(r);

		t.start();

		for (int i = 66; i < 100; i++) {
			System.out.println(i);
		}

	}

}
