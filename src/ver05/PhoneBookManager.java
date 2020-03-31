package ver05;

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
		while(true) {
			try {
				System.out.println("1.일반, 2.동창, 3.회사, 4.뒤로가기 \n선택>>");
				int user = scanner.nextInt();
				scanner.nextLine();
				
				if(user == normal) {
					
					System.out.print("이름 : ");
					String name = scanner.nextLine();
					System.out.print("전화번호 : ");
					String phone = scanner.nextLine();
					
					phoneInfo[dataNum] = new PhoneInfo(name, phone, birth);
					dataNum++;
					System.out.println("데이터 입력이 완료되었다");
					break;
					
				} else if(user == schoolmate) {
				
					System.out.print("이름 : ");
					String name = scanner.nextLine();
					System.out.print("전화번호 : ");
					String phone = scanner.nextLine();
					System.out.print("전공 : ");
					String major = scanner.nextLine();
					System.out.print("학년 : ");
					String major = scanner.nextInt();
					
					phoneInfo[dataNum] = new PhoneInfo(name, phone, major, grade);
					dataNum++;
					System.out.println("데이터 입력이 완료되었다");
					break;
					
			} else if(user == co_Work) {
		
				System.out.print("이름 : ");
				String name = scanner.nextLine();
				System.out.print("전화번호 : ");
				String phone = scanner.nextLine();
				System.out.print("회사 : ");
				String company = scanner.nextLine();
				
				
				phoneInfo[dataNum] = new PhoneInfo(name, phone, company);
				dataNum++;
				System.out.println("데이터 입력이 완료되었다");
				break;
				
			} else if(user == back) {
				break;
			} else {
				System.out.println("잘못 입력했습니다");
			}
		}
			catch(Exception e) {
				System.out.println("잘못 입력했습니다");
				scanner = new Scanner(System.in);
			}
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
