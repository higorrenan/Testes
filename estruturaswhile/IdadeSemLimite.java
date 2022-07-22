package estruturaswhile;

import java.util.Scanner;

public class IdadeSemLimite {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = 0;
		int quantidade = 0 , media= 0;
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		if (idade != 0) {
			
			while (idade != -1) {
				quantidade++;				
				idade = idade + quantidade;
				media = idade / quantidade;	
				
				System.out.println("Digite uma idade");
				idade = sc.nextInt();
				}
			}
			System.out.println(media);
			System.out.println(quantidade);
		}	
		
		
		
		
	}


