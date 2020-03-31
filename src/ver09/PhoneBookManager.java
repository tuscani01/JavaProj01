package ver09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import ver08.MenuSelectException;
import ver08.PhoneInfo;

public class PhoneBookManager implements SubMenuItem
{
	HashSet<PhoneInfo> phoneInfo;
	Scanner scanner = new Scanner(System.in);

	public void load() {
		try {
			File file = new File("src/ver08/PhoneBook.obj");
			if(file.exists()) {
				System.out.println("\n====실행했을때 파일 존재하면 진입====\n"); //마지막주석처리
				ObjectInputStream in =
						new ObjectInputStream(
								new FileInputStream("src/ver08/PhoneBook.obj"));
				phoneInfo = (HashSet<PhoneInfo>)in.readObject();
				in.close();
			} else {
				System.out.println("\n====실행할때 파일 존재하지 않으면 진입====\n"); //마지막 주석처리
				//파일없을때 새로운 객체 생성해서 만들어볼것
				phoneInfo = new HashSet<PhoneInfo>();
			}
			
		}
		catch(Exception e) {
			System.out.println("\n====load메소드 예외발생====\n");
			e.printStackTrace();
		}
	}
	
	public void save() {
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/ver08/PhoneBook.obj));"
					out.writeObject(phoneInfo);
