package oprators;

public class O001_Unary {
	public static void main(String[] args) {
		
		
		int a = 10;
		int b = a++ + ++a + a-- - a++;
				
		
		System.out.println("a : "+a); //10 10 12
		System.out.println("b : "+b); //20 45 44
		
		
		
	}
}
