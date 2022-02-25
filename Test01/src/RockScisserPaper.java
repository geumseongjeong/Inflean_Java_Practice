
import java.util.Random;
import java.util.Scanner;

public class RockScisserPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	      Random rd = new Random();
	      
	      int choice = 0;
	      int randomNum = 0;
	      
	      
	      do {
	         System.out.println("============ 메뉴 ============");
	         System.out.println("1. 가위 \t2.바위\t3.보\t4.게임종료");
	         System.out.println("=============================");
	         
	         try {
	            System.out.print(">> 선택하세요 => ");
	            choice = Integer.parseInt(sc.nextLine());
	            
	            if(!(1<= choice && choice <=4)) {
	               System.out.println("▶ 메뉴에 존재하지않는 번호입니다.\n");
	               continue;
	            }
	            if(choice !=4) {
	               //1, 2, 3을 기입한 경우
	               randomNum = rd.nextInt(4-1+1)+1;
	               
	               if((randomNum==1 && choice == 3) ||
	                  (randomNum==2 && choice == 1) ||
	                  (randomNum==3 && choice == 2)) {
	                  System.out.println(">> 졌습니다");
	               }
	               else if((randomNum==3 && choice == 1) ||
	                     (randomNum==1 && choice == 2) ||
	                     (randomNum==2 && choice == 3)) {
	                     System.out.println(">> 이겼습니다");
	                  }
	               else {
	                  System.out.println(">> 비겼습니다");
	               }
	               
	            }
	            
	         } catch (NumberFormatException e) {
	            System.out.println("▶ 숫자로만 입력하세요!!");
	         }
	         
	         
	         
	      } while (!(choice == 4));//choice가 4라면 빠져나온다.
	      
	      sc.close();
	      System.out.println("\n~~~~프로그램종료~~~~\n");
	   }

	}


