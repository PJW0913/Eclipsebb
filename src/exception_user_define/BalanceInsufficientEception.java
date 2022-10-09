package exception_user_define;

public class BalanceInsufficientEception extends Exception {

	public BalanceInsufficientEception() {}
	
	public BalanceInsufficientEception(String message) {
		super(message);
	}
}
