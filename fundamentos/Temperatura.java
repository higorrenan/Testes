package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		//Fomular temperatura (°F-32) * 5/9= °C
	
			final double DIFERENCIA = 32;
			final double FATOR = 5/9.0;
			
			double farenheit = 70;
			double celsius = (farenheit - DIFERENCIA) * FATOR;
			System.out.println( "A temperatura local hoje é de =" +celsius + "°C" );
			
			farenheit = 150;
			celsius = (farenheit - DIFERENCIA) * FATOR;
			System.out.println( "A temperatura local hoje é de =" +celsius + "°C" );	 
					
			
			
			
	}
	
}
