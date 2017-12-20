package com.cip.prog;

import java.util.Scanner;

public class GradosCel {

	public static void main(String[] args) {
		
		/// Vamos a crear un programa que calcule
		//el paso de los grados ºF a ºC
		
		//Usamos el comando Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos por pantalla el nº de grados ºF
		System.out.println("Introdusca los ºF: ");
		float F = sc.nextFloat();
		//defino con float los nºs de la division para que el programa los reconosca
		
		float n1= 9;
		float n2 = 5;
		
		//la formula es C=(F-32)*5/9
		
		float C= (F-32)*(n2/n1);
		
		System.out.println("Los grados ºF son: "+C);
	}

}
