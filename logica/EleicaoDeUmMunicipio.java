package logica;

import java.util.Scanner;

public class EleicaoDeUmMunicipio {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Quantos eleitores tem nesse municipio: ");
		double municipio = entrada.nextDouble();
		
		System.out.print("Informe quantos votos foram validos: ");
		double vtvalidos = entrada.nextDouble();
		
		System.out.print("Informe quantos votos foram brancos: ");
		double vtbrancos = entrada.nextDouble();
		
		System.out.print("Informe quantos votos foram nulos: ");
		double vtnulos = entrada.nextDouble();
		
		
		double vttotal = vtvalidos + vtbrancos + vtnulos;
		
		double percentvalidos = (vtvalidos *100)/vttotal;
		double percentbrancos= (vtbrancos *100)/vttotal;
		double percentnulos= (vtnulos*100)/vttotal;
		
		
		
		System.out.println(percentvalidos+"%");
		System.out.println(percentbrancos+"%");
		System.out.println(percentnulos+"%");
		
		
		entrada.close();
	}
		
}
