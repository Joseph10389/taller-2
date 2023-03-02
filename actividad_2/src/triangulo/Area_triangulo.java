package triangulo;

import java.util.Scanner;

public class Area_triangulo {
	
	public void calcularTriangulo() {
		
		Scanner entrada = new Scanner (System.in);
		double base, altura, area;
		System.out.println("ingrese la base: \n");
		base=entrada.nextDouble();
		System.out.println("ingrese la altura: \n");
		altura=entrada.nextDouble();
		area=base*altura/2;
		System.out.println("la superficie del triangulo es: "+area);
	}

}
