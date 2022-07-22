package metodos;

import java.util.Scanner;

public class ComandoDeSelecao {
	static void  soma (double x ,int y) {
		double result = (x * y) ;
		System.out.printf("Total: R$%.2f ",result);
	}
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int pedido = 0, numPedido =0, quant =0;
		double custo = 0;
		System.out.println("Menu:|1|-cachorro quente |2|- x-salada |3|- x-bacon"
				+ "|4|- torrada simpels |5|- refigerante ");
		System.out.println("|-1| sair |0| fazer pedido");
		System.out.println("deseja fazer algum pedido ? ");
		pedido = entrada.nextInt();
		if(pedido != -1) {
			System.out.println("Informe o codigo do pedido: ");
			numPedido = entrada.nextInt();
			switch(numPedido) {
				
			case 1:
				System.out.println("Custo do produto: ");
				custo = entrada.nextDouble();
				System.out.println("Digite a quantida do pedido: ");
				quant = entrada.nextInt();
				soma(custo, quant);
			break;
			
			case 2:
				System.out.println("Custo do produto: ");
				custo = entrada.nextDouble();
				System.out.println("Digite a quantida do pedido: ");
				quant = entrada.nextInt();
				soma(custo, quant);
			break;
			case 3:
				System.out.println("Custo do produto: ");
				custo = entrada.nextDouble();
				System.out.println("Digite a quantida do pedido: ");
				quant = entrada.nextInt();
				soma(custo, quant);
			break;
			case 4 :
				System.out.println("Custo do produto: ");
				custo = entrada.nextDouble();
				System.out.println("Digite a quantida do pedido: ");
				quant = entrada.nextInt();
				soma(custo, quant);
			break;
			case 5:
				System.out.println("Custo do produto: ");
			custo = entrada.nextDouble();
			System.out.println("Digite a quantida do pedido: ");
			quant = entrada.nextInt();
			soma(custo, quant);
			break;
			default : 
				System.out.println("Codigo incorreto");
			}	
		}else {
			System.out.println("Volte sempre!");
		}
		entrada.close();
	}
}
