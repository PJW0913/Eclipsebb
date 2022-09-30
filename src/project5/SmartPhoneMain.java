package project5;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		SmartPhone smartPhone = new SmartPhone();
		
		System.out.println("#������ 2���� �Է��մϴ�.");
		for(int i = 0; i < 2; i++) {
			smartPhone.addContact(smartPhone.inputContactData());
		}
		
		
		while(true) {
			printMenu();
			String choiceMenu = scanner.nextLine();
			
			if(choiceMenu.contentEquals("1")) {
				smartPhone.addContact(smartPhone.inputContactData());
			}else if(choiceMenu.contentEquals("2")) {
				System.out.println("�˻��ϰ����ϴ� �̸��� �Է����ּ���");
				smartPhone.searchContact(scanner.nextLine());
			}else if(choiceMenu.contentEquals("3")) {
				System.out.println("�����ϰ����ϴ� �̸��� �Է����ּ���");
				smartPhone.editContact(scanner.nextLine(), smartPhone.inputContactData());
			}else if(choiceMenu.contentEquals("4")) {
				System.out.println("�����ϰ����ϴ� �̸��� �Է����ּ���");
				smartPhone.deleteContact(scanner.nextLine());
			}else if(choiceMenu.contentEquals("5")) {
				smartPhone.printAllContact();
			}else if(choiceMenu.contentEquals("6")) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}else {
				System.out.println("�߸��� �޴� �Դϴ�. �ٽ� �������ּ���");
			}
		}	
	}
	
	public static void printMenu() {
		System.out.println("==============================");
		System.out.println(" 1.����ó �Է�");
		System.out.println(" 2.����ó �˻�");
		System.out.println(" 3.����ó ����");
		System.out.println(" 4.����ó ����");
		System.out.println(" 5.����ó ��ü ����Ʈ ����");
		System.out.println(" 6.����");;
		System.out.println("==============================");
	}
}
