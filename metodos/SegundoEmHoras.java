package metodos;

import java.util.Scanner;

public class SegundoEmHoras {

	static int horas (int x) {
		int horas = x/3600;
		int totalSegundo = x % 3600;
		
		int minuto = totalSegundo / 60;
		totalSegundo = totalSegundo % 60;
		
		int segundo = totalSegundo;		
		
		int dia = 20;
		
		System.out.println(horas +":" +minuto+":"+ segundo);
		return dia;
	
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("informe a duração em segundos: ");
		int duracao = entrada.nextInt();
		
		System.out.println(horas(duracao));
		
		entrada.close();
	}
}
