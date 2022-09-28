package thread_synchronized;

public class Calculator {

	private int memory;
	
	public int getMomory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
}
