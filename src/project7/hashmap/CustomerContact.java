package project7.hashmap;

public class CustomerContact extends Contact{
	
	private String customerName;
	private String transactionItem;
	private String position;
	
	public CustomerContact(String name, String phoneNumber, String email, String address, String birthday, String group) {
		super(name, phoneNumber, email, address, birthday, group);
	}

	public CustomerContact(String name, String phoneNumber, String email, String address, String birthday,
			String group, String customerName, String transactionItem, String position) {
		super(name, phoneNumber, email, address, birthday, group);
		this.customerName = customerName;
		this.transactionItem = transactionItem;
		this.position = position;
	}
	
	

	public void printInfo() {
		super.printInfo();
		System.out.println("�ŷ�ó �̸�: " + this.customerName);
		System.out.println("�ŷ�ǰ��: " + this.transactionItem);
		System.out.println("����: " + this.position);
	}
}
