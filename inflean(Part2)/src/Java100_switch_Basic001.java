
public class Java100_switch_Basic001 {

	public static void main(String[] args) {
		
		
		//변수선언
		int age = 14;
		
		//switch조건문
		//변수 조건은 정수형이어야 한다.
		//break, default 빼먹지 않도록 주의!
		
		//예외처리
		
		if(age>10 && age<20) {
			
			System.out.println("10단위로 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		
		switch(age) {
		
		case 10:
			System.out.println(age+"대 입니다. 참고서 코너는 A 구역입니다");
		break;
		
		case 20:
			System.out.println(age+"대 입니다. 취업 서적 코너는 B 구역입니다");
		break;
		
		case 30:
			System.out.println(age+"대 입니다. 참고서 코너는 C 구역입니다");
		break;
		
		
		case 40:
			System.out.println(age+"대 입니다. 참고서 코너는 D 구역입니다");
		break;
		
		case 50:
			System.out.println(age+"대 입니다. 참고서 코너는 E 구역입니다");
		break;
		
		
		
		}

	}

}
