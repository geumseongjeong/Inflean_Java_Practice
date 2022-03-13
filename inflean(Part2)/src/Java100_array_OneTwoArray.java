
// 1, 2 차원 배열의 생성 및 출력


public class Java100_array_OneTwoArray {

	public static void main(String[] args) {
		
		
		// [1] String 1차원 배열 -> 3개의 문자열을 담을 수 있는 배열 생성하기
		// String 타입의 참조 변수 3개를 저장하기 위한 공간 생성 -> 이때, 참조형 변수 각 요소는 기본값 -> null로 초기화.
		String[] province = new String[3];
		System.out.println(province[0]);
		System.out.println(province[1]);
		System.out.println(province[2]);
		
		// String 배열 초기화 -> 직접입력
		province[0] = "강원도";
		province[1] = "경기도";
		province[2] = "전라도";
		
		System.out.println(province[0]);
		System.out.println(province[1]);
		System.out.println(province[2]);
		
		// 배열 선언 및 생성시 {} 로 동시에 초기화
		String[] nation = new String[] {"한국", "중국", "미국"};
		System.out.println(nation[0]);
		System.out.println(nation[1]);
		System.out.println(nation[2]);
		
		//반복문을 사용하여 배열 값 모두 출력
		for(int i = 0; i<nation.length; i++) {
			System.out.print(nation[i] + " ");
			System.out.println();
		}
		
		//향상된 for문으로 배열 요소 출력
		for(String aaa : province)
			System.out.print(aaa + " ");
			System.out.println();
		
		//2차원 배열 만들기 -> 2x3 shape
		String[][] asia_nations = {{"한국", "중국", "일본"}, {"태국", "필리핀", "베트남"}};
		
		System.out.println(asia_nations[0]);	// 1차원 배열의 주소를 참조하는 값이 출력
		System.out.println(asia_nations[1]);
		
		System.out.println(asia_nations[0][1]);	//중국
		System.out.println(asia_nations[1][0]); //태국
		
		System.out.println(asia_nations.length);	//2
		System.out.println(asia_nations[0].length); //3
		System.out.println(asia_nations[1].length); //3
		
		//반복문을 사용한 String 2차원 배열 값 출력
		for(int i = 0; i < asia_nations.length; i++) {
			for(int j = 0; j <asia_nations[i].length; j++)
				System.out.print(asia_nations[i][j] + " ");
		System.out.println();
		
		
		}
		
		// charAt() 매서드 사용 -> 해당 인덱스에 있는 값을 반환 -> 단어를 char 배열에 한글자씩 저장할 수 있음
		String[] strAr = {"hong", "kim", "park"};
		System.out.println(strAr[0].charAt(2));		//n출력
		System.out.println(strAr[1].charAt(2));		//m출력
		System.out.println(strAr[2].charAt(2));		//r출력

		
	

	}

}
