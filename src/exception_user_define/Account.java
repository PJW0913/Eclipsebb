package exception_user_define;

public class Account {

	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientEception{
		
		if(balance < money) {
			throw new BalanceInsufficientEception("�ܰ����: " + (money-balance) + "���ڶ�");
		}
		balance -= money;
	}
}
