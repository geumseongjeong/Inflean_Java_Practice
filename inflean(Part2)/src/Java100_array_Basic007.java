import java.util.Arrays;


public class Java100_array_Basic007 {

	public static void main(String[] args) {
		
		//�迭�� ������ for���� ���� �ݺ����� ������� �ʰ� �Ѳ����� ����ϴ� �ڵ带 �ۼ�
		// �޼���� �迭�� ��� ������ ���
		
		//Arrays.toString() �ż���
		//toString() ���ڷδ� �迭���� �־��ָ� �ȴ�.
		//����� ���ؼ��� �⺻������ java.util.Arrays ����Ʈ ������ �Ǿ��� �־�� �Ѵ�.
		
		int[] ar = {238,483,239,442,487,239,873};
		
		System.out.println(Arrays.toString(ar)); // []��ȣ�� ���·� �迭 ǥ�ø� �����ָ鼭 ��� ��.	
		System.out.println(ar[0]);
		
		//�ݺ��� �̿�
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();

	}

}
