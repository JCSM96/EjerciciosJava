package Ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr=new Scanner(System.in);
		
		System.out.println("Insertame un numero: ");
		int num1=scr.nextInt();
		
		System.out.println("Insertame otro numero: ");
		int num2=scr.nextInt();
		int result=num1/num2;
		if (result%2==0) {
			System.out.println("La division entre "+num1+" y "+num2+" es par");
		} else {
			System.out.println("La division entre "+num1+" y "+num2+" es impar");
		}
	}

}
