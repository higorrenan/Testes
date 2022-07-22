package exerciciofixaçao1;

import java.util.Scanner;

public class SegundoEmHoras {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int horas = 0;
		System.out.println("Infome quantos segundos: ");
		int totalSegundo = entrada.nextInt();
		
		horas = totalSegundo/3600;
		totalSegundo = totalSegundo % 3600;
		
		int minuto = totalSegundo / 60;
		totalSegundo = totalSegundo % 60;
		
		int segundo = totalSegundo;
		
		System.out.println(horas+":"+minuto+":"+segundo);
		
		entrada.close();
	}
}
