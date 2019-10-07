package Ej_4;

import java.io.File;
import java.io.IOException;

public class CrearArchivo {
	public static void main(String[]args) throws IOException {
		File directorio = new File(".\\bin");
		//Creamos el proceso
		ProcessBuilder pb = new ProcessBuilder("java", "Ej_4.Lectura");
		pb.directory(directorio);
		
		//Creamos los archivos:
		
		File fBat = new File("entrada.bat");
		File fOut = new File("salida.txt");
		File fErr = new File("error.txt");
		
		//Redireccionamos los archivos:
		
		pb.redirectInput(fBat);
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		//Iniciamos el proceso:
		Process p = pb.start();
		
		//Comprobamos errores(1 mal, 0 bien)
		int exitVal;
		try {
			exitVal=p.waitFor();
			System.out.println("Valor de salida: "+exitVal);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
