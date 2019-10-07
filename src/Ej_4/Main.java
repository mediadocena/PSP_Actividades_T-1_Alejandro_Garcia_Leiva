/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_4;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author aleja
 */
public class Main {
	public static void main(String[]args) throws IOException {

		File directorio = new File(".\\bin");
		//Creamos el proceso:
		ProcessBuilder pb = new ProcessBuilder("java", "Ej_4.Lectura");
		pb.directory(directorio);
		
		//se ejecuta el proceso
		Process p = pb.start();
		
		//Escribimos en consola la cadena y recuperamos los bytes:
		OutputStream os = p.getOutputStream();
		os.write("Jacinto\n".getBytes());
		os.flush();
		
		//Imprimimos el resultado:
		InputStream is=p.getInputStream();
		int c;
		while((c=is.read())!=-1)
			System.out.print((char)c);
		is.close();
		
		//Comprobamos (1 mal, 0 bien)
		int exitVal;
		try {
			exitVal=p.waitFor();
			System.out.println("Valor de salida: "+exitVal);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
