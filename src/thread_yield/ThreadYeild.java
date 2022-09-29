package thread_yield;		//무의미한 반복을 하는 스레드일 경우 다른 스레드에게 실행 양보

public class ThreadYeild extends Thread {
	 private boolean work = true;
	 
//	public void run() {
//		while(true) {
//			if(work) {
//				System.out.println("ThreadA 작업내용");
//			}
//		}
//	}
	
	public void run() {
		while(true) {
			if(work) {
				System.out.println("ThreadA 작업내용");
			}else {
				Thread.yield();
			}
		}
	}
	
	
}
