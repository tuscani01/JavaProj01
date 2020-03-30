package ver01;

public class PhonInfo {//멤버변수
	
	String name;
	String phoneNumber;
	String birthday;
}
import java.util.Scanner;

//생성자
public PhoneInfo(String name, String  phoneNumber, String birthday) {

	this.name = name;
	this.phoneNumber = phoneNumber;
	this.birthday = birthday;
}

//생년월일 필수사항 아님 인자없으면 null로 초기화
public PhoneInfo(String name, String phoneNumber) {
	
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.birthday = birthday;
	
	//정보출력 메소드
}

public void showPhoneInfo() {
	
	System.out.println("이름 : " + name);
	System.out.println("전화번호 : " + phoneNumber);
	if(birthday == null) {
			System.out.println("생년월일 입력 안됨");
	} else {
		System.out.println("생년월일 : " + birthday);
	}
	}
}

/*
class PhoneBookManager{
	
	public void printMenu(){	//메뉴출력
		
	}
	
	public void dataInput() { //입력
		
	}
	public void dataSearch() { //검색
	}
	public void dataDelete() { //삭제
	}
	public void dataAllShow() { //주소록전체출력
		
	}
}
*/

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
	public void showPhoneInfo()  {
	System.out.println("이름:"+ name);	
	System.out.println("전화번호:"+ phoneNumber);
	
	class PhoneSchoolInfo extends PhoneInfo{
		String 전공;
			Int 학년;
	}
	class PhoneCompanyInfo extends PhoneInfo{
		String 회사명;
	
	}
	
	
	if(birthday==null) {
		System.out.println("생년월일 입력되지않음");
	}
	else {
	}
	System.out.println("생년월일:"+ birthday);
	
	}
}
	
	public class PhoneMain {
		
		static Scanner keyboard = new Scanner(System.in);
		public static PhoneInfo input() { //입력처리
		System.out.print("이름:");
		String name = keyboard.nextLine();
		System.out.print("전화번호:");
		String phoneNumber = keyboard.nextLine();
		System.out.print("생년월일:");
		String birthday = keyboard.nextLine();
		return new PhoneInfo(name,phoneNumber,birthday);
		
		
	}
		public static void main(String ar[]) {
			PhoneInfo phone;
			
			while(true) {//무한루프
			System.out.println("1:입력 \n2:종료");
			int input=keyboard.nextInt();
			keyboard.nextLine();
			if(input==1)
			phone=input();
			else
			break;
			phone.showinfo();
		}
		
		}
	}