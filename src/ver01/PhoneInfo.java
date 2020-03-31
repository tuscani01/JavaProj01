package ver01;

public class PhonInfo {//멤버변수
	
	String name;
	String phoneNumber;
	String birthday;

//생성자
public PhoneInfo(String name, String phoneNumber, String birthday) {

	this.name = name;
	this.phoneNumber = phoneNumber;
	this.birthday = birthday;
}

//생년월일 필수사항 아님 인자없으면 null로 초기화
public PhoneInfo(String name, String phoneNumber) {
	
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.birthday = null;
}

//정보출력 메소드
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