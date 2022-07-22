package estruturawhile;

import java.util.Scanner;

public class AlturaIdade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		double mediaIdade = 0,mediaAltura = 0;
		int acumuladorIdade = 0;
		double acumuladorAltura =0;
		double altura=0;
		int idade =0;
		int quantAltura = 0;
		int quantIdade = 0;
		
		for(i=1; i <= 3 ; i++) {
			System.out.println("Informe a idade do aluno: ");
			idade = sc.nextInt();
			System.out.println("Informe a altura do aluno: ");
			altura = sc.nextDouble();
			System.out.println("---------------------------");
			
			if(altura<1.70) {
				acumuladorIdade += idade;
				quantAltura++;
			}
			
			if(idade> 20 ) {
				acumuladorAltura += altura;
				quantIdade++;
			}
		}	
		mediaIdade = (acumuladorIdade/ quantAltura);
		mediaAltura = (acumuladorAltura / quantIdade);
			System.out.println("media de idade de alunos com menos de 1,70: "+mediaIdade);
			System.out.println("media de altura de alunos com mais de 20 anos: "+ mediaAltura);		
	}
}
