package metodos;

import java.io.IOException;
import java.util.Scanner;

public class MediaDoAluno {
	static void nota  (double x , double y , double z, char s) {
		double resultado =0;
		if(s == 'A') {
			 resultado = (x + y + z) / 3;
			 System.out.println(resultado);
		}else if(s =='P') {
			resultado = (x * 2 + y * 3  + z * 5)/ 10;
			System.out.println(resultado);
		}else if(s == 'H'){
			resultado = 3/(1/x + 1/y+ 1/z);
			System.out.println(resultado);
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
	char w;
	double nota1 = 0;
	double nota2 = 0;
	double nota3 = 0;
	
	System.out.println("Informa a nota do aluno:");
	nota1 =entrada.nextDouble();
	System.out.println("Informa a nota do aluno:");
	nota2 = entrada.nextDouble();
	System.out.println("Informa a nota do aluno:");
	nota3 = entrada.nextDouble();
	System.out.println("Informe o tipo de procedimento |A|P|H| : ");
	w = (char)System.in.read();
	nota(nota1, nota2, nota3, w);
	
	entrada.close();
	}
}
