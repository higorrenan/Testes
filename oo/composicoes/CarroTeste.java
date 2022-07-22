package oo.composicoes;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		Carro c3 = new Carro();
		Carro c2 = new Carro();
		System.out.println(c1.estaLigado());
		
		c2.ligar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.frear();
		System.out.println(c2.motor.giros());		
		
		//Faltou encapsulamento.
		c3.ligar();
		c3.motor.fatorInjecao = -30;
		System.out.println(c3.motor.giros());
		
		c1.ligar();
		c1.acelerar();
		System.out.println(c1.motor.giros());
		
	}
}
