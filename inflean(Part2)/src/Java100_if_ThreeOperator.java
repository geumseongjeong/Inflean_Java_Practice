
public class Java100_if_ThreeOperator {

	public static void main(String[] args) {
		
		
		//변수선언
		int hour = 9;
		
		
		//삼항 연산자 테스트  --> 10보다 작거나 같으면 100을 곱하시오.
		
		int test = hour <= 10 ? hour*100:hour;
		System.out.println(test);
		
		
		//삼항 연산자를 이용 12시보다 작으면 오전, 크면 오후 출력
		String str = hour < 12 ? "오전":"오후";		
		System.out.println(str);
		System.out.println("[3]" + str);
		
		

	}

}

