package poo;

public class Main {
	
	public static void main(String [] args) {
	
	AreaCalculavel [] figuras = new AreaCalculavel[4];
	figuras[0] = new Quadrado(2);
	figuras[1] = new Retangulo(2,7);
	figuras[2] = new Circulo(9);
	figuras[3] = new Retangulo(5,95);
	
	for (int i =0;i<figuras.length;i++) {
		double a = figuras[i].calculaArea();
		System.out.printf("%.2f\n",a);
		
	}
	
	
	}

}
