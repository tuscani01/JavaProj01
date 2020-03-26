import ver01.Phoneinfo;

public class PhonebookVer01
{

	public static void main(String[] args)
	{
	
		Phoneinfo p1 = new Phoneinfo("토니스탁", "010-1234-6575", "70-01-05");
		Phoneinfo p2 = new Phoneinfo("브루스배너", "010-1256-6775");
		
		
		p1.showPhoneInfo();
		p2.showPhoneInfo(); //생년월일 입력X
		
		

	}

}
