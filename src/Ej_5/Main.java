package Ej_5;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Creamos variables y objetos:
		File directorio = new File(".\\bin");
		ProcessBuilder pb = new ProcessBuilder("java", "Ej_5.Lectura");
		pb.directory(directorio);
		
		//Ejecutamos el proceso
		Process p = pb.start();
		
		//Escritura
		//Enviamos la entrada la entrada
		OutputStream os = p.getOutputStream();
		os.write("Hola Manuel\n".getBytes());
		os.flush();
		
		//Leemos 
		//y obtenemos la salida
		InputStream is=p.getInputStream();
		int c;
		while((c=is.read())!=-1)
			System.out.print((char)c);
		is.close();
		
		//ERROR (1 mal, 0 bien)
		int exitVal;
		try {
			exitVal=p.waitFor();
			System.out.println("Valor de salida: "+exitVal);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
