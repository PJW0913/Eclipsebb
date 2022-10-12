package interface_name;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc;
		
		rc = new Television();
		
		rc.setMute(true);
		rc.setVolume(3);
		rc.turnOn();
		rc.turnOff();
		System.out.println("------------");
		
		rc = new Audio();
		
		rc.setMute(true);
		rc.setVolume(15);
		rc.turnOn();
		rc.turnOff();

	}

}