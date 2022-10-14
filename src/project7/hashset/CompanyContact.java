package project7.hashset;

public class CompanyContact extends Contact{

	private String companyName;
	private String departmentName;
	private String position;
	
	public CompanyContact(String name, String phoneNumber, String email, String address, String birthday, String group) {
		super(name, phoneNumber, email, address, birthday, group);
	}
	
	public CompanyContact(String name, String phoneNumber, String email, String address, String birthday,
			String group, String companyName, String departmentName, String position) {
		super(name, phoneNumber, email, address, birthday, group);
		this.companyName = companyName;
		this.departmentName = departmentName;
		this.position = position;
	}
	
//	public void setCompanyContact(String name, String phoneNumber, String email, String address, String birthday,
//			String group, String companyName, String departmentName, String position) {
//		 = name;
//		this.companyName = companyName;
//		this.departmentName = departmentName;
//		this.position = position;
//	}
	

	public void printInfo() {
		super.printInfo();
		System.out.println("회사이름: " + this.companyName);
		System.out.println("부서이름: " + this.departmentName);
		System.out.println("직급: " + this.position);
	}
	
}
