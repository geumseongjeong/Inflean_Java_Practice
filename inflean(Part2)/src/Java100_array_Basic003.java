
public class Java100_array_Basic003 {

	public static void main(String[] args) {
		
		//배열 요소에 데이터 값으 넣으려면 어떻게 해야하나
		//배열을 생성한 후에 데이터 값을 입력하는 방법에 대해서 아는지 묻는 문제
		
		//배열 선언
		int[] sales_table = new int[5];
		
		//선언한 배열 공간에 값 입력하기
		sales_table[0] = 3;
		sales_table[1] = 11;
		sales_table[2] = 22;
		sales_table[3] = 33;
		sales_table[4] = 44;
		
		System.out.println(sales_table[0]);
		System.out.println(sales_table[1]);
		System.out.println(sales_table[2]);
		System.out.println(sales_table[3]);
		System.out.println(sales_table[4]);
		System.out.println(sales_table[sales_table.length-1]);
		
		

	}

}
