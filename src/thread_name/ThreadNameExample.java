package thread_name;

public class ThreadNameExample {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();	//���� �������� ������ ��ü�� ����
		System.out.println("���α׷� ���� ������ �̸�: " + mainThread.getName());

		ThreadA threadA = new ThreadA();
		System.out.println();
		System.out.println("�۾������� �̸�: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println();
		System.out.println("�۾������� �̸�: " + threadB.getName());
		threadB.start();
		
	}

}
