package ver04;

public class PhoneBookManager
{

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
	//입력
	public void dataInput() {
		System.out.println("데이터 입력 시작");
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.print("전화번호 : ");
		String phone = scanner.nextLine();
		System.out.print("생년월일 : ");
		String birth = scanner.nextLine();
		
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
		System.out.println("데이터 삭제 시작");
		System.out.print("이름 : ");
		String delete = scanner.nextLine();
		boolean a = false;
		
		for(int i=0; i<dataNum; i++) {
			if(delete.equals(phoneInfo[i].name)) {
				phoneInfo[i] = null;
				System.out.println("데이터 삭제 완료");
				
				for(int j=i; j<dataNum; j++)
					phoneInfo[i] = phoneInfo[i+1];
				dataNum--;
				a = true;
					
			}
		}
		if(!a) System.out.println("입력한 정보와 일치한 정보 없다");
	}
	//주소록 전체 출력
	public void dataAllShow() {
		if(dataNum == 0) {
		System.out.println("입력된 정보 없다");
		} else {
			System.out.println("전체정보 출력");
			for(int i=0; i<dataNum; i++) {
				phoneInfo[i].showPhoneInfo();
			}
		}
	}
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
	
	
	
	
	
	
	