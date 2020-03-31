import java.util.InputMismatchException;
import java.util.Scanner;

import ver04.PhoneBookManager;

public class PhonebookVer04 {

	public static void main(String[] args) {
		
		PhoneBookManager pm = new PhoneBookManager();
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			
			try {
				pm.printMenu();
				int user = scanner.nextInt();
				scanner.nextLine();
				
				if(user == 1) {
					pm.dataInput();
				} else if(user == 2) {
					pm.dataSearch();
				} else if(user == 3) {
					pm.dataDelete();
				} else if(user == 4) {
					pm.dataAllShow();
				} else if(user == 5) {
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