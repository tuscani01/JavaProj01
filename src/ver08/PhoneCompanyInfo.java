package ver08;
//회사명
public class PhoneCompanyInfo extends PhoneInfo {
	String company;
	
	public PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}
	
	public void showPhoneInfo() {
		System.out.println("이름:"+ name);
		System.out.println("전화번호:"+ phoneNumber);
		System.out.println("회사:"+ company);
	}
	
	
	
	
	
	public String toString() {
		return "data 이름=" + name + ", 번호=" + phoneNumber
				+ " , 회사=" + company;
	}
}