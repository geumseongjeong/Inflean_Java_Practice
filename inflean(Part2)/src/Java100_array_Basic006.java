
public class Java100_array_Basic006 {

	public static void main(String[] args) {
		
		
		// 크기 5의 정수형과 실수형 배열을 생성하고 각각의 주소 값을 출력해보시오.
		
		//정수형과 실수형 배열 변수 선언
		int[] ar = {3,3,3,3,4};
		double[] ar2 = {9.8, 2.45, 5.98, 5.11, 3.14};
		
		
		//마지막 배열 요소 값 출력
		System.out.println(ar[ar.length-1]);
		System.out.println(ar2[ar2.length-1]);
		System.out.println(ar[4]);
		System.out.println(ar2[4]);
		
		//배열명 자체를 찍어서 출력  --> 주소 값 
		System.out.println(ar); //정수형배열 --> I
		System.out.println(ar2); //실수형배열 --> D
		
		}
	

}
