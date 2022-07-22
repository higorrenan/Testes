package estruturarepeticao;

public class Maior {
	public static void main(String[] args) {
		
		double a = 7.0;
		double b = 5.0;
		double maior =0;
		
		maior =Math.floor(a + b + Math.abs(a - b))/2;
		
		System.out.println(maior);
	}
}
