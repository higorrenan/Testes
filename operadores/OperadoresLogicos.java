package operadores;

public class OperadoresLogicos {
	public static void main(String[] args) {
		
		Boolean condicao1 = true;
		Boolean condicao2 = 10<3;
		
		System.out.println(condicao1 & condicao2);// false
		System.out.println(!condicao1 & !condicao2);//false
		System.out.println(condicao1 & !condicao2);//true
		System.out.println(condicao1 || !condicao2);//true
		System.out.println(condicao1 ^ !condicao2);//false
		System.out.println(condicao1 || condicao2);//true
		System.out.println(!condicao1 ^ !condicao2);//true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
