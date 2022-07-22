package estruturasdeloop;

import java.util.Scanner;

public class MediaIdadeAltura {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		double mediaidade,mediaaltura = 0;
		int acumuladoridade = 0;
		double acumuladoraltura =0;
		double altura=0;
		int idade =0;
		int quantaltura = 0;
		int quantidade = 0;
		
		for (i = 1; i<=45; i++) {
			System.out.println("Informe a idade do aluno: ");
			idade = sc.nextInt();
			System.out.println("Informe a altura do aluno: ");
			altura = sc.nextDouble();
			System.out.println("---------------------------");
			
			if(altura<1.70) {
				acumuladoraltura += altura;
				quantaltura++;
			}
			
			if(idade> 20 ) {
				acumuladoridade += idade;
				quantidade++;
			}
			
		}
			
		mediaaltura = acumuladoraltura/ quantaltura;
		mediaidade = acumuladoridade / quantidade;
			System.out.println("media de idade de alunos com mais de 20 anos: "+mediaidade);
			System.out.println("media de altura de alunos com menos de 1,70: "+ mediaaltura);
			
		
		sc.close();
		
		
	}

}
