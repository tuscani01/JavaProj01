
	package ver08;

	public class PhoneSchoolInfo extends PhoneInfo{
		
		String major;
		String major; //전공
		int grade; //학년
		
		public PhoneSchoolInfo(String name, String phoneNumber, 
				String major, int grade) {
			super(name, phoneNumber);
			this.major = major;
			this.grade = grade;
			System.out.println("전공 : " + major);
			System.out.println("학년 : " + grade);
		}
	}