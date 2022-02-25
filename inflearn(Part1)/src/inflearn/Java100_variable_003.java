package inflearn;

public class Java100_variable_003 {

	public static void main(String[] args) {
		
	
	System.out.println(Byte.BYTES);  //바이트 계산
	System.out.println(Byte.SIZE);  // 비트 계산
	System.out.println();
	System.out.println("Byte\t"+Byte.BYTES+"(바이트)"+"----->"+Byte.SIZE+"(비트)\t"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
	System.out.println("Short\t"+Short.BYTES+"(바이트)"+"----->"+Short.SIZE+"(비트)\t"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
	System.out.println("Int\t"+Integer.BYTES+"(바이트)"+"----->"+Integer.SIZE+"(비트)\t"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
	System.out.println("Char\t"+Character.BYTES+"(바이트)"+"----->"+Character.SIZE+"(비트)\t"+Character.MIN_VALUE+"~"+Character.MAX_VALUE);
	System.out.println("Long\t"+Long.BYTES+"(바이트)"+"----->"+Long.SIZE+"(비트)\t"+(int)Long.MIN_VALUE+"~"+Long.MAX_VALUE);

	}

}
