package project7.hashset;

public class ContactMain {

	public static void main(String[] args) {

		Contact contact = new Contact("���ؿ�", "010-6227-1051", "aa@naver.com", "����", "1994-09-13", "ģ��");
		
		System.out.println("�̸�: " + contact.getName());
		System.out.println("��ȭ��ȣ: " + contact.getPhoneNumber());
		System.out.println("�̸���: " + contact.getEmail());
		System.out.println("�ּ�: " + contact.getAddress());
		System.out.println("����: " + contact.getBirthday());
		System.out.println("�׷�: " + contact.getGroup());
		
		System.out.println("--------------------------------");
		System.out.println("�׷� ���� ����");
		
		contact.setGroup("����");
		
		System.out.println("--------------------------------");
		contact.printInfo();

	}

}