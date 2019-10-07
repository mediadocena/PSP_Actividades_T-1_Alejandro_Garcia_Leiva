package Ej_4;

import java.io.File;
import java.io.IOException;

public class CrearArchivo {
	public static void main(String[]args) throws IOException {
		File directorio = new File(".\\bin");
		ProcessBuilder pb = new ProcessBuilder("java", "Ej_4.Lectura");
		pb.directory(directorio);
		//instanciamos los archivos
		File fBat = new File("entrada.bat");
		File fOut = new File("salida.txt");
		File fErr = new File("error.txt");
		//hacemos las redirecciones a los archivos
		pb.redirectInput(fBat);
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
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
