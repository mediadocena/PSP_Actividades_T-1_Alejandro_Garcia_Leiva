package Ej_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lectura {
	public static void main(String[]args) {
		//Creamos variables y objetos:
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (in);
		String texto;
		//Introducimos la cadena y controlamos las exepciones:
		try {
			System.out.println("Introduce una cadena....");
			texto = br.readLine();
			System.out.println("Cadena escrita: " + texto);
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
}
}

