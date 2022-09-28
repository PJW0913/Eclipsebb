package project2;

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
		
		System.out.print("�̸���:");
		String email = in.nextLine();

		System.out.print("�ּ�:");
		String address = in.nextLine();
		
		System.out.print("����:");
		String birthday = in.nextLine();
		
		System.out.print("�׷�:");
		String group = in.nextLine();
		
		return new Contact(name, phoneNumber, email, address, birthday, group);
	}
	
	//�迭�� ����ó ��ü ����
	public void addContact(Contact contact) {
		contacts[countOfContact] = contact;
		countOfContact++;
		System.out.println(">> �����Ͱ� ����Ǿ����ϴ�. (" + countOfContact + ")");
	}
	
	public void printContact(Contact contact) {
		System.out.println("------------------------------------------------");
		System.out.println("�̸�: " + contact.getName());
		System.out.println("��ȭ��ȣ: " + contact.getPhoneNumber());
		System.out.println("�̸���: " + contact.getEmail());
		System.out.println("�ּ�: " + contact.getAddress());
		System.out.println("����: " + contact.getBirthday());
		System.out.println("�׷�: " + contact.getGroup());
		System.out.println("------------------------------------------------");
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
}
