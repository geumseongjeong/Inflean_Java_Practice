// �迭�� �����ϴ� �޼��带 ���غ��� ���õ� ���� �ڵ带 ����

import java.util.Arrays;

public class Java100_array_Basic009 {

	public static void main(String[] args) {
		
		//�迭 �����ϱ�
		//arraycopy() �޼����� -> System.arraycopy(�����迭��,???,����迭��,???,����);
		
		
		int[] ar = {1,2,3,4,5};
		int[] ar2 = {1,2,3,4,5,6,7,8,9,10};
		
		System.arraycopy(ar, 2, ar2, 4, 3);		//[1,2,3,4,3,4,5,8,9,10]\
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(ar2));
	}

}
