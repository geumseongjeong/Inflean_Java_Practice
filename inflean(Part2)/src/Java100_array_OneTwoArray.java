
// 1, 2 ���� �迭�� ���� �� ���


public class Java100_array_OneTwoArray {

	public static void main(String[] args) {
		
		
		// [1] String 1���� �迭 -> 3���� ���ڿ��� ���� �� �ִ� �迭 �����ϱ�
		// String Ÿ���� ���� ���� 3���� �����ϱ� ���� ���� ���� -> �̶�, ������ ���� �� ��Ҵ� �⺻�� -> null�� �ʱ�ȭ.
		String[] province = new String[3];
		System.out.println(province[0]);
		System.out.println(province[1]);
		System.out.println(province[2]);
		
		// String �迭 �ʱ�ȭ -> �����Է�
		province[0] = "������";
		province[1] = "��⵵";
		province[2] = "����";
		
		System.out.println(province[0]);
		System.out.println(province[1]);
		System.out.println(province[2]);
		
		// �迭 ���� �� ������ {} �� ���ÿ� �ʱ�ȭ
		String[] nation = new String[] {"�ѱ�", "�߱�", "�̱�"};
		System.out.println(nation[0]);
		System.out.println(nation[1]);
		System.out.println(nation[2]);
		
		//�ݺ����� ����Ͽ� �迭 �� ��� ���
		for(int i = 0; i<nation.length; i++) {
			System.out.print(nation[i] + " ");
			System.out.println();
		}
		
		//���� for������ �迭 ��� ���
		for(String aaa : province)
			System.out.print(aaa + " ");
			System.out.println();
		
		//2���� �迭 ����� -> 2x3 shape
		String[][] asia_nations = {{"�ѱ�", "�߱�", "�Ϻ�"}, {"�±�", "�ʸ���", "��Ʈ��"}};
		
		System.out.println(asia_nations[0]);	// 1���� �迭�� �ּҸ� �����ϴ� ���� ���
		System.out.println(asia_nations[1]);
		
		System.out.println(asia_nations[0][1]);	//�߱�
		System.out.println(asia_nations[1][0]); //�±�
		
		System.out.println(asia_nations.length);	//2
		System.out.println(asia_nations[0].length); //3
		System.out.println(asia_nations[1].length); //3
		
		//�ݺ����� ����� String 2���� �迭 �� ���
		for(int i = 0; i < asia_nations.length; i++) {
			for(int j = 0; j <asia_nations[i].length; j++)
				System.out.print(asia_nations[i][j] + " ");
		System.out.println();
		
		
		}
		
		// charAt() �ż��� ��� -> �ش� �ε����� �ִ� ���� ��ȯ -> �ܾ char �迭�� �ѱ��ھ� ������ �� ����
		String[] strAr = {"hong", "kim", "park"};
		System.out.println(strAr[0].charAt(2));		//n���
		System.out.println(strAr[1].charAt(2));		//m���
		System.out.println(strAr[2].charAt(2));		//r���

		
	

	}

}
