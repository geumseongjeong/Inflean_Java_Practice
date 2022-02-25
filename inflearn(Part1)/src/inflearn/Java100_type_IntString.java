package inflearn;

public class Java100_type_IntString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수선언
		int a = 12345;
		String str = "123";
		System.out.println(str.length());
		
		//정수 --> 문자열로 변환 --> 자릿수 구하기
		String stra = String.valueOf(a);
		System.out.println(stra.length());
		
		//문자열 + 정수형 = ?
		System.out.println(12345+1);  //123456
		System.out.println(str+1);
		
		//문자열 --> 정수형변환
		int b = Integer.valueOf(str);
		System.out.println(b+1);
		
	}

}
