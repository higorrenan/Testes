package logica;

import java.util.Scanner;

public class VendasDeMacas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas maças foram compras: ");
		double quantidade = entrada.nextDouble();
		double valor = 0;
		
		if(quantidade <12) {
			valor = quantidade * 130;
			System.out.printf("valor da compra foi: %.2f",valor);
		}else if (quantidade >12) {
			valor = quantidade * 100;
			System.out.printf("valor da compra foi: %.2f",valor);			
		}	
		
	}

}
