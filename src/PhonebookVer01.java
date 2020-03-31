import ver01.PhoneInfo;

public class PhonebookVer01
{

	public static void main(String[] args)
	{
	
		PhoneInfo p1 = new PhoneInfo("토니스탁", "010-1234-6575", "70-01-05");
		PhoneInfo p2 = new PhoneInfo("브루스배너", "010-1256-6775");

		p1.showPhoneInfo();
		p2.showPhoneInfo(); //생년월일 입력X
		

	}

}
