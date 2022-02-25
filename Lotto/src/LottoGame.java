import java.util.Scanner;

public class LottoGame { 
 public static void main(String [] args) {
  Scanner sc = new Scanner(System.in);
 
  int[] user = new int[6]; 
  int[] com = new int[6];
  int count = 0;
  
  
 System.out.print("로또번호 : ");
  for(int i=0; i<6; i++) {
   user[i] = sc.nextInt();
  }
  
  
  System.out.print("당첨번호 : ");
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
   System.out.println(count + "개 맞췄으므로 다음기회에");
   break;
   case 1:
   System.out.println(count + "개 맞췄으므로 다음기회에");
   break;
  case 2:
   System.out.println(count + "개 맞췄으므로 5등입니다.");
   break;
  case 3:
   System.out.println(count + "개 맞췄으므로 4등입니다.");
   break;
  case 4:
   System.out.println(count + "개맞췄으므로 3등입니다.");
   break;
  case 5:
   System.out.println(count + "개맞췄으므로 2등입니다.");
   break;
  default:
   System.out.println(count + "개맞췄으므로 1등입니다.");
   break;
  }
 }
}