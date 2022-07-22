package estruturasdeloop;

public class SomaImparesEPares {
		public static void main(String[] args) {
			int par = 0;
			int impar = 0;
			for(int i = 100; i< 1500 ; i++) {
			
				if(i%2==1) {
				impar = i + i;	
				System.out.println("soma impares:"+impar);	
				}
						
				}
			for(int c=100; c<1500;c++) {
			if(c%2==0) {
			par++;
			}
			}				
			System.out.println("São pares:"+par);
			}		
}

