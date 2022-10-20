package project7.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SmartPhone {

	Set<Contact> contacts = new HashSet<Contact>();
	Iterator<Contact> contactIterator = contacts.iterator();
	Scanner in;

	public SmartPhone() {
		in = new Scanner(System.in);
	}
	
	//������ �Է�
	public Contact inputContactData(int type) {
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
		
		Contact contact = null;
		
		if(type == 1) {
			
			System.out.print("ȸ���̸�:");
			String companyName = in.nextLine();
			
			System.out.print("�μ��̸�:");
			String departmentName = in.nextLine();
			
			System.out.print("����:");
			String position = in.nextLine();
			
			contact = new CompanyContact(name, phoneNumber, email, address, birthday, group, companyName, departmentName, position);

		
		}else if(type == 2) {
			
			System.out.print("�ŷ�ó�̸�:");
			String customerName = in.nextLine();
			
			System.out.print("�ŷ�ǰ��:");
			String transactionItem = in.nextLine();
			
			System.out.print("����:");
			String position = in.nextLine();
			contact = new CustomerContact(name, phoneNumber, email, address, birthday, group, customerName, transactionItem, position);

		
		}
			
		return contact;
		
	}
		
	//�迭�� ����ó ��ü ����
	public void addContact(Contact contact) {
		contacts.add(contact);
		System.out.println(">> �����Ͱ� ����Ǿ����ϴ�. (" + contacts.size() + ")");
	}
	
	//��ü���� ���
	public void printContact(Contact contact) {
		System.out.println("------------------------------------------------------------");
		contact.printInfo();
		System.out.println("------------------------------------------------------------");
	}
	
	//��� ����ó ���
	public void printAllContact() {
		contactIterator = contacts.iterator();
		while(contactIterator.hasNext()) {
			Contact contact = contactIterator.next();
			printContact(contact);
		}
	}

	//����ó �˻�
	public Contact searchContact(String name) {
		
		while(contactIterator.hasNext()) {
			Contact contact = contactIterator.next();
			if(contact.getName().contentEquals(name)) {
				printContact(contact);
				return contact;
			}
		}
		
		System.out.println("�˻� ����� �����ϴ�.");
		return null;
	}

	//����ó ����
	public void deleteContact(String name) {
		
		Contact contact = contactIterator.next();
		if(contact.getName().contentEquals(name)) {
			contacts.remove(contacts.contains(name));
			return;
		}
		
		System.out.println("�˻� ����� �����ϴ�.");
	}

	//����ó ����
	public void editContact(String name, Contact newContact) {
 
		Contact contact = contactIterator.next();
		if(contact.getName().contentEquals(name)) {
			contacts.remove(contact);
			contacts.add(newContact);
			return;
		}
		
		System.out.println("�˻� ����� �����ϴ�.");
	}
}
