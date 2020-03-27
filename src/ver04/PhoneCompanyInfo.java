package ver04;
//회사명
public class PhoneCompanyInfo extends PhoneInfo {
	String emp;
	
	public PhoneCompanyInfo(String name, String phoneNumber, String emp) {
		super(name, phoneNumber);
		this.emp = emp;
	}
	
	@Override
	public void dataAllShow() {
		super.dataAllShow();
		System.out.println("회사:"+emp);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}