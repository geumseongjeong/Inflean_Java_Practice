
public class Java100_if_ThreeOperator {

	public static void main(String[] args) {
		
		
		//��������
		int hour = 9;
		
		
		//���� ������ �׽�Ʈ  --> 10���� �۰ų� ������ 100�� ���Ͻÿ�.
		
		int test = hour <= 10 ? hour*100:hour;
		System.out.println(test);
		
		
		//���� �����ڸ� �̿� 12�ú��� ������ ����, ũ�� ���� ���
		String str = hour < 12 ? "����":"����";		
		System.out.println(str);
		System.out.println("[3]" + str);
		
		

	}

}

