package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crear un programa en Java que realice lo siguiente:
Debe solicitar al usuario 10 números por consola y almacenarlos en un array.
Debe pasar los números que sean primos a las primeras posiciones, desplazando los demás números al final, 
de tal forma que no se pierda ningún número.
Debe mostrar por consola el array original, mostrando el índice seguido del valor de la posición.
Debe mostrar por consola el array que contiene los números primos al principio, mostrando el índice seguido del valor de la posición. 
El orden de los números no importa, siempre y cuando los números primos vayan al principio del array.
		 */

		Scanner scanner = new Scanner (System.in);
		
		int[] numbers = new int[10];
		int[] prime = new int [10];
		int primeIndex = 0;
		int regularIndex = 9;
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese el número " + (i + 1) + ": ");
			numbers [i] = scanner.nextInt();
	
			
		}
		
		System.out.println("Array original: ");
		for (int i = 0; i < 10; i++) {
		System.out.print( i + " - " + numbers[i]);
		System.out.println();
		}
		
		//Verificar si es un número primo

		for (int i = 0; i < 10; i++) {
			if(isPrime(numbers[i])) {
				prime[primeIndex] = numbers[i];
				primeIndex++;
			}else {
				prime[regularIndex] = numbers[i];
				regularIndex--;
			}
		}
		
			
			System.out.println("Nuevo array: ");
			for(int i = 0; i < 10; i++) {
			System.out.print( i + " - " + prime[i]);
			System.out.println();
			}
		}
	
		public static boolean isPrime(int num) {
			if (num <=1) {
				return false;
			}
			for (int i =2; i <= Math.sqrt(num); i++) {
				if ( num % i == 0) {
					return false;
				}
			}
			return true;
		}
}
