package inflearn;

public class Java100_type_IntString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��������
		int a = 12345;
		String str = "123";
		System.out.println(str.length());
		
		//���� --> ���ڿ��� ��ȯ --> �ڸ��� ���ϱ�
		String stra = String.valueOf(a);
		System.out.println(stra.length());
		
		//���ڿ� + ������ = ?
		System.out.println(12345+1);  //123456
		System.out.println(str+1);
		
		//���ڿ� --> ��������ȯ
		int b = Integer.valueOf(str);
		System.out.println(b+1);
		
	}

}
