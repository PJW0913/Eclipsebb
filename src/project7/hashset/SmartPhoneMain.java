package project7.hashset;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		SmartPhone smartPhone = new SmartPhone();
		
		System.out.println("#������ 2���� �Է��մϴ�.");
		for(int i = 0; i < 2; i++) {
			smartPhone.addContact(smartPhone.inputContactData(i+1));
		}
		
		
		while(true) {
			printMenu();
			String choiceMenu = scanner.nextLine();
			
			if(choiceMenu.contentEquals("1")) {
				smartPhone.addContact(smartPhone.inputContactData(1));
			}else if(choiceMenu.contentEquals("2")) {
				smartPhone.addContact(smartPhone.inputContactData(2));
			}else if(choiceMenu.contentEquals("3")) {
				smartPhone.printAllContact();
			}else if(choiceMenu.contentEquals("4")) {
				System.out.println("�˻��ϰ����ϴ� �̸��� �Է����ּ���");
				smartPhone.searchContact(scanner.nextLine());
			}else if(choiceMenu.contentEquals("5")) {
				System.out.println("�����ϰ����ϴ� �̸��� �Է����ּ���");
				smartPhone.deleteContact(scanner.nextLine());
			}else if(choiceMenu.contentEquals("6")) {
				System.out.println("�����ϰ����ϴ� �̸��� �Է����ּ���");
				String name = scanner.nextLine();
				smartPhone.searchContact(name);
				System.out.println("�׷� Ÿ�� �Է�");
				int group = scanner.nextInt();
				smartPhone.editContact(name, smartPhone.inputContactData(group));
			}else if(choiceMenu.contentEquals("7")) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}else {
				System.out.println("�߸��� �޴� �Դϴ�. �ٽ� �������ּ���");
			}
		}	
	}
	
	public static void printMenu() {
		System.out.println("Contact-----------------------");
		System.out.println(">> 1.����ó ���(ȸ��)");
		System.out.println(">> 2.����ó ���(�ŷ�ó)");
		System.out.println(">> 3.��� ����ó ���");
		System.out.println(">> 4.����ó �˻�");
		System.out.println(">> 5.����ó ��ü");
		System.out.println(">> 6.����ó ����");
		System.out.println(">> 7.���α׷� ����");
		System.out.println("------------------------------");
	}
}
