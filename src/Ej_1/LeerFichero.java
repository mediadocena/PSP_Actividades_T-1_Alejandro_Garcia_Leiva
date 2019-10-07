/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_1;

import java.io.IOException;

/**
 *
 * @author aleja
 */
public class LeerFichero {
    
    public static void main(String[]args){
    	//Imprimimos los argumentos:
        System.out.println(args[0]);
        //Controlamos si esta vacío:
        if(args.length==0){
            System.exit(-1);
        }else{
            System.exit(0);
        }
    }
    
}
