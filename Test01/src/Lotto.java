import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int mynum[] = new int[6]; // 플레이어 번호
		int errcount = 0; // 선택값 에러 카운트
		int count = 0; // 숫자 당첨 카운트
		int bonusnum = 0; // 보너스 숫자

		// 로또 번호 입력
		System.out.println("로또 번호 6개를 입력하세요.");

		for (int i = 0; i < mynum.length; i++) {
			mynum[i] = sc.nextInt();
			if (mynum[i] > 45 || mynum[i] < 1) { // 범위 초과 체크
				errcount++;
				i--;
				System.out.println("입력값을 " + errcount + "만큼 다시 입력하세요.");
			}
			for (int erch1 = 0; erch1 < i; erch1++) { // 내 번호 중복값 체크
				if (mynum[i] == mynum[erch1]) {
					errcount++;
					System.out.println("중복값이 있습니다." + errcount + "만큼 다시 입력하세요.");
					i--;
				}
			}
			errcount = 0;
		}
		Arrays.sort(mynum);

		// 로또 번호를 랜덤으로 생성
		int lottonum[] = new int[6];
		for (int i = 0; i < lottonum.length; i++) {
			lottonum[i] = ran.nextInt(10);
			if (lottonum[i] == 0) { // 숫자 0일시 다시 추첨
				i--;
			}
			for (int erch2 = 0; erch2 < i; erch2++) { // 추첨번호의 중복 방지
				if (lottonum[i] == lottonum[erch2]) {
					i--;
				}
			}
			if (i == 5) { // 랜덤숫자 결정
				bonusnum = ran.nextInt(9);
			} else if (i == 5 && bonusnum == 0) {
				System.out.println("보너스 0존재");
				i--;
			}
			for (int erchbous = 0; erchbous < lottonum.length; erchbous++) { // 보너스 중복방지
				if (i == 5 && (lottonum[erchbous] == bonusnum)) {
					i--;
				}
			}
		}
		Arrays.sort(lottonum);

		// 등수 확인
		for (int i = 0; i < lottonum.length; i++) {
			for (int j = 0; j < mynum.length; j++) {
				if (lottonum[j] == mynum[i]) {
					count++;
					break;
				}
			}
		}

		// 당첨결과 비교
		System.out.print("나의 선택 번호 : ");
		for (int i = 0; i < mynum.length; i++) {
			System.out.print(mynum[i] + " ");
		}
		System.out.println("");

		System.out.print("추첨 번호 : ");
		for (int j = 0; j < lottonum.length; j++) {
			System.out.print(lottonum[j] + " ");
		}
		System.out.println("보너스 : " + bonusnum);
		System.out.println();

		// 로또 등수 확인
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
				System.out.println("5등입니다.");
				break;
			case 4:
				System.out.println("4등입니다.");
				break;
			case 5:
				System.out.println("3등입니다.");
				break;
			case 6:
				System.out.println("축하합니다! 1등입니다.");
				break;
			}
		}
		if (count == 5 && bonuscheak == true) {
			System.out.println("2등입니다.");
		}
		System.out.println("당첨번호 갯수 : " + count);
		sc.close();
	}
}