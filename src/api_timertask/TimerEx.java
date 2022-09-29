package api_timertask;

import java.util.Timer;
import java.util.TimerTask;

public class TimerEx {

	public TimerEx() throws InterruptedException{
		
		System.out.println("^^");
		Timer timer = new Timer(true);
		TimerTask t1 = new ExTimerTask1();
		TimerTask t2 = new ExTimerTask2();
		
		timer.schedule(t1, 2000);
		timer.schedule(t2, 10000);
		
		Thread.sleep(10000);
		System.out.println("**");
	}
}
