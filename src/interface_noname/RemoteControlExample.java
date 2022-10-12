package interface_noname;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("Power Turn ON");
			}
			public void turnOff() {
				System.out.println("Power Turn Off");
			}
			public void setVolume(int volume) {
				
			}
		};
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		RemoteControl.changeBattery();
	}
}
