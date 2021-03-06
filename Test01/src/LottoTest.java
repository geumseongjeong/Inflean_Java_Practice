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
        System.out.println(" 1. 로또구입 | 2. 번호확인 | 3. 당첨확인 | 4. 종료");
        System.out.println("====================================================");
        System.out.println("");
        System.out.print("번호를 선택해주세요 > ");
        int selectNo = sc.nextInt();

        if(selectNo == 1) {
            System.out.println("");
            System.out.println("로또구입 > ");
            // 1~45 정수값을 입력받아 myLotto 배열에 저장
            for (int i = 0; i < myLotto.length; i++) {
                System.out.print((i+1) + " 번째 번호를 입력하세요 > ");
                int result = sc.nextInt();

                if(result < 1 || result > 45) {
                    System.out.println("1 ~ 45 까지의 정수를 입력해주세요");
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
            System.out.println("번호확인");
            System.out.println("");

            for (int i : myLotto) {
                System.out.print(i+ " ");
            }

        }else if(selectNo == 3) {
            System.out.println("");
            System.out.println("당첨확인");
            System.out.print("이번주 당첨번호는 : ");
            for (int i : lotto) {
                System.out.print(i + " ");
            }    
            System.out.println();

            System.out.print("나의 번호 : ");
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
            System.out.println("동일한 번호 개수는 : "+count);

        }else {
            System.out.println("");
            System.out.println("프로그램 종료");
            isRun = false;
        }



    	}
	}
}




