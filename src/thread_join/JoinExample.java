package thread_join;

public class JoinExample {

	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sum: " + sumThread.getSum());

	}

}
