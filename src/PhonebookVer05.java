import java.util.InputMismatchException;
import java.util.Scanner;

import ver05.Menuitem;
import ver05.PhoneBookManager;

public class PhonebookVer05 implements Menuitem{

	public static void main(String[] args) {
		
		PhoneBookManager pm = new PhoneBookManager();
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			
			try {
				pm.printMenu();
				int user = scanner.nextInt();
//				scanner.nextLine();
				
				if(user == dataInput) {
					pm.dataInput();
				} else if(user == dataSearch) {
					pm.dataSearch();
				} else if(user == dataDelete) {
					pm.dataDelete();
				} else if(user == dataAllShow) {
					pm.dataAllShow();
				} else if(user == end) {
					System.out.println("프로그램 종료");
					scanner.close();
					break;
				} else {
					System.out.println("잘못 입력했습니다");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("잘못 입력했습니다");
			}
		}
	}
}