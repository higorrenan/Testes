package exerciciofixaçao1;

public class CarroLitros {
	public static void main(String[] args) {
		
		int hora = 10;
		int km = 85;
		double litro = 0;
		
		litro = Math.multiplyExact(km, hora)/12;
			System.out.printf(" %.3f ",litro);
	}
}
