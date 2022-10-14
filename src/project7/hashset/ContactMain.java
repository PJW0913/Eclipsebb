package project7.hashset;

public class ContactMain {

	public static void main(String[] args) {

		Contact contact = new Contact("박준우", "010-6227-1051", "aa@naver.com", "서울", "1994-09-13", "친구");
		
		System.out.println("이름: " + contact.getName());
		System.out.println("전화번호: " + contact.getPhoneNumber());
		System.out.println("이메일: " + contact.getEmail());
		System.out.println("주소: " + contact.getAddress());
		System.out.println("생일: " + contact.getBirthday());
		System.out.println("그룹: " + contact.getGroup());
		
		System.out.println("--------------------------------");
		System.out.println("그룹 정보 변경");
		
		contact.setGroup("가족");
		
		System.out.println("--------------------------------");
		contact.printInfo();

	}

}