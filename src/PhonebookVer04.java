import java.util.Scanner;

import ver01.PhoneInfo;

class PhoneBookManager{
	//데이터 저장,검색,삭제
}

PhoneInfo [] phoneBook;
private int count; //전화번호부 저장된 사람수

public PhoneBookManager() {
	phoneBook=new PhoneInfo[100];
	count=0;
	
}

//데이터검색
public void searchBook() {
	int index;
	System.out.print("찾을이름입력:");
	String name=MenuViewer.keyboard.nextLine();
	index=search(name);
	if(index<0)
	System.out.println("해당하는값 없다");
	else {
		phoneBook[index].showInfo();
		System.out.println("데이터검색완료\n");
		
	}
}
public int search(String name) {//이름찾기

for(int index=0;index<count;index++) {
	if(name.compareTo(phoneBook[index].getName())==0) {
		return index;
		
	}
}
return -1;
}
//데이터삭제
public void removeBook() {
	
	int index;
	System.out.print("삭제할이름입력:");
	String name=MenuViewer.keyboard.nextLine();
	index=search(name);
	if(index<0)
		System.out.println("해당값 없음");
	else {
		for(int i=index;i<count-1;i++) {
			phoneBook[i]=phoneBook[i+1];
		}
		count--;
		System.out.println("데이터삭제완료\n");
		}
	
		//데이터저장
	public PhoneInfo readPhoneBook() {//일반
		System.out.print("이름:");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("핸드폰번호:");
		String phoneNumber=MenuViewer.keyboard.nextLine();
		System.out.print("전공:");
		String major=MenuViewer.keyboard.nextLine();
		System.out.print("학년:");
		int year=MenuViewer.keyboard.nextint();
		return new PhoneUnivinfo(name,phoneNumber,major,year);
	}
	public PhoneInfo readCompBook() {//회사
		System.out.print("이름:");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("핸드폰번호:");
		String phoneNumber=MenuViewer.keyboard.nextLine();
		System.out.print("회사이름:");
		String company=MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name,phoneNumber,company);
	}
	public void readBook() {//입력처리
		
		System.out.println("데이터입력시작");
		System.out.println("1.일반, 2.대학, 3.회사");
		int input = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		PhoneInfo info=null; //임시변수
		
		switch(input) {
		case 1:
			info=readPhoneBook();
			break;
		case 2:
			info=readUnivBook();
			break;
		case 3:
			info=readCompBook();
			break;
		default:System.out.println("잘못입력했다");
		break;
		
		}
		phoneBook[count++]=info;
		System.out.println("데이터입력완료");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호:");
		String phoneNumber = MenuViewer.keyboard.nextLine();
		System.out.print("생년월일:");
		String birthday = MenuViewer.keyboard.nextLine();
		phoneBook[count++] = new PhoneInfo(name,phoneNumber);
		*/
	}
	
}
	class MenuViewer{
		static Scanner keyboard = new Scanner(System.in);
		public static void showMenu() {//메뉴 보여주는 화면
			System.out.println("--전화번호 관리프로그램ver3--");
			System.out.println("선택하세요");
			System.out.println("1.데이터입력");
			System.out.println("2.데이터검색");
			System.out.println("3.데이터삭제");
			System.out.println("4.데이터종료");
	
		
	}
}
	public class PhoneMain {
		public static void main(String ar[]) {
			
			PhoneBookManager phoneManager = new PhoneBookManager();
			
			while(true) {//무한루프
			
			MenuViewer.showMenu();
			int input=MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();
			
			switch(input) {
			case 1:///입력
				phoneManager.searchBook();
				break;
			case 2://찾기
				phoneManager.searchBook();
				break;
			case 3://삭제
				phoneManager.removeBook();
			break;
			case 4: System.out.println("프로그램종료");
			return;
		}
	}
		}
	}
/*
 * 회사동료들 전화번호 저장
 */
public class PhoneCompanyInfo extends PhoneInfo {
	
	private String company;
	
	public PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super();
		this.company = company;
	}
	public void showinfo() {
		super.showinfo();
		System.out.println("회사:" + company);
	}
}
public class PhoneInfo{
	
	protected String name; //이름
	protected String phoneNumber;
	
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public void showinfo() {
		System.out.println("이름: "+name+\n핸드폰번호: "+phoneNumber);
	}
	public String getName() {
		return name;
	}
	public String getphoneNumber() {
		return phoneNumber;
	}
		
	}
	
}
public class PhoneUnivinfo extends PhoneInfo {
	
	private String univ;
	private int year;
	
	public PhoneUnivinfo(String name, String phoneNumber, String univ, String major, int year) {
		super(name, phoneNumber);
		this.univ = univ;
		this.major = major;
		this.year = year;
	}
	public void showinfo() {
		super.showInfo();
		System.out.println("대학 :"+univ);
		System.out.println("학년 :"+year);
		System.out.println("전공 :"+major);
		System.out.println();
	}
}


public class PhonebookVer04
{

	public static void main(String[] args)
	{
	
		
		
		
		
		
		
		
	}
}
