package estruturarepeticao;

public class Area {
	public static void main(String[] args) {
		
		double a = 9.0;
		double b = 7.0;
		double c = 3.2;
		
		double areaTriangulo = (a * c)/2;
		double areaRaio = Math.PI * Math.pow(c, 2);
		double areaTrapezio = ((a + b)/2) * c;
		double areaQuadrado = b * b;
		double areaRetangulo = b * a ;
		
		System.out.printf("Triangulo: %.3f\n",areaTriangulo);
		System.out.printf("Raio: %.3f\n",areaRaio);
		System.out.printf("Trapezio: %.3f\n",areaTrapezio);
		System.out.printf("Quadrado: %.3f\n",areaQuadrado);
		System.out.printf("Retangulo: %.3f",areaRetangulo);
	}
}
