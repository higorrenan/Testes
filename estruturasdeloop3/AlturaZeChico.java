package estruturasdeloop3;

public class AlturaZeChico {
	public static void main(String[] args) {
		
		double i = 0;
		int chicho = 150;
		int ze = 110;
		int quantze = 0;
		int soma = 0;
		
		for(i = 110 ; i<= 150; i++) {
		if(ze < chicho) {
			soma = ze + 3;
			quantze++;
		}
		}
		System.out.println("Esse é o tempo que zé levaria: "+quantze+ "anos");		
	}
}
