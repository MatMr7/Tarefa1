package poo;

public class Circulo implements AreaCalculavel{
	
	private double raio ;
	private final double  pi = 3.14159;
	
	
	public Circulo(double valor) {
		this.raio = valor;
	}
	

	
	public double calculaArea() {
		return (pi*(Math.pow(raio,2)));
	}
	
	
	
}
