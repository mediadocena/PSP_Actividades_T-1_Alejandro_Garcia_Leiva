/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_3;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author aleja
 */
public class Main {
    
    public static void main(String [] args) throws IOException{
    File directorio = new File(".\\bin");
    //Construimos el proceso:
    ProcessBuilder pb = new ProcessBuilder("java","Ej_3.Suma");
    pb.directory(directorio);
    
    System.out.printf("Directorio de trabajo: %s%n",pb.directory());
    Process p = pb.start();
    OutputStream os = p.getOutputStream();
    //Escribimos en el terminal los argumentos para realizar la suma ( 5 + 2 ) y recuperamos los bytes:
    os.write("\n5\n2\n".getBytes());
    os.flush();
    int exitv;
    //Controlamos las exepciones y imprimimos la salida:
    try{
        InputStream is = p.getInputStream();
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
