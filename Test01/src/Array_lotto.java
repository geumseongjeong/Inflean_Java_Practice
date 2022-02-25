public class Array_lotto {
	public static void main(String[] args) { 
		int lotto[] = new int [6]; 
		// 번호 생성 
		for(int i=0; i<6; i++) { 
			lotto[i] = (int)(Math.random() * 45) + 1;
		
			// 중복 번호 제거 
		for(int j=0; j<i; j++) {
			if(lotto[i] == lotto[j]) { 
				i--;
				break; 
				} 
			}
		} 
		System.out.print("로또 번호: "); 
		// 번호 출력 
		for(int i=0; i<6; i++) { 
			System.out.print(lotto[i] + " ");
			
			System.out.println("2022.02.25 업데이트");
			System.out.println("25일 오후 업데이트");
	
		}
	}
}

