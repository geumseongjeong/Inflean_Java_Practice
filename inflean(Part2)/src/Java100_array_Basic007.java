import java.util.Arrays;


public class Java100_array_Basic007 {

	public static void main(String[] args) {
		
		//배열의 값들을 for문과 같은 반복문을 사용하지 않고 한꺼번에 출력하는 코드를 작성
		// 메서드로 배열의 요소 값들을 출력
		
		//Arrays.toString() 매서드
		//toString() 인자로는 배열명을 넣어주면 된다.
		//사용을 위해서는 기본적으로 java.util.Arrays 임포트 선언이 되어져 있어야 한다.
		
		int[] ar = {238,483,239,442,487,239,873};
		
		System.out.println(Arrays.toString(ar)); // []괄호의 형태로 배열 표시를 보여주면서 출력 됨.	
		System.out.println(ar[0]);
		
		//반복문 이용
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();

	}

}
