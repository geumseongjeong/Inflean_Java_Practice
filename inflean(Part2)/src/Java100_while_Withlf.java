
public class Java100_while_Withlf {

	public static void main(String[] args) {
		
		//홀수 짝수 구하기 문제를 while 반목문을 사용하여 구현
		
		
		//변수선언
		int number = 1;
		
		// 반복문을 돌면서 홀수, 작수 체크
		while(number <= 30) {
			
		//반복문을 돌면서 홀수, 짝수 체크
			if(number%2 == 0) {
				System.out.print(number + " ");
			}
		
		
		
			//반복문을 빠져나오기 위해서는 number 값을 반복 때 마다 증가.
			number++;
			
		}


	}

}
