package project7.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartPhone {

	List<Contact> contacts = new ArrayList<Contact>();
	Scanner in;

	public SmartPhone() {
		in = new Scanner(System.in);
	}
	
	//데이터 입력
	public Contact inputContactData(int type) {
		System.out.print("이름: ");
		String name = in.nextLine();
		
		System.out.print("전화번호:");
		String phoneNumber = in.nextLine();
		
		System.out.print("이메일:");
		String email = in.nextLine();

		System.out.print("주소:");
		String address = in.nextLine();
		
		System.out.print("생일:");
		String birthday = in.nextLine();
		
		System.out.print("그룹:");
		String group = in.nextLine();
		
		Contact contact = null;
		
		if(type == 1) {
			
			System.out.print("회사이름:");
			String companyName = in.nextLine();
			
			System.out.print("부서이름:");
			String departmentName = in.nextLine();
			
			System.out.print("직급:");
			String position = in.nextLine();
			
			contact = new CompanyContact(name, phoneNumber, email, address, birthday, group, companyName, departmentName, position);

		
		}else if(type == 2) {
			
			System.out.print("거래처이름:");
			String customerName = in.nextLine();
			
			System.out.print("거래품목:");
			String transactionItem = in.nextLine();
			
			System.out.print("직급:");
			String position = in.nextLine();
			contact = new CustomerContact(name, phoneNumber, email, address, birthday, group, customerName, transactionItem, position);

		
		}
			
		return contact;
		
	}
		
	//배열에 연락처 객체 저장
	public void addContact(Contact contact) {
		contacts.add(contact);
		System.out.println(">> 데이터가 저장되었습니다. (" + contacts.size() + ")");
	}
	
	//객체정보 출력
	public void printContact(Contact contact) {
		System.out.println("------------------------------------------------------------");
		contact.printInfo();
		System.out.println("------------------------------------------------------------");
	}
	
	//모든 연락처 출력
	public void printAllContact() {
		for(int i = 0; i < contacts.size(); i++) {
			printContact(contacts.get(i));
		}
	}

	//연락처 검색
	public Contact searchContact(String name) {
		for(int i = 0; i < contacts.size(); i++) {
			Contact contact = contacts.get(i);
			if(contact.getName().contentEquals(name)) {
				printContact(contact);
				return contact;
			}
		}
		System.out.println("검색 결과가 없습니다.");
		return null;
	}

	//연락처 삭제
	public void deleteContact(String name) {
		for(int i = 0; i < contacts.size(); i++) {
			Contact contact = contacts.get(i);
			if(contact.getName().contentEquals(name)) {
				contacts.remove(i);
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}

	//연락처 수정
	public void editContact(String name, Contact newContact) {
		for(int i = 0; i < contacts.size(); i++) {
			Contact contact = contacts.get(i);
			if(contact.getName().contentEquals(name)) {
				contacts.remove(i);
				contacts.add(newContact);
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}
}
