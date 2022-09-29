package thread_unjoin;

public class JoinExample {

	public static void main(String[] args) {

		SumThread sumThread = new SumThread();
		sumThread.start();
		
		System.out.println("sum: " + sumThread.getSum());
	}

}
