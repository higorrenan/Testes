package exerciciofixacao2;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Laboratoria2 {

    public static void main(String[] args) throws IOException  {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        int Quantia, total = 0, totalCoelho = 0, totalRato = 0, totalSapo = 0;
        char Tipo;
        System.out.println("Informe o numero de teste: ");
        int N = entrada.nextInt();
        for(int c = 0; c < N; c++){
        	System.out.println("Digite o numero de cobaias: ");
            Quantia = entrada.nextInt();
            Tipo = (char)System.in.read();
            total += Quantia;
            if(Tipo == 'C'){
                totalCoelho += Quantia;
            }else if(Tipo == 'R'){
                totalRato += Quantia;
            }else if(Tipo == 'S'){
                totalSapo += Quantia;
            }
        }
        double percentualCoelho = (double)100 * totalCoelho / total;
        double percentualRato = (double)100 * totalRato /total;
        double percentualSapo = (double)100 * totalSapo/total;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelho);
        System.out.println("Total de ratos: " + totalRato);
        System.out.println("Total de sapos: " + totalSapo);
        System.out.printf("Percentual de coelhos: %.2f", percentualCoelho);
        System.out.print(" %\n");
        System.out.printf("Percentual de ratos: %.2f", percentualRato);
        System.out.print(" %\n");
        System.out.printf("Percentual de sapos: %.2f", percentualSapo);
        System.out.print(" %\n");
    }
}
	