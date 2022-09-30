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
		System.out.println("이름: " + super.getName());
		System.out.println("전화번호: " + super.getPhoneNumber());
		System.out.println("이메일: " + super.getEmail());
		System.out.println("주소: " + super.getAddress());
		System.out.println("생일: " + super.getBirthday());
		System.out.println("그룹: " + super.getGroup());
		System.out.println("거래처 이름: " + this.customerName);
		System.out.println("거래품목: " + this.transactionItem);
		System.out.println("직급: " + this.position);
		System.out.println("------------------------------------------------");
	}
}
