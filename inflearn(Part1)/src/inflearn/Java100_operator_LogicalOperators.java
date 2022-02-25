package inflearn;

public class Java100_operator_LogicalOperators {

	public static void main(String[] args) {
		
		
		int a =10, b=20, c=30;
		
		boolean rst1 = a<b && c>b; // true
		System.out.println(rst1);
		
		
		boolean rst2 = a<b || c<b;
		System.out.println(rst2);
		
		boolean rst3 = a>c || b!=c;
		System.out.println(rst3);
		
		boolean rst4 = !rst3;
		System.out.println(rst4);
		
	}

}
