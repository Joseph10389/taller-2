package formulas_matematicas;

import java.util.Scanner;

public class Formulas {
	
	public void formulaA() {
		Scanner entrada=new Scanner(System.in);
		double a=0;
		double x=0;
		System.out.println("ingrese x : \n");
		x=entrada.nextDouble();
		
		double exponente=Math.pow(x, 5);
		x= exponente-6;
		double raiz= Math.sqrt(x);
		a=raiz/4;
		respuesta=a;
		System.out.println("el valor de la formula A es : \n"+a);
	}
	public void formulaB() {
		Scanner entrada=new Scanner(System.in);
		double x=0;
		double z=0;
		double respuesta=0;
		System.out.println("ingres el valor de x de la formula B:\n");
		x=entrada.nextDouble();
		System.out.println("ingrese el valor de z de la formula B: \n");
		z=entrada.nextDouble();
		double exponenteUno=Math.pow(x,z);
		double exponenteDos=Math.pow(6,x);
		respuesta=exponenteUno-exponenteDos;
		System.out.println("el valor d la formula B es: \n"+respuesta);
	}
	public void formulaC() {
		Scanner entrada=new Scanner(System.in);
		double x;
		double y;
		double respuesta=0;
		System.out.println("ingrese el valor de x en la formula C:\n");
		x=entrada.nextDouble();
		System.out.println("ingrese el valor de y en la formula C:\n");
		y=entrada.nextDouble();
		double exponenteA=x/5;
		double exponenteB=Math.cos(exponenteA);
		double exponnteC=(4*exponenteB);
		double exponenteD=Math.sin(y);
		double exponenteE=Math.pow(exponenteD, 2);
		respuesta=exponenteE-exponnteC;
		System.out.println("el valor de la formulaC es: \n");
		
	}
	public void formulaD() {
		Scanner entrada = new Scanner(System.in);
		double respuesta = 0;
		double x = 0;
		double y = 0;
		System.out.print("ingrese el valor de x de la formula D:\n");
		x = entrada.nextInt();
		System.out.print("ingrese el valor de y de la formula D:\n");
		y = entrada.nextInt();
		double exponenteUno=Math.pow(x, 4);
		double exponenteDos=Math.pow(y, 3);
		double exponenteTres=(6 * x - y);
		double exponenteCuatro=Math.sqrt(exponenteTres);
		respuesta=exponenteUno-exponenteCuatro;
        System.out.print("el valor de la formula d es \n"+respuesta);

    }
	public void formulaE() {
		Scanner entrada=new Scanner(System.in);
		double respuesta=0;
		double x=0;
		double y=0;
		System.out.print("ingrese el valor de x de la formula E \n ");
		x=entrada.nextInt();
		System.out.print("ingrese el valor de y de la formula E  \n ");
		y=entrada.nextInt();
		double exponenteUno=Math.pow(2, y);
		double exponenteDos=exponenteUno - x;
		double exponenteTres=(y*exponenteDos + 1);
		double exponenteCuatro=(exponenteDos /exponenteTres);
		respuesta = exponenteCuatro;
		System.out.print("el valor de la formula E es  \n" + respuesta);

	
