
public class Java100_if_Basic003 {

	public static void main(String[] args) {
		
		// ���� ����
		int kor = 70, eng = 70, math =0;
		int total_score;
		total_score = kor + eng + math;
		
		//if ~ else if ~ else ���ǹ� ����ϱ�
		if(total_score >= 270){
			System.out.println("����� ��Ż ������" + total_score + "�Դϴ�. �ſ� ���߾��!");
			System.out.println("�����ؿ�~!!!!");
		}
		else if(total_score >= 240) {
			System.out.println("����� ��Ż ������" + total_score + "�Դϴ�. ���߾��!");
			
		}
		else { 
			System.out.println("����� ��Ż ������" + total_score + "�Դϴ�. ����ϼ���!");
			
		}
		
		
	}

}
