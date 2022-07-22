package exerciciofixaçao1;

public class FomulaBaskara {
	public static void main(String[] args) {
		
		double a =1.0, b =20.0, c =5.0;
		double result1 =0, result2 =0;
		
		double delta = (Math.pow(b, 2) - (4 * a * c));
		double denominador = 2 * a;
		double numerador1 = -b + Math.sqrt(delta);
		double numerador2 = -b - Math.sqrt(delta);
		result1 = numerador1 / denominador;
		result2 = numerador2 / denominador;
		
		if(denominador == 0 && delta < 0 ) {
			System.out.println("Impossível calcular");
		}
		System.out.printf("R1  %.5f \n",result1);		
		System.out.printf("R2  %.5f",result2);	
	}
}
