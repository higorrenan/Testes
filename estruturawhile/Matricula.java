package estruturawhile;

import java.util.Scanner;

public class Matricula {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i = 1,alunos =0;
		int matricula = 0, quantAprovado = 0, quantReprovado = 0;
		double media = 0,nota1= 0, nota2 =0, nota3 =0;
		System.out.println("Quantos aulos serão cadrastrado: ");
		 alunos = entrada.nextInt();
		 if(alunos!= 0) {
		for(i =1; i<= alunos; i++) {
			System.out.println("nummero da matricula: ");
			matricula = entrada.nextInt();
			System.out.println("Informe a nota 1: ");
			nota1= entrada.nextDouble();
			System.out.println("Informe a nota 2: ");
			nota2= entrada.nextDouble();
			System.out.println("Informe a nota 3: ");
			nota3= entrada.nextDouble();
			media = ((2 * nota1)+(3 * nota2)+ (4 * nota3))/9;
		if(media >= 5) {
			quantAprovado++;
			System.out.println("matricula: "+matricula+"|media: "+media+
		 			"|Aluno aprovado!!");
		}else if(media<5) {
			quantReprovado++;
			System.out.println("matricula: "+matricula+"|media: "+media+
		 			"|Aluno reprovado!!");
		}
		}	
		}
		 System.out.println("A quantidade de alunos Aprovados foram: " + quantAprovado);
		 System.out.println("A quantidade de alunos reprovados foram: " + quantReprovado);
	}
}
