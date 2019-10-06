package Ej_3;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		Salieri ex = new Salieri();
		System.out.println("Inserte numero a:");
		int a= ex.controlaentero();
		System.out.println("Inserte numero b:");
		int b = ex.controlaentero();
		System.out.println(a+b);

	}

}
