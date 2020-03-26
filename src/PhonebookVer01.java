import ver01.Phoneinfo;

public class PhonebookVer01
{

	public static void main(String[] args)
	{
	
		Phoneinfo p1 = new Phoneinfo("토니스탁", "010-1234-6575", "70-01-05");
		Phoneinfo p2 = new Phoneinfo("브루스배너", "010-1256-6775");
		Phoneinfo p3 = new Phoneinfo("리처드해먼드", "010-5474-0909", "69-12-19");
		Phoneinfo p4 = new Phoneinfo("제임스메이", "010-8484-9564", "63-01-16");
		Phoneinfo p5 = new Phoneinfo("제레미클락슨", "010-9898-5674", "60-04-11");
		
		p1.showPhoneInfo();
		p2.showPhoneInfo(); //생년월일 입력X
		
		

	}

}
