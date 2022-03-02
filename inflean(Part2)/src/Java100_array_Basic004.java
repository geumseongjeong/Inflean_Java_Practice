
public class Java100_array_Basic004 {

	public static void main(String[] args) {
		
		//크기 5의 정수형 배열을 선언하고 55,88,60,100,90 으로 ㄱ가 요소의 값을 초기화 하시오
		//2가지 방식으로 초기화를 할 수 있는데 모두 작성해 보시오
		
		//배열선언과 동시에 특정 값으로 초기화
		int[] sales_table = {55, 88, 60, 100, 90};
		System.out.println(sales_table[1]);
		
		int[] sales_table2 = new int[] {55,80,60,100,90};   //1번 방식보다 불편;;;;
		System.out.println(sales_table2[2]);
		
		int[] sales_table3;
		sales_table3 = new int[] {55,80,60,100,90};
		System.out.println(sales_table3[3]);
		
	
	}

}
