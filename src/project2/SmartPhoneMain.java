package project2;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		SmartPhone smartPhone = new SmartPhone();
		
		System.out.println("#데이터 2개를 입력합니다.");
		for(int i = 0; i < 2; i++) {
			smartPhone.addContact(smartPhone.inputContactData());
		}
		
		
		while(true) {
			printMenu();
			String choiceMenu = scanner.nextLine();
			
			if(choiceMenu.contentEquals("1")) {
				smartPhone.addContact(smartPhone.inputContactData());
			}else if(choiceMenu.contentEquals("2")) {
				smartPhone.printAllContact();
			}else if(choiceMenu.contentEquals("3")) {
				System.out.println("검색하고자하는 이름을 입력해주세요");
				smartPhone.searchContact(scanner.nextLine());
			}else if(choiceMenu.contentEquals("4")) {
				System.out.println("삭제하고자하는 이름을 입력해주세요");
				smartPhone.deleteContact(scanner.nextLine());
			}else if(choiceMenu.contentEquals("5")) {
				System.out.println("수정하고자하는 이름을 입력해주세요");
				String name = scanner.nextLine();
				smartPhone.searchContact(name);
				System.out.println("데이터를 새로 입력해주세요");
				smartPhone.editContact(name, smartPhone.inputContactData());
			}else if(choiceMenu.contentEquals("6")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}else {
				System.out.println("잘못된 메뉴 입니다. 다시 선택해주세요");
			}
		}	
	}
	
	public static void printMenu() {
		System.out.println("Contact-----------------------");
		System.out.println(">> 1.연락처 등록");
		System.out.println(">> 2.모든 연락처 출력");
		System.out.println(">> 3.연락처 검색");
		System.out.println(">> 4.연락처 삭체");
		System.out.println(">> 5.연락처 수정");
		System.out.println(">> 6.프로그램 종료");
		System.out.println("------------------------------");
	}
}
