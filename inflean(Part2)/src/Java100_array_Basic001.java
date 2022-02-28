
public class Java100_array_Basic001{

	public static void main(String[] args) {
		
		//배열의 선언
		//데이터타입[] 배열명 = new 데이터타입[배열크기]
		//데이터타입 배열명[] = new 데이터타입[배열크기]
		
		//배열의 선언 --> 배열 크기 지정 --> 배열 공간의 값은 자동으로 초기화 셋팅 됨(정수형:0, 실수형:0.0)
		
		
		//첫번째 방식
		int[] sales_table = new int[100];
		
		//두번째 방식
		double[] sales_table2;
		sales_table2 = new double[100];
		
		//선언한 배열 사용하기
		System.out.println(sales_table[0]);
		System.out.println(sales_table2[99]);
		
		
		
		
	}

}
