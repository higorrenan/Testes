package exerciciofixacao2;

import java.util.Scanner;

public class DiscagemTelefonica {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a =61 , b =71, c = 11, d = 21, e = 32, f =19, g = 27, h = 31;
		
		System.out.println("Disque o DDD da sua cidade: ");
		int DDD = entrada.nextInt();
		if(DDD == a) {
			System.out.println("basilia");
		}else if(DDD == b) {
			System.out.println("Salvador");
		}else if (DDD == c) {
			System.out.println("São Paulo");
		}else if (DDD == d) {
			System.out.println("Rio de Janeiro");
		}else if (DDD == e) {
			System.out.println("Juiz de Fora");
		}else if(DDD == f) {
			System.out.println("Campinas");
		}else if(DDD == g) {
			System.out.println("Vitoria");
		}else if (DDD ==h) {
			System.out.println("Belo Horizonto");
		}else {
			System.out.println("DDD não encontrado");
		}
		
		entrada.close();
	}
}
