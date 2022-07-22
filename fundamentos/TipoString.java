package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("ola boa noite");
		String s = "Boa tarde";
				
		System.out.println(s + "!");
		System.out.println(s.toUpperCase());
		System.out.println(s.equalsIgnoreCase("oi"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		
		var nome = "pedro";
		var sobrenome = "augusto";
		var idade = 29;
		var salario = 1000.00;
		
		System.out.printf("O senhor %s %s tem %d anos e recebe R$%.2f",nome , sobrenome, idade , salario);
	}

}
