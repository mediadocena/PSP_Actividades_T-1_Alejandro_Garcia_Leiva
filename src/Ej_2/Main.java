/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author aleja
 */
public class Main {
    
    public static void main(String [] args) throws IOException{
    File directorio = new File(".\\bin");
  //Creamos el proceso y pasamos el parámetro:
    ProcessBuilder pb = new ProcessBuilder("java","Ej_2.LeerFichero","Jacinto");
    System.out.printf("Directorio de trabajo: %s%n",pb.directory());
    pb.directory(directorio);
        
    Process p = pb.start();
    int exitv;	
    //Controlamos exepciones y escribimos en consola la salida:
    try{
    	//Recuperamos el error:
        InputStream is = p.getErrorStream();
        int c;
        while((c=is.read())!=-1)
            System.out.print((char) c);
            is.close();
        exitv=p.waitFor();
    }catch(Exception e){
        e.printStackTrace();
            }
    }
    
}
