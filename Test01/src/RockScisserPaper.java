
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
	         System.out.println("============ �޴� ============");
	         System.out.println("1. ���� \t2.����\t3.��\t4.��������");
	         System.out.println("=============================");
	         
	         try {
	            System.out.print(">> �����ϼ��� => ");
	            choice = Integer.parseInt(sc.nextLine());
	            
	            if(!(1<= choice && choice <=4)) {
	               System.out.println("�� �޴��� ���������ʴ� ��ȣ�Դϴ�.\n");
	               continue;
	            }
	            if(choice !=4) {
	               //1, 2, 3�� ������ ���
	               randomNum = rd.nextInt(4-1+1)+1;
	               
	               if((randomNum==1 && choice == 3) ||
	                  (randomNum==2 && choice == 1) ||
	                  (randomNum==3 && choice == 2)) {
	                  System.out.println(">> �����ϴ�");
	               }
	               else if((randomNum==3 && choice == 1) ||
	                     (randomNum==1 && choice == 2) ||
	                     (randomNum==2 && choice == 3)) {
	                     System.out.println(">> �̰���ϴ�");
	                  }
	               else {
	                  System.out.println(">> �����ϴ�");
	               }
	               
	            }
	            
	         } catch (NumberFormatException e) {
	            System.out.println("�� ���ڷθ� �Է��ϼ���!!");
	         }
	         
	         
	         
	      } while (!(choice == 4));//choice�� 4��� �������´�.
	      
	      sc.close();
	      System.out.println("\n~~~~���α׷�����~~~~\n");
	   }

	}


