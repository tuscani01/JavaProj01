import java.util.InputMismatchException;
import java.util.Scanner;

import ver02.Phoneinfo;

public class PhonebookVer02 {
public static void main(String[] args) {
		
		
	while(true) {
			
		try {
				System.out.println("1.데이터 입력");
				System.out.println("2.프로그램 종료");
				
				Scanner scan = new Scanner(System.in);
				int num = scan.nextInt();
				System.out.println(scan.nextLine());
				
				
		if (num==1) {
					System.out.print("이름: ");
					String name =  scan.nextLine();
					System.out.print("전화번호: ");
					String phoneNum =  scan.nextLine();
					System.out.print("생년월일: ");
					String birth =  scan.nextLine();
					
					PhoneInfo p = new PhoneInfo(name, phoneNum, birth);
					p.showPhoneInfo();
					
				}else if(num==2) {
					System.out.println("선택 :" + num);
					System.out.println("프로그램을 종료");
					System.exit(0);
				}else {
					System.out.println("숫자 범위를 벗어났다");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하시오");
				
			}
			
			
			
		}//while문 종료
			
		
	}
}
