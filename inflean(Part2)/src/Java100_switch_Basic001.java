
public class Java100_switch_Basic001 {

	public static void main(String[] args) {
		
		
		//��������
		int age = 14;
		
		//switch���ǹ�
		//���� ������ �������̾�� �Ѵ�.
		//break, default ������ �ʵ��� ����!
		
		//����ó��
		
		if(age>10 && age<20) {
			
			System.out.println("10������ ���ɴ븦 �Է����ּ���. ���α׷��� �����մϴ�.");
			System.exit(0);
		}
		
		
		switch(age) {
		
		case 10:
			System.out.println(age+"�� �Դϴ�. ���� �ڳʴ� A �����Դϴ�");
		break;
		
		case 20:
			System.out.println(age+"�� �Դϴ�. ��� ���� �ڳʴ� B �����Դϴ�");
		break;
		
		case 30:
			System.out.println(age+"�� �Դϴ�. ���� �ڳʴ� C �����Դϴ�");
		break;
		
		
		case 40:
			System.out.println(age+"�� �Դϴ�. ���� �ڳʴ� D �����Դϴ�");
		break;
		
		case 50:
			System.out.println(age+"�� �Դϴ�. ���� �ڳʴ� E �����Դϴ�");
		break;
		
		
		
		}

	}

}