//					System.out.println("\n====시스템종료시 save====\n");
					out.close();
		}
		catch (Exception e) {
//			System.out.println("\n==== save메소드에서 예외발생====\n"); //마지막 주석처리
			e.printStackTrace();
		}
	}
	
	//메뉴출력
	public void printMenu() {
	
		System.out.println("선택할것..");
		System.out.println("1.데이터입력");
		System.out.println("2.데이터검색");
		System.out.println("3.데이터삭제");
		System.out.println("4.주소록출력");
		System.out.println("5.프로그램종료");
		System.out.print("선택 : ");
	}
	public int overlap() {
		int overlap = 0;
		
		while(true) {
			
			try {
				System.out.println("덮어씌우겠습니까? \n(입력취소: 1.덮어씌우기:2)");
				System.out.print("선택 : ");
				overlap = scanner.nextInt();
				scanner.nextLine();
				
				if(overlap == 1) {
					System.out.println("입력 취소\n");
					return overlap;
				}else if(overlap == 2) {
					return overlap;
				} else {
					System.out.println("잘못 입력했다 \n");
				}
				
			}
			catch(Exception e) {
//				System.out.println("\n====덮어씌우기 부분에서 예외발생====\n");
				System.out.println("잘못입력했다\n");
				scanner = new Scanner(System.in);
			}
			
		}
		
	}
	public void subDataInput() {
	
	//입력
	public void dataInput() {
		System.out.println("데이터 입력 시작");
		int user;
		while(true) {
			try {
				System.out.println("1.일반, 2.동창, 3.회사, 4.뒤로가기 \n선택>>");
				user = scanner.nextInt();
				scanner.nextLine();
				
				if(user == normal) {
					System.out.print("이름 : ");
					String name = scanner.nextLine();
					System.out.print("전화번호 : ");
					String phone = scanner.nextLine();
					if(!phoneInfo.add(new PhoneInfo(name, phone))) {
						System.out.println("\n동일한 이름 정보가 존재한다\n");
						int test = overlap();
						if(test == 2) {
							phoneInfo.remove(new PhoneInfo(name, phone));
							phoneInfo.add(new PhoneInfo(name, phone));
							System.out.println("\n기존 데이터 삭제하고 새로운 데이터 덮어씁니다\n");
						}
					} else {
						System.out.println("\n데이터 입력 완료되었다\n");
						}
						break;
						
					} else if(user == schoolmate) {
					
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.print("전화번호 : ");
		String phone = scanner.nextLine();
		System.out.print("전공 : ");
		String major = scanner.nextLine();
		System.out.print("학년 : ");
		int grade = scanner.nextInt();
		scanner.nextLine();
		
		if(!phoneInfo.add(new PhoneSchoolInfo(name, phone, major, grade))) {
			System.out.println("\n동일한 이름 정보가 존재한다\n");
			int test = overlap();
			if(test == 2) {
				phoneInfo.remove(new PhoneSchoolInfo(name, phone, major, grade));
				phoneInfo.add(new PhoneSchoolInfo(name, phone, major, grade));
				System.out.println("\n기존 데이터 삭제하고 새로운 데이터 덮어씁니다\n");
			}
		} else {
			System.out.println("\n데이터 입력 완료\n");
		}
		break;
		
					} else if(user == back) {
							break;
					} else {
						System.out.println("\n==데이터 입력 선택부분 숫자 잘못입력시 진입하는 else문==\n"); //
						System.out.println("잘못 입력 되었다\n");
					}
			}
			catch(InputMismatchException e) {
//				System.out.println("\n==데이터 입력 선택부분에서 InputMismatchException 예외발생==\n"); //마지막 주석처리
//				e.printStackTrace();
				scanner = new Scanner(System.in);
			}
			catch(Exception e) {
//				System.out.println("\n==데이터 입력 선택부분에서 알수없는 예외발생==\n"); //마지막 주석처리
//				e.printStackTrace();
				scanner = new Scanner(System.in);
			}
			}
		}
		//검색
	public void dataSearch() {
		
		try {
			System.out.println("\n=데이터 검색 시작=\n");
			System.out.print("이름 : ");
			String search = scanner.nextline();
			boolean a = false;
			
			for(PhoneInfo list : phoneInfo) {
				if(list.name.equals(search)) {
					list.showPhoneInfo();
					System.out.println("\n데이터 검색 완료\n");
					a = true;
				}
			}
			if(!a) System.out.println("\n입력하신 정보와 일치하는 정보가 없다\n");
		}
		catch(NullPointerException e) {
			System.out.println("\n널포인트\n");
		}
	}
		
		phoneInfo[dataNum] = new PhoneInfo(name, phone, birth);
		dataNum++;
		System.out.println("데이터 입력이 완료되었다");
	}
	
	//검색부분
	public void dataSearch() {
		
		System.out.println("데이터검색 시작");
		System.out.print("이름 : ");
		String search = scanner.nextLine();
		boolean a = false;
		
		for(int i=0; i<dataNum; i++) {
			if(search.equals(phoneInfo[i].name)) {
				phoneInfo[i].showPhoneInfo();
				System.out.println("데이터 검색 완료");
				
				a = true;
			}
		}
		if(!a) System.out.println("입력한 정보와 일치한 정보가 없다");
	}
	//삭제
	public void dataDelete() {
		
		try {
		System.out.println("데이터 삭제 시작");
		System.out.print("이름 : ");
		String delete = scanner.nextLine();
		boolean a = false;
		
		for(PhoneInfo list : phoneInfo) {
			if(list.name.equals(delete)) {
				phoneInfo.remove(list);
				a = true;
				System.out.println("\n데이터 삭제 완료\n");
				break;
			}
		}
		if(!a) System.out.println("\n입력한 정보와 일치한 정보가 없다\n");
		}
		catch(NullPointerException e) {
			System.out.println("\n널포인트\n");
			}
		}
		
	//주소록 전체 출력
	public void dataAllShow() {
		
		if(dataNum == 0) {
		System.out.println("\n입력된 정보 없다\n");
		} else {
			System.out.println("\n=전체정보 출력=\n");
			for(phoneInfo list : phoneInfo) {
				list.showPhoneInfo();
			}
			System.out.println("\n데이터 검색 완료\n");
			}
		}
	//사용자 정의에러
	public int userNum(int user) throws MenuSelectException{
		
		System.out.println("\n==사용자정의 예외클래스 진입==\n"); //마지막 주석처리
		if(user<1 || user>5) {
			MenuSelectException ex = new MenuSelectException();
			throw ex;
		}
		return user;
	}
		
/*	
	//멤버변수
	String name;
	String phoneNumber ;
	String birthday;
	
	//생성자
	public PhoneBookManager(String name, String phoneNumber, String birthday)
	{
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	//생년월일 필수사항 아니며 인자 없는 경우 null로 초기화
	public PhoneBookManager(String name, String phoneNumber)
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

*/
	