package project5;

import java.util.Scanner;

public class SmartPhone {

	Contact contacts[];
	int countOfContact = 0;
	Scanner in;

	public SmartPhone() {
		contacts = new Contact[10];
		in = new Scanner(System.in);
	}
	
	
	//������ �Է�
	public Contact inputContactData() {
		System.out.print("�̸�: ");
		String name = in.nextLine();
		
		System.out.print("��ȭ��ȣ:");
		String phoneNumber = in.nextLine();
		checkDuplication(phoneNumber);
		afterDuplication();
		
		System.out.print("�̸���:");
		String email = in.nextLine();

		System.out.print("�ּ�:");
		String address = in.nextLine();
		
		System.out.print("����:");
		String birthday = in.nextLine();
		
		System.out.print("�׷�:");
		String group = in.nextLine();
		
		if(group.contentEquals("ȸ��")) {
			
			System.out.print("ȸ���̸�:");
			String companyName = in.nextLine();
			
			System.out.print("�μ��̸�:");
			String departmentName = in.nextLine();
			
			System.out.print("����:");
			String position = in.nextLine();
			
			return new CompanyContact(name, phoneNumber, email, address, birthday, group, companyName, departmentName, position);
		
		}else if(group.contentEquals("�ŷ�ó")) {
			
			System.out.print("�ŷ�ó�̸�:");
			String customerName = in.nextLine();
			
			System.out.print("�ŷ�ǰ��:");
			String transactionItem = in.nextLine();
			
			System.out.print("����:");
			String position = in.nextLine();
			
			return new CustomerContact(name, phoneNumber, email, address, birthday, group, customerName, transactionItem, position);
		
		}else {
			
			return new Contact(name, phoneNumber, email, address, birthday, group);
		}
	} 
	
		
	//�迭�� ����ó ��ü ����
	public void addContact(Contact contact) {

		contacts[countOfContact] = contact;
		countOfContact++;
		System.out.println(">> �����Ͱ� ����Ǿ����ϴ�. (" + countOfContact + ")");
		
		
	}
	
	//��ü���� ���
	public void printContact(Contact contact) {
		System.out.println("------------------------");
		contact.printInfo();
		System.out.println("------------------------");
	}
	
	//��� ����ó ���
	public void printAllContact() {
		for(int i = 0; i < countOfContact; i++) {
			printContact(contacts[i]);
		}
	}

	//����ó �˻�
	public void searchContact(String name) {
		for(int i = 0; i < countOfContact; i++) {
			Contact contact = contacts[i];
			if(contact.getName().contentEquals(name)) {
				printContact(contact);
				return;
			}
		}
		System.out.println("�˻� ����� �����ϴ�.");
	}

	//����ó ����
	public void deleteContact(String name) {
		for(int i = 0; i < countOfContact; i++) {
			Contact contact = contacts[i];
			if(contact.getName().contentEquals(name)) {
				for(int j = i; j < countOfContact; j++) {
					contacts[j] = contacts[j+1];
				}
				countOfContact--;
				return;
			}
		}
		System.out.println("�˻� ����� �����ϴ�.");
	}

	//����ó ����
	public void editContact(String name, Contact newContact) {
		for(int i = 0; i < countOfContact; i++) {
			if(contacts[i].getName().contentEquals(name)) {
				contacts[i] = newContact;
				return;
			}
		}
		System.out.println("�˻� ����� �����ϴ�.");
	}
	
	
	
	//��ȭ��ȣ �ߺ� üũ
	public boolean checkDuplication(String number) {
		
		for(int i = 0; i < countOfContact; i++) {
			if(contacts[i].getPhoneNumber().contentEquals(number)) {
				
				
				return true;
			}
		}
		return false;
	}
	
	
	
	public void afterDuplication() {
		if(checkDuplication(null) == true) {
			System.out.println("��ȭ��ȣ�� �ߺ��Ǿ����ϴ�.");
		}else {
			
		}
	}
	
	
	
	
	
	
	
	
	
	
}