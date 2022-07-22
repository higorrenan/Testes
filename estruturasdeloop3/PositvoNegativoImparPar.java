package estruturasdeloop3;

import java.util.Scanner;

public class PositvoNegativoImparPar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int  quantPositivo = 0;
		int  quantNegativo = 0; 
		int  quantPar = 0;
		int	 quantImpar = 0;
		int valor = 0;
		for(i = 1; i<=10; i++) {
			System.out.println("Informe um numero: ");
			valor = sc.nextInt();
					
			if(valor >= 0) {
				quantPositivo++;
			}
			if (valor < 0 ) {
				quantNegativo++;
			}	
			if(valor % 2 ==0) {
				quantPar++;
			}
			if(valor % 2 == 1) {
				quantImpar++;
			}
		}
		System.out.println("Essa são as quantidade de numeros positivos:"+quantPositivo);
		System.out.println("Essa são as quantidade de numeros negativos:"+quantNegativo);
		System.out.println("Essa são as quantidade de numeros pares:"+quantPar);
		System.out.println("Essa são as quantidade de numeros impares:"+quantImpar);
	}
}
