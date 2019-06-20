package poo;

public class Retangulo implements AreaCalculavel {
	
	private double lado;
	private double altura;
	
	public Retangulo(double lado, double altura) {
		this.lado = lado;
		this.altura = altura;
		
	}

	public double calculaArea() {
		return (lado*altura);
	}

}
