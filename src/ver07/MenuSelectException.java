package ver07;

public class MenuSelectException extends Exception{
	
	public MenuSelectException() {
		super("잘못 입력했다 (1~5까지 숫자를 벗어남)");
	}
	
	
}
