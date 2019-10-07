package Ej_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iniciamos variables y objetos:
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (in);
		String texto;
		//Controlamos excepciones y leemos el texto:
		try {
			System.out.println("Introduce una cadena....");
			texto = br.readLine();
			System.out.println("Cadena escrita: " + texto);
			//Cerramos el streamReader
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
}
}
