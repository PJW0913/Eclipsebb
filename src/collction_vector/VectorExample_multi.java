package collction_vector;

import java.util.List;
import java.util.Vector;

public class VectorExample_multi {

	public static void main(String[] args) {

		List<Board> list = new Vector<Board>();
		
		class ThreadA extends Thread{
			
			public void run() {
				for(int i = 0; i < 1000; i++) {
					list.add(new Board("����1", "����1", "�۾���1"));
				}
			}
		}
		
		class ThreadB extends Thread{
			
			public void run() {
				for(int i = 0; i < 1000; i++) {
					list.add(new Board("����2", "����2", "�۾���2"));
				}
			}
		}
		
		ThreadA threadA = new ThreadA();
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		threadB.start();
		
		Thread mainThread = Thread.currentThread();
		
		try {
			mainThread.sleep(5000);
		}catch(Exception e) {}

		for(int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}

}
