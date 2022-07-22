package estruturasdeloop3;

import java.util.Scanner;

public class PercentualDeVezes {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int i = 0;
		int vezes = 0;
		double percentA = 0, percentC = 0, percentB = 0;
		int quantA = 0,quantB =0, quantC =0, quantAlunos = 0;
		
		for(i = 1; i<=10; i++) {
			System.out.println("informe o numero de vezes que foi ao restaurante: ");
			 vezes = sc.nextInt();  
			 quantAlunos++;
			 
			 if(vezes < 10) { 
				 quantA++;
			 }
			 if (vezes >=10 && vezes<15) { 
				 quantB++;
			 }
			 if(vezes >=15) {
				 quantC++;
			 }
		}	
		percentA = (quantA * 100)/quantAlunos;	
		percentB = (quantB * 100)/quantAlunos;	  
		percentC = (quantC * 100)/quantAlunos;
		System.out.println(percentA);
		System.out.println(percentB);
		System.out.println(percentC);
		System.out.println(quantAlunos);
		sc.close();
	}
}
