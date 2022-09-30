package project5;

public class CustomerContact extends Contact{
	
	private String customerName;
	private String transactionItem;
	private String position;

	public CustomerContact(String name, String phoneNumber, String email, String address, String birthday,
			String group, String customerName, String transactionItem, String position) {
		super(name, phoneNumber, email, address, birthday, group);
		this.customerName = customerName;
		this.transactionItem = transactionItem;
		this.position = position;
	}
	
	

	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getTransactionItem() {
		return transactionItem;
	}



	public void setTransactionItem(String transactionItem) {
		this.transactionItem = transactionItem;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public void printInfo() {
		System.out.println("------------------------------------------------");
		System.out.println("�̸�: " + super.getName());
		System.out.println("��ȭ��ȣ: " + super.getPhoneNumber());
		System.out.println("�̸���: " + super.getEmail());
		System.out.println("�ּ�: " + super.getAddress());
		System.out.println("����: " + super.getBirthday());
		System.out.println("�׷�: " + super.getGroup());
		System.out.println("�ŷ�ó �̸�: " + this.customerName);
		System.out.println("�ŷ�ǰ��: " + this.transactionItem);
		System.out.println("����: " + this.position);
		System.out.println("------------------------------------------------");
	}
}
