
public class Java100_if_Basic003 {

	public static void main(String[] args) {
		
		// 변수 선언
		int kor = 70, eng = 70, math =0;
		int total_score;
		total_score = kor + eng + math;
		
		//if ~ else if ~ else 조건문 사용하기
		if(total_score >= 270){
			System.out.println("당신의 토탈 점수는" + total_score + "입니다. 매우 잘했어요!");
			System.out.println("축하해요~!!!!");
		}
		else if(total_score >= 240) {
			System.out.println("당신의 토탈 점수는" + total_score + "입니다. 잘했어요!");
			
		}
		else { 
			System.out.println("당신의 토탈 점수는" + total_score + "입니다. 노력하세요!");
			
		}
		
		
	}

}
