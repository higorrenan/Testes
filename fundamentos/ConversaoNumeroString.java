package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
	Integer num1 = 10000;
	System.out.println( num1.toString().length());
		
	int a = 220000;
	System.out.println(Integer.toString(a).length());
	
	System.out.println(("" + a).length());
	System.out.println(("" + num1).length());
		
	}

}
