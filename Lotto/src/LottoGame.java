import java.util.Scanner;

public class LottoGame { 
 public static void main(String [] args) {
  Scanner sc = new Scanner(System.in);
 
  int[] user = new int[6]; 
  int[] com = new int[6];
  int count = 0;
  
  
 System.out.print("�ζǹ�ȣ : ");
  for(int i=0; i<6; i++) {
   user[i] = sc.nextInt();
  }
  
  
  System.out.print("��÷��ȣ : ");
  for(int i=0; i<6; i++) {   
   com[i] = (int)(Math.random()*45+1);
   System.out.print(com[i] + " ");
  }
  
 
  System.out.println();
  
  for(int i=0; i<6; i++) {
   for(int j=0; j<6; j++){
    if(user[i]==com[j]) {
     count++;

    		}
    
   		}
  }
 

  switch(count) {
  case 0:
   System.out.println(count + "�� �������Ƿ� ������ȸ��");
   break;
   case 1:
   System.out.println(count + "�� �������Ƿ� ������ȸ��");
   break;
  case 2:
   System.out.println(count + "�� �������Ƿ� 5���Դϴ�.");
   break;
  case 3:
   System.out.println(count + "�� �������Ƿ� 4���Դϴ�.");
   break;
  case 4:
   System.out.println(count + "���������Ƿ� 3���Դϴ�.");
   break;
  case 5:
   System.out.println(count + "���������Ƿ� 2���Դϴ�.");
   break;
  default:
   System.out.println(count + "���������Ƿ� 1���Դϴ�.");
   break;
  }
 }
}