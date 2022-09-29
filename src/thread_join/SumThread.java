package thread_join;

public class SumThread extends Thread {
	
	private long sum;
	
	public long getSum() {
		return sum;
	}
	public void run() {
		for(int i =1; i <=1000; i++) {
			sum += i;
		}
	}
}
