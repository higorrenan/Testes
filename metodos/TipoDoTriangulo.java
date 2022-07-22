package metodos;

import java.util.Scanner;

public class TipoDoTriangulo {
	static void triangulo (double a , double b , double c) {		
		 if(a  ==  (b + c)) {
			System.out.println("TRIÂNGULO RETANGULO");
			System.out.println("TRIÂNGULO ISÓCELES");
		}else if(a > (b + c)) {
			System.out.println("TRIÂNGULO OBTUSANGULO");
			System.out.println("TRIÂNGULO ISÓCELES");
		}else if(a  < (b + c) ) {
			if((a == b) && (b ==c)) {
			System.out.println("TRIÂNGULO ACUTANGULO");
			System.out.println("TRIÂNGULO EQUILATERO");
		}else {
			System.out.println("TRIÂNGULO ACUTANGULO");
			System.out.println("TRIÂNGULO ISÓCELES");
			}
		}
	}
		
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double a = 20.0 ;
		double b = 6.0 ;
		double c = 10.0 ;
		triangulo (a,b,c);
		
		entrada.close();
	}
}