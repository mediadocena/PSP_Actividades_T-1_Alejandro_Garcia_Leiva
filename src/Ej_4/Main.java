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
		ProcessBuilder pb = new ProcessBuilder("java", "Ej_4.Lectura");
		pb.directory(directorio);
		
		//se ejecuta el proceso
		Process p = pb.start();
		
		//escritura - se envia la entrada
		OutputStream os = p.getOutputStream();
		os.write("Jacinto\n".getBytes());
		os.flush();
		
		//lectura -- obtiene la salida de DATE
		InputStream is=p.getInputStream();
		int c;
		while((c=is.read())!=-1)
			System.out.print((char)c);
		is.close();
		
		//COMPROBACION DE ERROR - 0 bien - 1 mal
		int exitVal;
		try {
			exitVal=p.waitFor();
			System.out.println("Valor de salida: "+exitVal);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
