package thread_yield;		//���ǹ��� �ݺ��� �ϴ� �������� ��� �ٸ� �����忡�� ���� �纸

public class ThreadYeild extends Thread {
	 private boolean work = true;
	 
//	public void run() {
//		while(true) {
//			if(work) {
//				System.out.println("ThreadA �۾�����");
//			}
//		}
//	}
	
	public void run() {
		while(true) {
			if(work) {
				System.out.println("ThreadA �۾�����");
			}else {
				Thread.yield();
			}
		}
	}
	
	
}
