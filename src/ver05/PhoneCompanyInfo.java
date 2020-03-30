package ver05;
//회사명
public class PhoneCompanyInfo extends PhoneInfo {
	String company;
	
	public PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.emp = company;
	}
	
	@Override
	public void dataAllShow() {
		super.dataAllShow();
		System.out.println("회사:"+company);
		
	}
	
}