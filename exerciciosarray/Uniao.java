package exerciciosarray;

import java.util.Arrays;

public class Uniao {

		public static void main(String[] args) {
			
			int []a = {7 , 8 , 9};
			int []b = {9 , 8 , 7};
			int []c= new int[a.length + b.length];
			int k = 0;
			for(int i = 0; i <a.length;i++) {
				c[k++]= a[i];
			}
			
			for(int i = 0; i <b.length;i++) {
				c[k++]= b[i];
			}
			
			System.out.println(Arrays.toString(c));
	}	
}
