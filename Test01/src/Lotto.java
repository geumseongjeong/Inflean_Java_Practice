import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int mynum[] = new int[6]; // �÷��̾� ��ȣ
		int errcount = 0; // ���ð� ���� ī��Ʈ
		int count = 0; // ���� ��÷ ī��Ʈ
		int bonusnum = 0; // ���ʽ� ����

		// �ζ� ��ȣ �Է�
		System.out.println("�ζ� ��ȣ 6���� �Է��ϼ���.");

		for (int i = 0; i < mynum.length; i++) {
			mynum[i] = sc.nextInt();
			if (mynum[i] > 45 || mynum[i] < 1) { // ���� �ʰ� üũ
				errcount++;
				i--;
				System.out.println("�Է°��� " + errcount + "��ŭ �ٽ� �Է��ϼ���.");
			}
			for (int erch1 = 0; erch1 < i; erch1++) { // �� ��ȣ �ߺ��� üũ
				if (mynum[i] == mynum[erch1]) {
					errcount++;
					System.out.println("�ߺ����� �ֽ��ϴ�." + errcount + "��ŭ �ٽ� �Է��ϼ���.");
					i--;
				}
			}
			errcount = 0;
		}
		Arrays.sort(mynum);

		// �ζ� ��ȣ�� �������� ����
		int lottonum[] = new int[6];
		for (int i = 0; i < lottonum.length; i++) {
			lottonum[i] = ran.nextInt(10);
			if (lottonum[i] == 0) { // ���� 0�Ͻ� �ٽ� ��÷
				i--;
			}
			for (int erch2 = 0; erch2 < i; erch2++) { // ��÷��ȣ�� �ߺ� ����
				if (lottonum[i] == lottonum[erch2]) {
					i--;
				}
			}
			if (i == 5) { // �������� ����
				bonusnum = ran.nextInt(9);
			} else if (i == 5 && bonusnum == 0) {
				System.out.println("���ʽ� 0����");
				i--;
			}
			for (int erchbous = 0; erchbous < lottonum.length; erchbous++) { // ���ʽ� �ߺ�����
				if (i == 5 && (lottonum[erchbous] == bonusnum)) {
					i--;
				}
			}
		}
		Arrays.sort(lottonum);

		// ��� Ȯ��
		for (int i = 0; i < lottonum.length; i++) {
			for (int j = 0; j < mynum.length; j++) {
				if (lottonum[j] == mynum[i]) {
					count++;
					break;
				}
			}
		}

		// ��÷��� ��
		System.out.print("���� ���� ��ȣ : ");
		for (int i = 0; i < mynum.length; i++) {
			System.out.print(mynum[i] + " ");
		}
		System.out.println("");

		System.out.print("��÷ ��ȣ : ");
		for (int j = 0; j < lottonum.length; j++) {
			System.out.print(lottonum[j] + " ");
		}
		System.out.println("���ʽ� : " + bonusnum);
		System.out.println();

		// �ζ� ��� Ȯ��
		boolean bonuscheak = false;
		for (int i = 0; i < lottonum.length; i++) {
			if (mynum[i] == bonusnum) {
				bonuscheak = true;
				break;
			}
		}
		if (bonuscheak == false) {
			switch (count) {
			case 3:
				System.out.println("5���Դϴ�.");
				break;
			case 4:
				System.out.println("4���Դϴ�.");
				break;
			case 5:
				System.out.println("3���Դϴ�.");
				break;
			case 6:
				System.out.println("�����մϴ�! 1���Դϴ�.");
				break;
			}
		}
		if (count == 5 && bonuscheak == true) {
			System.out.println("2���Դϴ�.");
		}
		System.out.println("��÷��ȣ ���� : " + count);
		sc.close();
	}
}