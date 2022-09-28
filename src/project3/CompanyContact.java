package project3;

public class CompanyContact extends Contact{

	private String companyName;
	private String departmentName;
	private String position;
	
	public CompanyContact(String name, String phoneNumber, String email, String address, String birthday,
			String group, String companyName, String departmentName, String position) {
		super(name, phoneNumber, email, address, birthday, group);
		this.companyName = companyName;
		this.departmentName = departmentName;
		this.position = position;
	}
	
	
	
	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getDepartmentName() {
		return departmentName;
	}



	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public void printInfo() {
		System.out.println("------------------------------------------------");
		System.out.println("이름: " + super.getName());
		System.out.println("전화번호: " + super.getPhoneNumber());
		System.out.println("이메일: " + super.getEmail());
		System.out.println("주소: " + super.getAddress());
		System.out.println("생일: " + super.getBirthday());
		System.out.println("그룹: " + super.getGroup());
		System.out.println("회사이름: " + this.companyName);
		System.out.println("부서이름: " + this.departmentName);
		System.out.println("직급: " + this.position);
		System.out.println("------------------------------------------------");
	}
	
}
