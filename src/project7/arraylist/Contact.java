package project7.arraylist;

public class Contact {

	//Field
		private String name;
		private String phoneNumber;
		private String email;
		private String address;
		private String birthday;
		private String group;
		
		//������
		public Contact(String name, String phoneNumber, String email, String address, String birthday, String group) {
			this.name = name;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.address = address;	
			this.birthday = birthday;
			this.group = group;
		}
		
		
		//�޼ҵ�(getter&setter)
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getBirthday() {
			return birthday;
		}
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}
		public String getGroup() {
			return group;
		}
		public void setGroup(String group) {
			this.group = group;
		}
		
		public void printInfo() {
			System.out.println("�̸�: " + name);
			System.out.println("��ȭ��ȣ: " + phoneNumber);
			System.out.println("�̸���: " + email);
			System.out.println("�ּ�: " + address);
			System.out.println("����: " + birthday);
			System.out.println("�׷�: " + group);
		}
}