package com.cip.prog;

import java.util.Scanner;

public class GradosCel {

	public static void main(String[] args) {
		
		/// Vamos a crear un programa que calcule
		//el paso de los grados �F a �C
		
		//Usamos el comando Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos por pantalla el n� de grados �F
		System.out.println("Introdusca los �F: ");
		float F = sc.nextFloat();
		//defino con float los n�s de la division para que el programa los reconosca
		
		float n1= 9;
		float n2 = 5;
		
		//la formula es C=(F-32)*5/9
		
		float C= (F-32)*(n2/n1);
		
		System.out.println("Los grados �F son: "+C);
	}

}
