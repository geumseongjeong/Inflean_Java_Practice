package inflearn;

public class Java100_operator_ArithmeticOperators2 {

	public static void main(String[] args) {
		
		//������ ��� --> ���������� �������� ��� �Ҽ��� ���°� ���� �� ����.
		
		int a =60, b=8;
		int rst1;
		double rst2, rst3, rst4;
		
		
		rst1= a/b;
		System.out.println(rst1); // 7.5�� �ƴ϶� 7�� ���-->Ÿ���� �������̹Ƿ�-->�Ǽ������� ��ȯ.
		System.out.println((double)rst1); //7.5�� �ƴ϶� 7.0-->���Ϲ޴� ������ �Ǽ������� �ϴ��� ���ϴ� ����� ������ ���Ѵ�.
		
		
		rst2=(double)a/(double)b; //��� ������ ���� double Ÿ������ ��ȯ.
		System.out.println(rst2); //7.5
		
		rst3 = 100/(double)3;
		rst4 = 250/3.0;
		System.out.println(rst3); //33.333333333333
		System.out.println(rst4); //83.3333333333
		
		System.out.printf("�� ������ ����� %.1f�Դϴ�.%n", rst4);
		
		
		
		
	}

}
