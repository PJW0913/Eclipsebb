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
		System.out.println("�̸�: " + super.getName());
		System.out.println("��ȭ��ȣ: " + super.getPhoneNumber());
		System.out.println("�̸���: " + super.getEmail());
		System.out.println("�ּ�: " + super.getAddress());
		System.out.println("����: " + super.getBirthday());
		System.out.println("�׷�: " + super.getGroup());
		System.out.println("ȸ���̸�: " + this.companyName);
		System.out.println("�μ��̸�: " + this.departmentName);
		System.out.println("����: " + this.position);
		System.out.println("------------------------------------------------");
	}
	
}
