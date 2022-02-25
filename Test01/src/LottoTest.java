import java.util.Scanner;

public class LottoTest {

public static void main(String[] args) {


    int lotto[] = new int[6];

    for (int i = 0; i < lotto.length; i++) {
        lotto[i] = (int)(Math.random() * 45) + 1;
        for (int j = 0; j < i; j++) {
            if (lotto[i] == lotto[j]) {
                i--;
                break;
            }
        }
    }
    int temp1 = 0;

    for (int i = 0; i < lotto.length; i++) {
        for (int j = i+1; j < lotto.length; j++) {
            if (lotto[i] > lotto[j]) {
                temp1 = lotto[i];
                lotto[i] = lotto[j];
                lotto[j] = temp1;
            }
        }
    }

    boolean isRun = true;

    int[] myLotto = new int[6];

    Scanner sc = new Scanner(System.in);

    int temp = 0;

    while(isRun) {

        System.out.println("");
        System.out.println("====================================================");
        System.out.println(" 1. �ζǱ��� | 2. ��ȣȮ�� | 3. ��÷Ȯ�� | 4. ����");
        System.out.println("====================================================");
        System.out.println("");
        System.out.print("��ȣ�� �������ּ��� > ");
        int selectNo = sc.nextInt();

        if(selectNo == 1) {
            System.out.println("");
            System.out.println("�ζǱ��� > ");
            // 1~45 �������� �Է¹޾� myLotto �迭�� ����
            for (int i = 0; i < myLotto.length; i++) {
                System.out.print((i+1) + " ��° ��ȣ�� �Է��ϼ��� > ");
                int result = sc.nextInt();

                if(result < 1 || result > 45) {
                    System.out.println("1 ~ 45 ������ ������ �Է����ּ���");
                    i--;
                }else {
                    myLotto[i] = result;
                }
            }

            for (int i = 0; i < myLotto.length; i++) {
                for (int j = i+1; j < myLotto.length; j++) {
                    if (myLotto[i] > myLotto[j]) {
                        temp = myLotto[i];
                        myLotto[i] = myLotto[j];
                        myLotto[j] = temp;
                    }
                }
            }

        }else if(selectNo == 2) {
            System.out.println("");
            System.out.println("��ȣȮ��");
            System.out.println("");

            for (int i : myLotto) {
                System.out.print(i+ " ");
            }

        }else if(selectNo == 3) {
            System.out.println("");
            System.out.println("��÷Ȯ��");
            System.out.print("�̹��� ��÷��ȣ�� : ");
            for (int i : lotto) {
                System.out.print(i + " ");
            }    
            System.out.println();

            System.out.print("���� ��ȣ : ");
            for (int i : myLotto) {
                System.out.print(i+ " ");
            }

            int count = 0;

            for (int i = 0; i < myLotto.length; i++) {
                for (int j = 0; j < lotto.length; j++) {

                    if (myLotto[i] == lotto[j]) {
                        count++;
                    }
                }
            }
            System.out.println();
            System.out.println("������ ��ȣ ������ : "+count);

        }else {
            System.out.println("");
            System.out.println("���α׷� ����");
            isRun = false;
        }



    	}
	}
}




