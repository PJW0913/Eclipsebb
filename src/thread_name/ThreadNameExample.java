package thread_name;

public class ThreadNameExample {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();	//현재 실행중인 쓰레드 객체를 리턴
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());

		ThreadA threadA = new ThreadA();
		System.out.println();
		System.out.println("작업스레드 이릅: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println();
		System.out.println("작업스레드 이름: " + threadB.getName());
		threadB.start();
		
	}

}
