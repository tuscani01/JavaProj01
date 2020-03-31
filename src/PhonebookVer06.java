import java.util.InputMismatchException;
import java.util.Scanner;

import ver06.Menuitem;
import ver06.MenuSelectException;
import ver06.PhoneBookManager;

public class PhonebookVer06 implements Menuitem{

	public static void main(String[] args) {
		
		PhoneBookManager pm = new PhoneBookManager();
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			
			try {
				pm.printMenu();
				int user = pm.userNum(scanner.nextInt());
				scanner.nextLine();
				
				if(user == dataInput) {
					pm.dataInput();
				} else if(user == dataSearch) { //데이터검색
					pm.dataSearch();
				} else if(user == dataDelete) { //데이터삭제
					pm.dataDelete();
				} else if(user == dataAllShow) {
					pm.dataAllShow();
				} else if(user == end) {
					System.out.println("프로그램 종료");
					scanner.close();
					break;
				}
			}
			catch(MenuSelectException e) {
				System.out.println(e.getMessage());
			}
			catch(InputMismatchException e) {
				System.out.println("잘못 입력했습니다");
			}
		}
	}
}