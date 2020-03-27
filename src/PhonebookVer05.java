import ver01.PhoneInfo;

public class PhonebookVer05
{

	public static void main(String[] args)
	{
	
		PhoneInfo p1 = new PhoneInfo("리처드해먼드", "010-5474-0909", "69-12-19");
		PhoneInfo p2 = new PhoneInfo("제임스메이", "010-8484-9564", "63-01-16");

		
		p1.showPhoneInfo();
		p2.showPhoneInfo(); //생년월일 입력X
		
		

	}

}
