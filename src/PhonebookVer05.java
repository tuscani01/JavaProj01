import ver01.Phoneinfo;

public class PhonebookVer05
{

	public static void main(String[] args)
	{
	
		Phoneinfo p1 = new Phoneinfo("리처드해먼드", "010-5474-0909", "69-12-19");
		Phoneinfo p2 = new Phoneinfo("제임스메이", "010-8484-9564", "63-01-16");

		
		p1.showPhoneInfo();
		p2.showPhoneInfo(); //생년월일 입력X
		
		

	}

}
