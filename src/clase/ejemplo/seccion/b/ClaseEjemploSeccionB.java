/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.ejemplo.seccion.b;

import java.util.Scanner;

/**
 *package es para indicar que el archivo pertenece al paquete clase ejemplo seccion b. 
 * @author Jhonathan Sn
 */
public class ClaseEjemploSeccionB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int radio;
       double diametro, perimetro, area;
       Scanner scan = new Scanner(System.in);
       
//traduccion de la linea 2
       System.out.println("ingrese el valor del radio");
       radio = scan.nextInt();
       
       //traducccion linea 3
       diametro = 2 * radio;
               
       // traduccion de la linea 4
       perimetro = 2 * Math.PI * radio;
       
       //traduccion de la linea 5
       
       area = Math.PI * Math.pow(radio, 2);
       
       //traduccion de la linea 6
       
       System.out.printf("Diametro: %s \nPerimetro: %s \nArea: %s \n", diametro, perimetro, area);
    }
    
}
