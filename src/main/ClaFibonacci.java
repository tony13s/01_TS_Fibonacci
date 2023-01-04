package main;

import java.util.Scanner;

public class ClaFibonacci {
	
	public static void main(String[] args) {
		//Se usa para leer cualquier dato que ingrese el usuario.
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=1;
		int c=0;
		int n;
		System.out.print("¡Hola!¡Bienvenido! Introduzca la cantidad de sucesiones que desee imprimir: ");
		//Aquí atrapamos lo que el usuario ingresó, y le especificaciones que tipo de dato esperamos, en este caso un entero nextInt()
		n = sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		c=a+b;		
		//Aquí podemos observar que se asigna la variable al siguiente número para cumplir con al sucesión de Fibonacci.
		for (int i = 0; i < n; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
