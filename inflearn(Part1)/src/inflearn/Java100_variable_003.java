package inflearn;

public class Java100_variable_003 {

	public static void main(String[] args) {
		
	
	System.out.println(Byte.BYTES);  //����Ʈ ���
	System.out.println(Byte.SIZE);  // ��Ʈ ���
	System.out.println();
	System.out.println("Byte\t"+Byte.BYTES+"(����Ʈ)"+"----->"+Byte.SIZE+"(��Ʈ)\t"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
	System.out.println("Short\t"+Short.BYTES+"(����Ʈ)"+"----->"+Short.SIZE+"(��Ʈ)\t"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
	System.out.println("Int\t"+Integer.BYTES+"(����Ʈ)"+"----->"+Integer.SIZE+"(��Ʈ)\t"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
	System.out.println("Char\t"+Character.BYTES+"(����Ʈ)"+"----->"+Character.SIZE+"(��Ʈ)\t"+Character.MIN_VALUE+"~"+Character.MAX_VALUE);
	System.out.println("Long\t"+Long.BYTES+"(����Ʈ)"+"----->"+Long.SIZE+"(��Ʈ)\t"+(int)Long.MIN_VALUE+"~"+Long.MAX_VALUE);

	}

}
