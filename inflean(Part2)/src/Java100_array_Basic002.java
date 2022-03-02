
public class Java100_array_Basic002 {

	public static void main(String[] args) {
		
		//배열과 인덱스의 관계에 대해 설명하고 초깃값은 어덯게 셋팅되는지...
		//크기 10의 정수형 배열을 생성하고 인덱스로 배열 공간의 값을 출력!
		
		
		//배열과 인덱스
		//크기 10의 정수형 배열을 선언하고 크기 10을 지정하면 메모리상에는 10개의 정수형 값을 담을 수 있는 공간이 생성됨
		//배열 변수는 참조형 타입으로써 해당 메모리 공간을 가리키게 된다. -> 즉, 해당 메모리 공간의 주소 값을 가진다 -> 이 주소값을 통해서 참조한다.
		//공간이 10개 만들어지면서 동시에 해당 공간에 접근할 수 있는 인덱스 번호가 자동 부여된다. -> 인덱스 번호는 0부터 시작
		// 즉 마지막 인덱스는 "배열의 크기 -1" 이 된다.
		//인덱스 사용 --> 배열명[인덱스번호]
		
		
		//배열의 선언 및 크기 지정 -> 학생 10명의 성적을 담는 배열
		int[] scores = new int[10];
		int s_size = scores.length;
		System.out.println(s_size);
		
		//선언한 배열을 인덱스로 접근하여 값 출력하기
		System.out.println(scores[0]);
		System.out.println(scores[9]);
		System.out.println(scores[10-1]);

	}

}
