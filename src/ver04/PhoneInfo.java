package ver04;

public class PhoneInfo
{
	//멤버변수
	String name;
	String phoneNumber ;
	String birthday;
	
	//생성자
	public PhoneInfo(String name, String phoneNumber, String birthday)
	{
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	//생년월일 필수사항 아니며 인자 없는 경우 null로 초기화
	public PhoneInfo(String name, String phoneNumber)
	{
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = null;
	}
	//정보출력 메소드
	public void showPhoneInfo()  
	{
		System.out.println("이름:"+ name);	
		System.out.println("전화번호:"+ phoneNumber);
		if(birthday==null) {
			System.out.println("생년월일 입력되지않음");
		}
		else {
			System.out.println("생년월일:"+ birthday);
		}
	}
}
