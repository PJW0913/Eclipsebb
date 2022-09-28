package thread_synchronized;

public class User1 extends Thread {
	
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		setName("User1");
		this.calculator = calculator;
		
	}
	
	public void run() {
		 calculator.setMemory(100);
	}
}
