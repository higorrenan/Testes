package exerciciosarray;

import java.util.Scanner;

public class TrocaDeElemento {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[]v = new int[20];
		
		for(int i=0; i <v.length;i++) {
			System.out.println("informe um numero: ");
			v [i] = entrada.nextInt();
		}
		inverter(v);
		mostra(v);
		entrada.close();
	}

	private static void mostra(int[] v) {
		for(int x: v) {
		System.out.print(x+" ");
		}
	}

	private static void inverter(int[] v) {
		int i,f;
		i = 0;
		f = v.length -1;
		
		while(i < f) {
			trocar(v, i ,f);
			i++; f--;
		}
	}

	private static void trocar(int[] v, int i, int f) {
		int aux = v[i];
		v [i] = v[f];
		v [f] = aux;
	}
}
