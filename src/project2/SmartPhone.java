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
	
	//데이터 입력
	public Contact inputContactData() {
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
		
		return new Contact(name, phoneNumber, email, address, birthday, group);
	}
	
	//배열에 연락처 객체 저장
	public void addContact(Contact contact) {
		contacts[countOfContact] = contact;
		countOfContact++;
		System.out.println(">> 데이터가 저장되었습니다. (" + countOfContact + ")");
	}
	
	public void printContact(Contact contact) {
		System.out.println("------------------------------------------------");
		System.out.println("이름: " + contact.getName());
		System.out.println("전화번호: " + contact.getPhoneNumber());
		System.out.println("이메일: " + contact.getEmail());
		System.out.println("주소: " + contact.getAddress());
		System.out.println("생일: " + contact.getBirthday());
		System.out.println("그룹: " + contact.getGroup());
		System.out.println("------------------------------------------------");
	}
	
	//모든 연락처 출력
	public void printAllContact() {
		for(int i = 0; i < countOfContact; i++) {
			printContact(contacts[i]);
		}
	}

	//연락처 검색
	public void searchContact(String name) {
		for(int i = 0; i < countOfContact; i++) {
			Contact contact = contacts[i];
			if(contact.getName().contentEquals(name)) {
				printContact(contact);
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}

	//연락처 삭제
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
		System.out.println("검색 결과가 없습니다.");
	}

	//연락처 수정
	public void editContact(String name, Contact newContact) {
		for(int i = 0; i < countOfContact; i++) {
			if(contacts[i].getName().contentEquals(name)) {
				contacts[i] = newContact;
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}
}
