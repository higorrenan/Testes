package exerciciofixaçao1;

public class Distancia {
	public static void main(String[] args) {
		
		double x1 = 1.0 , x2 = 7.0;
		double y1 = 9.0 , y2 = 9.0;
		double distancia = 0;
		
		distancia = Math.sqrt(Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1),2));
		System.out.printf("%.4f",distancia);
	}
}
