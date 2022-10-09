package exception_user_define;

public class AccountExample {

	public static void main(String[] args) {

		Account account = new Account();
		
		//�����ϱ�
		account.deposit(10000);
		System.out.println("�Աݾ�: " + account.getBalance());
		
		//����ϱ�
		try {
			account.withdraw(30000);
		}catch(BalanceInsufficientEception e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}

}
