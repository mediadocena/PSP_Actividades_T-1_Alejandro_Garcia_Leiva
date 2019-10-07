package Ej_5;

import java.io.File;
import java.io.IOException;

public class Proceso {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File directorio = new File(".\\bin");
		ProcessBuilder pb = new ProcessBuilder("java", "Ej_5.Lectura");
		
		pb.directory(directorio);
		
		File fBat = new File("entrada.bat");
		//File fOut = new File("salida.txt");
		File fErr = new File("error.txt");
		
		pb.redirectInput(fBat);
		//pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		//hacemos la redireccion a la consola
		pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
		Process p = pb.start();
		
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
