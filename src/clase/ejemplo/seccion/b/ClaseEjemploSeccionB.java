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
    public static void main(String[] args) {//la clase main que se ejecuta en el programa.
        int Opcion,Opcion2,Opcion3,Opcion4,Opcion5,Opcion6,Opcion7,Opcion8,Opcion9,Opcion10;//utilicé estas variables de tipo entero para la seleccion de cada menú.
        double Precio;//para el calculo de los precios
        Scanner Tec=new Scanner(System.in);//Utilicé esta libreria para la clase Scanener para guardar las opciones digitadas.
        do{
            System.out.println("---CONSESIONARIA DE AUTOS---" +// El System.out.println para mostrar los mensajes en pantalla
                    "\n MENU PRINCIPAL" +
                    "\n1-Seleccionar automóvil" +
                    "\n2-Salir");
            Opcion=Tec.nextInt();// esta linea es para guardar la opcion seleccionada
            switch (Opcion){//el switch me funcion para la selleccion de lo que tenemos en el menú.
                
                case 1: {//Utilicé los casos que pueden ejecutarse para cada opcion que se puede seleccionar en este caso es la opcion de seleccionar automovil
                      System.out.println("----CONCESIONARIO DE AUTOS" +
                    "\n---SELECCION DE GAMA DE VHEICULO" +
                    "\n1-Sedan economico   US$.18,940" +
                    "\n2-Sedan US$.23,570 " +
                    "\n3-deportivo  US$.24,100" +
                    "\n4-hibrido US$.25,100" +
                    "\n5-coupe US$.19,350" +
                    "\n6-coupe deportivo US$.24,100" +
                    "\n7-compacto  US$.16,190" +
                    "\n8-hatchback  US$.20,150" +
                    "\n9-economico verision rally  US$.34,700" +
                    "\n10-regrear al menu principal" +
                    "\n2-Salir");
                    Opcion2= Tec.nextInt();
                    switch (Opcion2){
                        case 1:{//utilicé casos anidados para tener opciones dentro de las mismas ocpoines.
                        System.out.println("CONSESIONARIO DE AUTOS" + 
                    "\n-SELECCION DE GAMA DE VEHICULO"  +
                                "\nHa seleccionado la gama: Sedan economico" +
                                "\n1" +
                                "\nDesea agregar amenidades:" +
                             "\n1-Si" +
                             "\n2-No"); 
                        Opcion3= Tec.nextInt();
                        if(Opcion3==1){//tambien utlicé el if y el else para seleccionar opciones.
                        System.out.println("Ha seleccionado la gama: Sedan economico" +
                    "\n " +
                    "\n---TIPOS DE AMENIDADES:" +
                    "\n " +
                    "\n1-Tipo de transmision" +
                    "\n2-color de pintura " +
                    "\n3-Aros" +
                    "\n4-Accesorios exteriores" +
                    "\n5-Accesorios interiores" +
                    "\n6-Accesorios electronicos" +
                    "\n" +
                     "\n " +
                     "\nIngrese el tipo de amenidad: ");
                     Opcion4= Tec.nextInt();
                              if(Opcion4==1){//if anidad dentro de las opciones
                             
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE TRANSMISION:" +
                    "\n Tipos de tranmision" +
                    "\n1-manual           0.0000" +
                    "\n2-CVT              800." +
                    "\n3-Manual con turbo 0.000" +
                    "\n4-CVT con turbo    800." +
                    "\n-////////////////////////////////////////////////////////" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion5= Tec.nextInt();
                                           
                                           if(Opcion5==1){//otra opcion del if anidada.
                                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n-Manual                                     US$.0.000 " +
                    "\n-Total                                      US$.18,940" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");

                                           }else{//el else lo utlicé en todas las opciones que tengo para que me muestre una opcion y en caso de ser una distinta, me muestre otra.
                                          if(Opcion5==2){
                                          System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n-CVT                                         US$.800.00 " +
                    "\n-Total                                      US$.19,740" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                                          
                                          }else{
                                              
                                              if(Opcion5==3){//if anidadas para seleccion dentro de los menus y submenus.
                                              
                                 System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n-Manual con turbo                           US$.00.00 " +
                    "\n-Total                                      US$.18,940" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                                              
                                              }else{
                                              if(Opcion==4){//if anidadas para seleccion dentro de los menus y submenus.
                                              
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n-" +
                    "\n-CVT con turbo                                   800." +
                    "\n-Total                                      US$.19,740" +
                    "\n////////////////////////////////////////////////////////");    
                                                  
                                               }
                                              
                                              }
                                            }
                                           
                                           }
                                               
                                               
                              }else{
                              if(Opcion4==2){//if anidadas para seleccion dentro de los menus y submenus.
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE COLOR DE PINTURA:" +
                    "\n Tipos de pintura:" +
                    "\n1-Cosmic Blue        0.00" +
                    "\n2-brugundy           0.00" +
                    "\n3-reallye            0.00" +
                    "\n4-crustal            0.00" +
                    "\n5-Modern             0.00" +
                    "\n6-taffeta while      0.00" +
                    "\n7-energu green       0.00" +
                    "\n8-kona coffe         0.00" +
                    "\n9-Orange fury        0.00" +
                    "\n10-Helios yellow     0.00" +
                    "\n11-sonic gray        0.00" +
                    "\n12-polished          0.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion6= Tec.nextInt();
                     
                     if(Opcion6==1){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n--Cosmic Blue                                     0.00 " +
                    "\n-Total                                      US$.18,940" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==2){//if anidadas para seleccion dentro de los menus y submenus.
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n-brugundy                                        0.00 " +
                    "\n-Total                                        US$.18,940" +
                    "\n-" +  
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==3){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n-reallye                                          0.00 " +
                    "\n-Total                                      US$.18,940" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==4){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n-crustal                                          0.00 " +
                    "\n-Total                                       US$.18,940" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==5){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n-Modern                                          0.00 " +
                    "\n-Total                                       US$.18,940" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==6){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n-taffeta while                                   0.00 " +
                    "\n-Total                                       US$.18,940" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     }else{
                     if(Opcion6==7){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n-energu green                                     0.00 " +
                    "\n-Total                                       US$.18,940" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==8){//if anidadas para seleccion dentro de los menus y submenus.
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n-kona coffe                                       0.00 " +
                    "\n-Total                                       US$.18,940" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==9){//if anidadas para seleccion dentro de los menus y submenus.
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n-Orange fury                                       0.00 " +
                    "\n-Total                                       US$.18,940" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==10){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n-Helios yellow                                       0.00 " +
                    "\n-Total                                       US$.18,940" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==11){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n-sonic gray                                       0.00 " +
                    "\n-Total                                         US$.18,940" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==12){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES:" +
                    "\n-polished                                          0.00 " +
                    "\n-Total                                         US$.18,940" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     
                              }
                              else{
                              if(Opcion4==3){//if anidadas para seleccion dentro de los menus y submenus.
                    System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE AROS:" +
                    "\n Tipos de aros" +
                    "\n1-15¨       0.000" +
                    "\n2-16¨       0.000" +
                    "\n3-17¨       1688.00" +
                    "\n4-18¨       1700.00" +
                    "\n5-19¨       3011.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de aro: ");
                     Opcion7= Tec.nextInt();
                     if(Opcion7==1){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Aros" +
                    "\n-15¨                                               0.00 " +
                    "\n-Total                                         US$.18,940" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     
                     }else{
                     if(Opcion7==2){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Aros" +
                    "\n-16¨                                               0.00 " +
                    "\n-Total                                         US$.18,940" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==3){//if anidadas para seleccion dentro de los menus y submenus.
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Aros" +
                    "\n-17¨                                              1688 " +
                    "\n-Total                                         US$.20628" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==4){//if anidadas para seleccion dentro de los menus y submenus.
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Aros" +
                    "\n-18¨                                              1700 " +
                    "\n-Total                                         US$.20640" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");   
                     }else{
                     if(Opcion7==5){//if anidadas para seleccion dentro de los menus y submenus.
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Aros" +
                    "\n-19¨                                              3011 " +
                    "\n-Total                                         US$.21951" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                     }
                     }
                     }
                     }
                    }
                    
                              }else{
                              if(Opcion4==4){//if anidadas para seleccion dentro de los menus y submenus.
                             System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS EXTERIORES:" +
                    "\n Tipos de Accesorios exteriores:" +
                    "\n1-Body side          217.00" +
                    "\n2-car cover          230.00" +
                    "\n3-declind spoiler    299.99" +
                    "\n4-door edge          42.00" +
                    "\n5-door edge guards   84.00" +
                    "\n6-door trim          285.00" +
                    "\n7-door visor         185.00" +
                    "\n8-front feder        50.00" +
                    "\n9-rear bumper        70.00" +
                    "\n10-fog ligths        325.00" +
                    "\n11-nose masccs       158.00" +
                    "\n12-moonrof visor     138.00" +
                    "\n13-splassh           104.00" +
                    "\n14-dust                 350.00" +
                    "\n15-door mirror cover    520.00" +
                    
                     "\n " +
                     "\nIngrese el tipo de accesorio exterior: "); 
                     Opcion8= Tec.nextInt();
                     if(Opcion8==1){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-Body side                                       217.00 " +
                    "\n-Total                                         US$.19157" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==2){//if anidadas para seleccion dentro de los menus y submenus.
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-car cover                                        230.00"  +
                    "\n-Total                                         US$.19170" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==3){//if anidadas para seleccion dentro de los menus y submenus.
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-declind spoiler                                 299.99"  +
                    "\n-Total                                         US$.12939.99" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==4){//if anidadas para seleccion dentro de los menus y submenus.
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge                                        42.00"  +
                    "\n-Total                                         US$.18982" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==5){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge guards                                84.00     "  +
                    "\n-Total                                         US$.19024" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==6){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door trim                                      285.00"  +
                    "\n-Total                                         US$.19190" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==7){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door visor                                         185.00"  +
                    "\n-Total                                         US$.19090" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==8){//if anidadas para seleccion dentro de los menus y submenus.
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.18990" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{//if anidadas para seleccion dentro de los menus y submenus.
                     if(Opcion8==9){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.18990" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{//if anidadas para seleccion dentro de los menus y submenus.
                     if(Opcion8==10){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-fog ligths                                       325.00"  +
                    "\n-Total                                          US$.19265" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{//if anidadas para seleccion dentro de los menus y submenus.
                      if(Opcion8==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-nose masccs                                      158.00"  +
                    "\n-Total                                          US$.19098" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{//if anidadas para seleccion dentro de los menus y submenus.
                      if(Opcion8==12){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-moonrof visor                                     138.00"  +
                    "\n-Total                                          US$.19078" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{//if anidadas para seleccion dentro de los menus y submenus.
                      if(Opcion8==13){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-splassh                                           104.00"  +
                    "\n-Total                                          US$.19044" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{//if anidadas para seleccion dentro de los menus y submenus.
                      if(Opcion8==14){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door mirror cover                                520.00"  +
                    "\n-Total                                          US$.19460" +
                    "\n-" +
                    "\n___________________________________________________________");    
                      }
                      }
                      }
                      }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                   
                              }else{
                            if(Opcion4==5){ //if anidadas para seleccion dentro de los menus y submenus.
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS INTERIORES:" +
                    "\n Tipos de accesorios interiores:" +
                    "\n1-all-seansons        142.00" +
                    "\n2-automatic dim       219.00" +
                    "\n3-cargo hook          12.00" +
                    "\n4-cargo net           49.00" +
                    "\n5-console ilum        250.00" +
                    "\n6-cargo organizer     87.00" +
                    "\n7-door panel          149.00" +
                    "\n8-armrest             337.00" +
                    "\n9-door sill           290.00" +
                    "\n10-cargo cover        166.00" +
                    "\n11-cargo liner        87.00" +
                    "\n-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio Interior: ");
                     Opcion9= Tec.nextInt();
                     if(Opcion9==1){//if anidadas para seleccion dentro de los menus y submenus.
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-all-seansons                                      142.00"  +
                    "\n-Total                                          US$.19082" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==2){//if anidadas para seleccion dentro de los menus y submenus.
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo hook                                       12.00 "  +
                    "\n-Total                                           US$.19159" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==3){//if anidadas para seleccion dentro de los menus y submenus.
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.19159" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){//if anidadas para seleccion dentro de los menus y submenus.
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.19159" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){//if anidadas para seleccion dentro de los menus y submenus.
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo net                                         49.00 "  +
                    "\n-Total                                         US$.19989" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==5){//if anidadas para seleccion dentro de los menus y submenus.
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-console ilum                                     250.00 "  +
                    "\n-Total                                          US$.19190" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==6){//if anidadas para seleccion dentro de los menus y submenus.
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo organizer                                  87.00 "  +
                    "\n-Total                                          US$.19027" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==7){//if anidadas para seleccion dentro de los menus y submenus.
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door panel                                        149.00 "  +
                    "\n-Total                                          US$.19089" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==8){//if anidadas para seleccion dentro de los menus y submenus.
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-armrest                                         337.00 "  +
                    "\n-Total                                          US$.19277" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==9){//if anidadas para seleccion dentro de los menus y submenus.
                                System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door sill                                       290.00 "  +
                    "\n-Total                                          US$.19230" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==10){//if anidadas para seleccion dentro de los menus y submenus.
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo cover                                      166.00"  +
                    "\n-Total                                          US$.19106" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==11){//if anidadas para seleccion dentro de los menus y submenus.
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo liner                                        87.00"  +
                    "\n-Total                                          US$.19027" +
                    "\n-" +
                    "\n-############################################");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                            }else{ 
                            if(Opcion4==6){//if anidadas para seleccion dentro de los menus y submenus.
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE ACCESORIOS ELECTRONICOS:" +
                    "\n Tipos de accesorios electronicos" +
                    "\n1-wirelless phone       0.000" +
                    "\n2-USB charger         0.000" +
                    "\n3-Puddle ligth       1688.00" +
                    "\n4-Parking ligth       1700.00" +
                    "\n5-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio electronico: ");
                     Opcion10= Tec.nextInt();
                     if(Opcion10==1){//if anidadas para seleccion dentro de los menus y submenus.
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-wirelless phone                                   0.000"  +
                    "\n-Total                                          US$.18940" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==2){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-USB charger                                       0.000"  +
                    "\n-Total                                          US$.18940" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Puddle ligth                                     1688.00"  +
                    "\n-Total                                          US$.20628" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                      if(Opcion10==4){//if anidadas para seleccion dentro de los menus y submenus.
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.18,940:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Parking ligth                                   1700.00"  +
                    "\n-Total                                          US$.20640" +
                    "\n-" +
                    "\n-############################################");
                      }
                     }
                     }
                     }
                            }
                            } 
                              }
                              
                              }
                      
                              }
                             }
                        }else{
                          if(Opcion3==2){//if anidadas para seleccion dentro de los menus y submenus.
                           System.out.println("---CONSESIONARIO DE AUTOS" + 
                    "\n-VENTAS DE VEHICULOS " +
                     "\n " +
                    "\nGama seleccionada: Sedan economico   US$.18,940 " +
                    "\n " +
                    "\n1-Amenidades: Ninguna" +
                    "\n2-Total                              US$.18,940 ");
                          }
                        }
                           }
                         
                        case 2:{//el codigo de aqui en adelante se repite, peron con opciones de sumas distinas, y la suma de sus precio, corrpondiente s a cada amenidad.
                             System.out.println("CONSESIONARIO DE AUTOS" + 
                    "\n-SELECCION DE GAMA DE VEHICULO"  +
                                "\nHa seleccionado la gama: Sedan 23570" +
                                "\n1" +
                                "\nDesea agregar amenidades:" +
                             "\n1-Si" +
                             "\n2-No"); 
                        Opcion3= Tec.nextInt();
                        if(Opcion3==1){
                        System.out.println("Ha seleccionado la gama: Sedan " +
                    "\n " +
                    "\n---TIPOS DE AMENIDADES:" +
                    "\n " +
                    "\n1-Tipo de transmision" +
                    "\n2-color de pintura " +
                    "\n3-Aros" +
                    "\n4-Accesorios exteriores" +
                    "\n5-Accesorios interiores" +
                    "\n6-Accesorios electronicos" +
                    "\n" +
                     "\n " +
                     "\nIngrese el tipo de amenidad: ");
                     Opcion4= Tec.nextInt();
                              if(Opcion4==1){//if anidadas para seleccion dentro de los menus y submenus.
                             
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE TRANSMISION:" +
                    "\n Tipos de tranmision" +
                    "\n1-manual           0.0000" +
                    "\n2-CVT              800." +
                    "\n3-Manual con turbo 0.000" +
                    "\n4-CVT con turbo    800." +
                    "\n-////////////////////////////////////////////////////////" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion5= Tec.nextInt();//if anidadas para seleccion dentro de los menus y submenus.
                                           
                                           if(Opcion5==1){
                                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n-Manual                                     US$.0.000 " +
                    "\n-Total                                      US$.23570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");

                                           }else{
                                          if(Opcion5==2){
                                          System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n-CVT                                         US$.800.00 " +
                    "\n-Total                                      US$.24370" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                                          
                                          }else{
                                              
                                              if(Opcion5==3){
                                              
                                 System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n-Manual con turbo                           US$.00.00 " +
                    "\n-Total                                      US$.23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                                              
                                              }else{
                                              if(Opcion==4){
                                              
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n-" +
                    "\n-CVT con turbo                                   800." +
                    "\n-Total                                      US$.24370" +
                    "\n////////////////////////////////////////////////////////");    
                                                  
                                               }
                                              
                                              }
                                            }
                                           
                                           }
                                               
                                               
                              }else{
                              if(Opcion4==2){//if anidadas para seleccion dentro de los menus y submenus.
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE COLOR DE PINTURA:" +
                    "\n Tipos de pintura:" +
                    "\n1-Cosmic Blue        0.00" +
                    "\n2-brugundy           0.00" +
                    "\n3-reallye            0.00" +
                    "\n4-crustal            0.00" +
                    "\n5-Modern             0.00" +
                    "\n6-taffeta while      0.00" +
                    "\n7-energu green       0.00" +
                    "\n8-kona coffe         0.00" +
                    "\n9-Orange fury        0.00" +
                    "\n10-Helios yellow     0.00" +
                    "\n11-sonic gray        0.00" +
                    "\n12-polished          0.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion6= Tec.nextInt();
                     
                     if(Opcion6==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN  US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n--Cosmic Blue                                     0.00 " +
                    "\n-Total                                      US$.23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN  US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n-brugundy                                        0.00 " +
                    "\n-Total                                        US$.23,570" +
                    "\n-" +  
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==3){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN  US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n-reallye                                          0.00 " +
                    "\n-Total                                      US$23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==4){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN  US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n-crustal                                          0.00 " +
                    "\n-Total                                       US$.23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN  US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n-Modern                                          0.00 " +
                    "\n-Total                                       US$.23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN  US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n-taffeta while                                   0.00 " +
                    "\n-Total                                       US$.23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     }else{
                     if(Opcion6==7){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN  US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n-energu green                                     0.00 " +
                    "\n-Total                                       US$.23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN  US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n-kona coffe                                       0.00 " +
                    "\n-Total                                       US$.23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==9){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN  US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n-Orange fury                                       0.00 " +
                    "\n-Total                                       US$.23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==10){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN  US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n-Helios yellow                                       0.00 " +
                    "\n-Total                                       US$.23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==11){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN  US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n-sonic gray                                       0.00 " +
                    "\n-Total                                         US$.23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==12){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN  US$.23,570:" +
                    "\n AMENIDADES:" +
                    "\n-polished                                          0.00 " +
                    "\n-Total                                         US$.23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     
                              }
                              else{
                              if(Opcion4==3){
                    System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE AROS:" +
                    "\n Tipos de aros" +
                    "\n1-15¨       0.000" +
                    "\n2-16¨       0.000" +
                    "\n3-17¨       1688.00" +
                    "\n4-18¨       1700.00" +
                    "\n5-19¨       3011.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de aro: ");
                     Opcion7= Tec.nextInt();
                     if(Opcion7==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN             US$.23,570:" +
                    "\n AMENIDADES: Aros" +
                    "\n-15¨                                               0.00 " +
                    "\n-Total                                         US$.23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     
                     }else{
                     if(Opcion7==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN  US$.23,570:" +
                    "\n AMENIDADES: Aros" +
                    "\n-16¨                                               0.00 " +
                    "\n-Total                                         US$.23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN            US$.23,570:" +
                    "\n AMENIDADES: Aros" +
                    "\n-17¨                                              1688 " +
                    "\n-Total                                         US$.24258" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN               US$.23,570:" +
                    "\n AMENIDADES: Aros" +
                    "\n-18¨                                              1700 " +
                    "\n-Total                                         US$.20640" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");   
                     }else{
                     if(Opcion7==5){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN            US$.23,570:" +
                    "\n AMENIDADES: Aros" +
                    "\n-19¨                                              3011 " +
                    "\n-Total                                         US$.26581" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                     }
                     }
                     }
                     }
                    }
                    
                              }else{
                              if(Opcion4==4){
                             System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS EXTERIORES:" +
                    "\n Tipos de Accesorios exteriores:" +
                    "\n1-Body side          217.00" +
                    "\n2-car cover          230.00" +
                    "\n3-declind spoiler    299.99" +
                    "\n4-door edge          42.00" +
                    "\n5-door edge guards   84.00" +
                    "\n6-door trim          285.00" +
                    "\n7-door visor         185.00" +
                    "\n8-front feder        50.00" +
                    "\n9-rear bumper        70.00" +
                    "\n10-fog ligths        325.00" +
                    "\n11-nose masccs       158.00" +
                    "\n12-moonrof visor     138.00" +
                    "\n13-splassh           104.00" +
                    "\n14-dust                 350.00" +
                    "\n15-door mirror cover    520.00" +
                    
                     "\n " +
                     "\n___________________________________________________________: "); 
                     Opcion8= Tec.nextInt();
                     if(Opcion8==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN             US$.23,570:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-Body side                                       217.00 " +
                    "\n-Total                                         US$.23787" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN              US$.23,570:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-car cover                                        230.00"  +
                    "\n-Total                                         US$.23800" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN             US$.23,570:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-declind spoiler                                 299.99"  +
                    "\n-Total                                         US$.2869.99" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN              US$.23,570:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge                                        42.00"  +
                    "\n-Total                                         US$.23612" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN             US$.23,570:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge guards                                84.00     "  +
                    "\n-Total                                         US$.23654" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN            US$.23,570:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door trim                                      285.00"  +
                    "\n-Total                                         US$.23855" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==7){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN               US$.23,570:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door visor                                         185.00"  +
                    "\n-Total                                         US$.23755" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN             US$.23,570:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.23620" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==9){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN            US$.23,570 :" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.23620" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==10){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN            US$.23,570:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-fog ligths                                       325.00"  +
                    "\n-Total                                          US$.23895" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                      if(Opcion8==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN            US$.23,570:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-nose masccs                                      158.00"  +
                    "\n-Total                                          US$.23728" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==12){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN               US$.18,940:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-moonrof visor                                     138.00"  +
                    "\n-Total                                          US$.23708" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==13){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN             US$.23,570:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-splassh                                           104.00"  +
                    "\n-Total                                          US$.23674" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==14){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN                US$.23,570:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door mirror cover                                520.00"  +
                    "\n-Total                                          US$.24090" +
                    "\n-" +
                    "\n___________________________________________________________");    
                      }
                      }
                      }
                      }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                   
                              }else{
                            if(Opcion4==5){ 
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS INTERIORES:" +
                    "\n Tipos de accesorios interiores:" +
                    "\n1-all-seansons        142.00" +
                    "\n2-automatic dim       219.00" +
                    "\n3-cargo hook          12.00" +
                    "\n4-cargo net           49.00" +
                    "\n5-console ilum        250.00" +
                    "\n6-cargo organizer     87.00" +
                    "\n7-door panel          149.00" +
                    "\n8-armrest             337.00" +
                    "\n9-door sill           290.00" +
                    "\n10-cargo cover        166.00" +
                    "\n11-cargo liner        87.00" +
                    "\n-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio Interior: ");
                     Opcion9= Tec.nextInt();
                     if(Opcion9==1){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN             US$.23,570:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-all-seansons                                      142.00"  +
                    "\n-Total                                          US$.23712" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN            US$.23,570:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo hook                                       12.00 "  +
                    "\n-Total                                           US$.23582" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN              US$.23,570:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.23782" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN              US$.23,570:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.19159" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN            US$.23,570:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo net                                         49.00 "  +
                    "\n-Total                                         US$.23619" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==5){
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN                US$.23,570:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-console ilum                                     250.00 "  +
                    "\n-Total                                          US$.23820" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==6){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN             US$23,570:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo organizer                                  87.00 "  +
                    "\n-Total                                          US$.23657" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==7){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN            US$.23,570:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door panel                                        149.00 "  +
                    "\n-Total                                          US$.23719" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==8){
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN ECONOMICO US$.23,570:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-armrest                                         337.00 "  +
                    "\n-Total                                          US$.23907" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==9){
                                System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN            US$.23,570:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door sill                                       290.00 "  +
                    "\n-Total                                          US$.23860" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==10){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN              US$.23,570:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo cover                                      166.00"  +
                    "\n-Total                                          US$.23860" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN             US$.23,570:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo liner                                        87.00"  +
                    "\n-Total                                          US$.23657" +
                    "\n-" +
                    "\n-############################################");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                            }else{ 
                            if(Opcion4==6){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE ACCESORIOS ELECTRONICOS:" +
                    "\n Tipos de accesorios electronicos" +
                    "\n1-wirelless phone       0.000" +
                    "\n2-USB charger         0.000" +
                    "\n3-Puddle ligth       1688.00" +
                    "\n4-Parking ligth       1700.00" +
                    "\n5-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio electronico: ");
                     Opcion10= Tec.nextInt();
                     if(Opcion10==1){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN             US$.23,570:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-wirelless phone                                   0.000"  +
                    "\n-Total                                          US$.23,570" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN  US$.23,570:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-USB charger                                       0.000"  +
                    "\n-Total                                          US$.23,570" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN            US$.23,570:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Puddle ligth                                     1688.00"  +
                    "\n-Total                                          US$.25258" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                      if(Opcion10==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: SEDAN        US$.23,570:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Parking ligth                                   1700.00"  +
                    "\n-Total                                          US$.25270" +
                    "\n-" +
                    "\n-############################################");
                      }
                     }
                     }
                     }
                            }
                            } 
                              }
                              
                              }
                      
                              }
                             }
                        }else{
                          if(Opcion3==2){
                           System.out.println("---CONSESIONARIO DE AUTOS" + 
                    "\n-VENTAS DE VEHICULOS " +
                     "\n " +
                    "\nGama seleccionada: Sedan             US$.23,570 " +
                    "\n " +
                    "\n1-Amenidades: Ninguna" +
                    "\n2-Total                              US$.23,570 ");
                          }
                        }
                           }
                         
                        case 3:{
                            System.out.println("CONSESIONARIO DE AUTOS" + 
                    "\n-SELECCION DE GAMA DE VEHICULO"  +
                                "\nHa seleccionado la gama: Deportivo US$.24,100  " +
                                "\n1" +
                                "\nDesea agregar amenidades:" +
                             "\n1-Si" +
                             "\n2-No"); 
                        Opcion3= Tec.nextInt();
                        if(Opcion3==1){
                        System.out.println("Ha seleccionado la gama: DEPORTIVO " +
                    "\n " +
                    "\n---TIPOS DE AMENIDADES:" +
                    "\n " +
                    "\n1-Tipo de transmision" +
                    "\n2-color de pintura " +
                    "\n3-Aros" +
                    "\n4-Accesorios exteriores" +
                    "\n5-Accesorios interiores" +
                    "\n6-Accesorios electronicos" +
                    "\n" +
                     "\n " +
                     "\nIngrese el tipo de amenidad: ");
                     Opcion4= Tec.nextInt();
                              if(Opcion4==1){
                             
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE TRANSMISION:" +
                    "\n Tipos de tranmision" +
                    "\n1-manual           0.0000" +
                    "\n2-CVT              800." +
                    "\n3-Manual con turbo 0.000" +
                    "\n4-CVT con turbo    800." +
                    "\n-////////////////////////////////////////////////////////" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion5= Tec.nextInt();
                                           
                                           if(Opcion5==1){
                                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO       US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-Manual                                     US$.0.000 " +
                    "\n-Total                                      US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");

                                           }else{
                                          if(Opcion5==2){
                                          System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-CVT                                         US$.800.00 " +
                    "\n-Total                                      US$.24900" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                                          
                                          }else{
                                              
                                              if(Opcion5==3){
                                              
                                 System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-Manual con turbo                           US$.00.00 " +
                    "\n-Total                                      US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                                              
                                              }else{
                                              if(Opcion==4){//if anidadas para seleccion dentro de los menus y submenus.
                                              
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO       US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-" +
                    "\n-CVT con turbo                                   800." +
                    "\n-Total                                      US$.24900" +
                    "\n////////////////////////////////////////////////////////");    
                                                  
                                               }
                                              
                                              }
                                            }
                                           
                                           }
                                               
                                               
                              }else{
                              if(Opcion4==2){
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE COLOR DE PINTURA:" +
                    "\n Tipos de pintura:" +
                    "\n1-Cosmic Blue        0.00" +
                    "\n2-brugundy           0.00" +
                    "\n3-reallye            0.00" +
                    "\n4-crustal            0.00" +
                    "\n5-Modern             0.00" +
                    "\n6-taffeta while      0.00" +
                    "\n7-energu green       0.00" +
                    "\n8-kona coffe         0.00" +
                    "\n9-Orange fury        0.00" +
                    "\n10-Helios yellow     0.00" +
                    "\n11-sonic gray        0.00" +
                    "\n12-polished          0.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion6= Tec.nextInt();
                     
                     if(Opcion6==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO  US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n--Cosmic Blue                                     0.00 " +
                    "\n-Total                                      US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO      US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-brugundy                                        0.00 " +
                    "\n-Total                                        US$.24,100" +
                    "\n-" +  
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==3){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO     US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-reallye                                          0.00 " +
                    "\n-Total                                      US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==4){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO      US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-crustal                                          0.00 " +
                    "\n-Total                                       US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO       US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-Modern                                          0.00 " +
                    "\n-Total                                       US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-taffeta while                                   0.00 " +
                    "\n-Total                                       US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     }else{
                     if(Opcion6==7){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO       US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-energu green                                     0.00 " +
                    "\n-Total                                       US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO        US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-kona coffe                                       0.00 " +
                    "\n-Total                                       US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==9){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO  US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-Orange fury                                       0.00 " +
                    "\n-Total                                       US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==10){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO      US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-Helios yellow                                       0.00 " +
                    "\n-Total                                       US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==11){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO      US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-sonic gray                                       0.00 " +
                    "\n-Total                                         US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==12){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO       US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-polished                                          0.00 " +
                    "\n-Total                                         US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     
                              }
                              else{
                              if(Opcion4==3){
                    System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE AROS:" +
                    "\n Tipos de aros" +
                    "\n1-15¨       0.000" +
                    "\n2-16¨       0.000" +
                    "\n3-17¨       1688.00" +
                    "\n4-18¨       1700.00" +
                    "\n5-19¨       3011.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de aro: ");
                     Opcion7= Tec.nextInt();
                     if(Opcion7==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO             US$.24,100:" +
                    "\n AMENIDADES: Aros" +
                    "\n-15¨                                               0.00 " +
                    "\n-Total                                              US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     
                     }else{
                     if(Opcion7==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.23,570:" +
                    "\n AMENIDADES: Aros" +
                    "\n-16¨                                               0.00 " +
                    "\n-Total                                         US$.23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO             US$.24,100::" +
                    "\n AMENIDADES: Aros" +
                    "\n-17¨                                              1688 " +
                    "\n-Total                                         US$.25788" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  DEPORTIVO             US$.24,100::" +
                    "\n AMENIDADES: Aros" +
                    "\n-18¨                                              1700 " +
                    "\n-Total                                         US$.25800" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");   
                     }else{
                     if(Opcion7==5){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  DEPORTIVO             US$.24,100::" +
                    "\n AMENIDADES: Aros" +
                    "\n-19¨                                              3011 " +
                    "\n-Total                                         US$.27411" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                     }
                     }
                     }
                     }
                    }
                    
                              }else{
                              if(Opcion4==4){
                             System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS EXTERIORES:" +
                    "\n Tipos de Accesorios exteriores:" +
                    "\n1-Body side          217.00" +
                    "\n2-car cover          230.00" +
                    "\n3-declind spoiler    299.99" +
                    "\n4-door edge          42.00" +
                    "\n5-door edge guards   84.00" +
                    "\n6-door trim          285.00" +
                    "\n7-door visor         185.00" +
                    "\n8-front feder        50.00" +
                    "\n9-rear bumper        70.00" +
                    "\n10-fog ligths        325.00" +
                    "\n11-nose masccs       158.00" +
                    "\n12-moonrof visor     138.00" +
                    "\n13-splassh           104.00" +
                    "\n14-dust                 350.00" +
                    "\n15-door mirror cover    520.00" +
                    
                     "\n " +
                     "\n___________________________________________________________: "); 
                     Opcion8= Tec.nextInt();
                     if(Opcion8==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:DEPORTIVO             US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-Body side                                       217.00 " +
                    "\n-Total                                         US$.24317" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-car cover                                        230.00"  +
                    "\n-Total                                         US$.24330" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-declind spoiler                                 299.99"  +
                    "\n-Total                                         US$.24399.99" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge                                        42.00"  +
                    "\n-Total                                         US$.24142" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge guards                                84.00     "  +
                    "\n-Total                                         US$.24184" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door trim                                      285.00"  +
                    "\n-Total                                         US$.24385" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==7){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door visor                                         185.00"  +
                    "\n-Total                                         US$.24385" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.24150" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==9){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100 :" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.24150" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==10){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-fog ligths                                       325.00"  +
                    "\n-Total                                          US$.24425" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                      if(Opcion8==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-nose masccs                                      158.00"  +
                    "\n-Total                                          US$.24258" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==12){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-moonrof visor                                     138.00"  +
                    "\n-Total                                          US$24238" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==13){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-splassh                                           104.00"  +
                    "\n-Total                                          US$.24204" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==14){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door mirror cover                                520.00"  +
                    "\n-Total                                          US$.24620" +
                    "\n-" +
                    "\n___________________________________________________________");    
                      }
                      }
                      }
                      }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                   
                              }else{
                            if(Opcion4==5){ 
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS INTERIORES:" +
                    "\n Tipos de accesorios interiores:" +
                    "\n1-all-seansons        142.00" +
                    "\n2-automatic dim       219.00" +
                    "\n3-cargo hook          12.00" +
                    "\n4-cargo net           49.00" +
                    "\n5-console ilum        250.00" +
                    "\n6-cargo organizer     87.00" +
                    "\n7-door panel          149.00" +
                    "\n8-armrest             337.00" +
                    "\n9-door sill           290.00" +
                    "\n10-cargo cover        166.00" +
                    "\n11-cargo liner        87.00" +
                    "\n-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio Interior: ");
                     Opcion9= Tec.nextInt();
                     if(Opcion9==1){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-all-seansons                                      142.00"  +
                    "\n-Total                                          US$.24242" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo hook                                       12.00 "  +
                    "\n-Total                                           US$.24112" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.24319" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.24319" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo net                                         49.00 "  +
                    "\n-Total                                         US$.24149" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==5){
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-console ilum                                     250.00 "  +
                    "\n-Total                                          US$.24350" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==6){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo organizer                                  87.00 "  +
                    "\n-Total                                          US$.24187" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==7){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door panel                                        149.00 "  +
                    "\n-Total                                          US$.24249" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==8){
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-armrest                                         337.00 "  +
                    "\n-Total                                          US$.24437" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==9){
                                System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door sill                                       290.00 "  +
                    "\n-Total                                          US$.24390" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==10){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo cover                                      166.00"  +
                    "\n-Total                                          US$.24266" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo liner                                        87.00"  +
                    "\n-Total                                          US$.24187" +
                    "\n-" +
                    "\n-############################################");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                            }else{ 
                            if(Opcion4==6){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE ACCESORIOS ELECTRONICOS:" +
                    "\n Tipos de accesorios electronicos" +
                    "\n1-wirelless phone       0.000" +
                    "\n2-USB charger         0.000" +
                    "\n3-Puddle ligth       1688.00" +
                    "\n4-Parking ligth       1700.00" +
                    "\n5-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio electronico: ");
                     Opcion10= Tec.nextInt();
                     if(Opcion10==1){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-wirelless phone                                   0.000"  +
                    "\n-Total                                          US$.24100" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-USB charger                                       0.000"  +
                    "\n-Total                                          US$.24100" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Puddle ligth                                     1688.00"  +
                    "\n-Total                                          US$.25788" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                      if(Opcion10==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: DEPORTIVO         US$.24,100:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Parking ligth                                   1700.00"  +
                    "\n-Total                                          US$.25800" +
                    "\n-" +
                    "\n-############################################");
                      }
                     }
                     }
                     }
                            }
                            } 
                              }
                              
                              }
                      
                              }
                             }
                        }else{
                          if(Opcion3==2){
                           System.out.println("---CONSESIONARIO DE AUTOS" + 
                    "\n-VENTAS DE VEHICULOS " +
                     "\n " +
                    "\nGama seleccionada: Deportivo             US$.24,100 " +
                    "\n " +
                    "\n1-Amenidades: Ninguna" +
                    "\n2-Total                              US$.24,100 ");
                          }
                        }
                           }
                        case 4:{
                            System.out.println("CONSESIONARIO DE AUTOS" + 
                    "\n-SELECCION DE GAMA DE VEHICULO"  +
                                "\nHa seleccionado la gama: Hibrido      US$.25,100" +
                                "\n1" +
                                "\nDesea agregar amenidades:" +
                             "\n1-Si" +
                             "\n2-No"); 
                        Opcion3= Tec.nextInt();
                        if(Opcion3==1){
                        System.out.println("Ha seleccionado la gama: Hibrido" +
                    "\n " +
                    "\n---TIPOS DE AMENIDADES:" +
                    "\n " +
                    "\n1-Tipo de transmision" +
                    "\n2-color de pintura " +
                    "\n3-Aros" +
                    "\n4-Accesorios exteriores" +
                    "\n5-Accesorios interiores" +
                    "\n6-Accesorios electronicos" +
                    "\n" +
                     "\n " +
                     "\nIngrese el tipo de amenidad: ");
                     Opcion4= Tec.nextInt();
                              if(Opcion4==1){
                             
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE TRANSMISION:" +
                    "\n Tipos de tranmision" +
                    "\n1-manual           0.0000" +
                    "\n2-CVT              800." +
                    "\n3-Manual con turbo 0.000" +
                    "\n4-CVT con turbo    800." +
                    "\n-////////////////////////////////////////////////////////" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion5= Tec.nextInt();
                                           
                                           if(Opcion5==1){
                                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido         US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n-Manual                                     US$.0.000 " +
                    "\n-Total                                      US$.25,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");

                                           }else{
                                          if(Opcion5==2){
                                          System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido      US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n-CVT                                         US$.800.00 " +
                    "\n-Total                                      US$.25900" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                                          
                                          }else{
                                              
                                              if(Opcion5==3){
                                              
                                 System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido      US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n-Manual con turbo                           US$.00.00 " +
                    "\n-Total                                      US$.25,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                                              
                                              }else{
                                              if(Opcion==4){
                                              
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido      US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n-" +
                    "\n-CVT con turbo                                   800." +
                    "\n-Total                                      US$.25100" +
                    "\n////////////////////////////////////////////////////////");    
                                                  
                                               }
                                              
                                              }
                                            }
                                           
                                           }
                                               
                                               
                              }else{
                              if(Opcion4==2){
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE COLOR DE PINTURA:" +
                    "\n Tipos de pintura:" +
                    "\n1-Cosmic Blue        0.00" +
                    "\n2-brugundy           0.00" +
                    "\n3-reallye            0.00" +
                    "\n4-crustal            0.00" +
                    "\n5-Modern             0.00" +
                    "\n6-taffeta while      0.00" +
                    "\n7-energu green       0.00" +
                    "\n8-kona coffe         0.00" +
                    "\n9-Orange fury        0.00" +
                    "\n10-Helios yellow     0.00" +
                    "\n11-sonic gray        0.00" +
                    "\n12-polished          0.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion6= Tec.nextInt();
                     
                     if(Opcion6==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido      US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n--Cosmic Blue                                     0.00 " +
                    "\n-Total                                      US$.25,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido      US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n-brugundy                                        0.00 " +
                    "\n-Total                                        US$.25,100" +
                    "\n-" +  
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==3){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido      US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n-reallye                                          0.00 " +
                    "\n-Total                                      US$.25,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==4){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Hibrido      US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n-crustal                                          0.00 " +
                    "\n-Total                                       US$.25,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido      US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n-Modern                                          0.00 " +
                    "\n-Total                                       US$.25,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Hibrido      US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n-taffeta while                                   0.00 " +
                    "\n-Total                                       US$.25,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     }else{
                     if(Opcion6==7){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido      US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n-energu green                                     0.00 " +
                    "\n-Total                                       US$.25,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido      US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n-kona coffe                                       0.00 " +
                    "\n-Total                                       US$.25,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==9){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido      US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n-Orange fury                                       0.00 " +
                    "\n-Total                                       US$.25,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==10){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido      US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n-Helios yellow                                       0.00 " +
                    "\n-Total                                       US$.25,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==11){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido            US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n-sonic gray                                       0.00 " +
                    "\n-Total                                         US$.25,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==12){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES:" +
                    "\n-polished                                          0.00 " +
                    "\n-Total                                         US$.25,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     
                              }
                              else{
                              if(Opcion4==3){
                    System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE AROS:" +
                    "\n Tipos de aros" +
                    "\n1-15¨       0.000" +
                    "\n2-16¨       0.000" +
                    "\n3-17¨       1688.00" +
                    "\n4-18¨       1700.00" +
                    "\n5-19¨       3011.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de aro: ");
                     Opcion7= Tec.nextInt();
                     if(Opcion7==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100::" +
                    "\n AMENIDADES: Aros" +
                    "\n-15¨                                               0.00 " +
                    "\n-Total                                              US$.25,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     
                     }else{
                     if(Opcion7==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido           US$.25,100::" +
                    "\n AMENIDADES: Aros" +
                    "\n-16¨                                               0.00 " +
                    "\n-Total                                         US$.25,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Aros" +
                    "\n-17¨                                              1688 " +
                    "\n-Total                                         US$.26788" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Aros" +
                    "\n-18¨                                              1700 " +
                    "\n-Total                                         US$.26800" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");   
                     }else{
                     if(Opcion7==5){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Aros" +
                    "\n-19¨                                              3011 " +
                    "\n-Total                                         US$.28411" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                     }
                     }
                     }
                     }
                    }
                    
                              }else{
                              if(Opcion4==4){
                             System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS EXTERIORES:" +
                    "\n Tipos de Accesorios exteriores:" +
                    "\n1-Body side          217.00" +
                    "\n2-car cover          230.00" +
                    "\n3-declind spoiler    299.99" +
                    "\n4-door edge          42.00" +
                    "\n5-door edge guards   84.00" +
                    "\n6-door trim          285.00" +
                    "\n7-door visor         185.00" +
                    "\n8-front feder        50.00" +
                    "\n9-rear bumper        70.00" +
                    "\n10-fog ligths        325.00" +
                    "\n11-nose masccs       158.00" +
                    "\n12-moonrof visor     138.00" +
                    "\n13-splassh           104.00" +
                    "\n14-dust                 350.00" +
                    "\n15-door mirror cover    520.00" +
                    
                     "\n " +
                     "\n___________________________________________________________: "); 
                     Opcion8= Tec.nextInt();
                     if(Opcion8==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-Body side                                       217.00 " +
                    "\n-Total                                         US$.25317" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-car cover                                        230.00"  +
                    "\n-Total                                         US$.25330" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-declind spoiler                                 299.99"  +
                    "\n-Total                                         US$.25399.99" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge                                        42.00"  +
                    "\n-Total                                         US$.25142" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido           US$.25,100" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge guards                                84.00     "  +
                    "\n-Total                                         US$.25184" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door trim                                      285.00"  +
                    "\n-Total                                         US$.25385" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==7){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door visor                                         185.00"  +
                    "\n-Total                                         US$.25385" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.25150" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==9){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100 :" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.25150" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==10){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-fog ligths                                       325.00"  +
                    "\n-Total                                          US$.25425" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                      if(Opcion8==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-nose masccs                                      158.00"  +
                    "\n-Total                                          US$.25258" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==12){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-moonrof visor                                     138.00"  +
                    "\n-Total                                          US$.25238" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==13){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-splassh                                           104.00"  +
                    "\n-Total                                          US$.25204" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==14){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door mirror cover                                520.00"  +
                    "\n-Total                                          US$.25620" +
                    "\n-" +
                    "\n___________________________________________________________");    
                      }
                      }
                      }
                      }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                   
                              }else{
                            if(Opcion4==5){ 
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS INTERIORES:" +
                    "\n Tipos de accesorios interiores:" +
                    "\n1-all-seansons        142.00" +
                    "\n2-automatic dim       219.00" +
                    "\n3-cargo hook          12.00" +
                    "\n4-cargo net           49.00" +
                    "\n5-console ilum        250.00" +
                    "\n6-cargo organizer     87.00" +
                    "\n7-door panel          149.00" +
                    "\n8-armrest             337.00" +
                    "\n9-door sill           290.00" +
                    "\n10-cargo cover        166.00" +
                    "\n11-cargo liner        87.00" +
                    "\n-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio Interior: ");
                     Opcion9= Tec.nextInt();
                     if(Opcion9==1){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-all-seansons                                      142.00"  +
                    "\n-Total                                          US$.25242" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo hook                                       12.00 "  +
                    "\n-Total                                           US$.25112" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.25319" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.25319" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo net                                         49.00 "  +
                    "\n-Total                                         US$.25149" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==5){
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-console ilum                                     250.00 "  +
                    "\n-Total                                          US$.25350" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==6){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo organizer                                  87.00 "  +
                    "\n-Total                                          US$.25187" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==7){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door panel                                        149.00 "  +
                    "\n-Total                                          US$.25249" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==8){
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-armrest                                         337.00 "  +
                    "\n-Total                                          US$.25437" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==9){
                                System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door sill                                       290.00 "  +
                    "\n-Total                                          US$.25390" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==10){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo cover                                      166.00"  +
                    "\n-Total                                          US$.25266" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo liner                                        87.00"  +
                    "\n-Total                                          US$.25187" +
                    "\n-" +
                    "\n-############################################");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                            }else{ 
                            if(Opcion4==6){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE ACCESORIOS ELECTRONICOS:" +
                    "\n Tipos de accesorios electronicos" +
                    "\n1-wirelless phone       0.000" +
                    "\n2-USB charger         0.000" +
                    "\n3-Puddle ligth       1688.00" +
                    "\n4-Parking ligth       1700.00" +
                    "\n5-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio electronico: ");
                     Opcion10= Tec.nextInt();
                     if(Opcion10==1){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-wirelless phone                                   0.000"  +
                    "\n-Total                                          US$.25100" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-USB charger                                       0.000"  +
                    "\n-Total                                          US$.25100" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Puddle ligth                                     1688.00"  +
                    "\n-Total                                          US$.26788" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                      if(Opcion10==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hibrido           US$.25,100:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Parking ligth                                   1700.00"  +
                    "\n-Total                                          US$.26800" +
                    "\n-" +
                    "\n-############################################");
                      }
                     }
                     }
                     }
                            }
                            } 
                              }
                              
                              }
                      
                              }
                             }
                        }else{
                          if(Opcion3==2){
                           System.out.println("---CONSESIONARIO DE AUTOS" + 
                    "\n-VENTAS DE VEHICULOS " +
                     "\n " +
                    "\nGama seleccionada: Hibrido           US$.25,100 " +
                    "\n " +
                    "\n1-Amenidades: Ninguna" +
                    "\n2-Total                              US$.25,100 ");
                          }
                        }
                           }
                        
                        case 5:{
                           System.out.println("CONSESIONARIO DE AUTOS" + 
                    "\n-SELECCION DE GAMA DE VEHICULO"  +
                                "\nHa seleccionado la gama: Coupe   US$.19,350  " +
                                "\n1" +
                                "\nDesea agregar amenidades:" +
                             "\n1-Si" +
                             "\n2-No"); 
                        Opcion3= Tec.nextInt();
                        if(Opcion3==1){
                        System.out.println("Ha seleccionado la gama: COUPE " +
                    "\n " +
                    "\n---TIPOS DE AMENIDADES:" +
                    "\n " +
                    "\n1-Tipo de transmision" +
                    "\n2-color de pintura " +
                    "\n3-Aros" +
                    "\n4-Accesorios exteriores" +
                    "\n5-Accesorios interiores" +
                    "\n6-Accesorios electronicos" +
                    "\n" +
                     "\n " +
                     "\nIngrese el tipo de amenidad: ");
                     Opcion4= Tec.nextInt();
                              if(Opcion4==1){//if anidadas para seleccion dentro de los menus y submenus.
                             
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE TRANSMISION:" +
                    "\n Tipos de tranmision" +
                    "\n1-manual           0.0000" +
                    "\n2-CVT              800." +
                    "\n3-Manual con turbo 0.000" +
                    "\n4-CVT con turbo    800." +
                    "\n-////////////////////////////////////////////////////////" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion5= Tec.nextInt();
                                           
                                           if(Opcion5==1){
                                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe          US$.19,350:" +
                    "\n AMENIDADES:" +
                    "\n-Manual                                     US$.0.000 " +
                    "\n-Total                                      US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");

                                           }else{
                                          if(Opcion5==2){
                                          System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe          US$.19,350::" +
                    "\n AMENIDADES:" +
                    "\n-CVT                                         US$.800.00 " +
                    "\n-Total                                      US$.20050" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                                          
                                          }else{
                                              
                                              if(Opcion5==3){
                                              
                                 System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe          US$.19,350::" +
                    "\n AMENIDADES:" +
                    "\n-Manual con turbo                           US$.00.00 " +
                    "\n-Total                                      US$.19350" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                                              
                                              }else{
                                              if(Opcion==4){
                                              
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe          US$.19,350::" +
                    "\n AMENIDADES:" +
                    "\n-" +
                    "\n-CVT con turbo                                   800." +
                    "\n-Total                                      US$.20050" +
                    "\n////////////////////////////////////////////////////////");    
                                                  
                                               }
                                              
                                              }
                                            }
                                           
                                           }
                                               
                                               
                              }else{
                              if(Opcion4==2){
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE COLOR DE PINTURA:" +
                    "\n Tipos de pintura:" +
                    "\n1-Cosmic Blue        0.00" +
                    "\n2-brugundy           0.00" +
                    "\n3-reallye            0.00" +
                    "\n4-crustal            0.00" +
                    "\n5-Modern             0.00" +
                    "\n6-taffeta while      0.00" +
                    "\n7-energu green       0.00" +
                    "\n8-kona coffe         0.00" +
                    "\n9-Orange fury        0.00" +
                    "\n10-Helios yellow     0.00" +
                    "\n11-sonic gray        0.00" +
                    "\n12-polished          0.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion6= Tec.nextInt();
                     
                     if(Opcion6==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe          US$.19,350::" +
                    "\n AMENIDADES:" +
                    "\n--Cosmic Blue                                     0.00 " +
                    "\n-Total                                      US$.19350" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe          US$.19,350::" +
                    "\n AMENIDADES:" +
                    "\n-brugundy                                        0.00 " +
                    "\n-Total                                        US$.19350" +
                    "\n-" +  
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==3){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe          US$.19,350::" +
                    "\n AMENIDADES:" +
                    "\n-reallye                                          0.00 " +
                    "\n-Total                                      US$.19350" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==4){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe          US$.19,350::" +
                    "\n AMENIDADES:" +
                    "\n-crustal                                          0.00 " +
                    "\n-Total                                       US$.19350" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:   Coupe          US$.19,350::" +
                    "\n AMENIDADES:" +
                    "\n-Modern                                          0.00 " +
                    "\n-Total                                       US$.19350" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe          US$.19,350::" +
                    "\n AMENIDADES:" +
                    "\n-taffeta while                                   0.00 " +
                    "\n-Total                                       US$.19350" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     }else{
                     if(Opcion6==7){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe           US$.19,350::" +
                    "\n AMENIDADES:" +
                    "\n-energu green                                     0.00 " +
                    "\n-Total                                       US$.19350" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe          US$.19,350::" +
                    "\n AMENIDADES:" +
                    "\n-kona coffe                                       0.00 " +
                    "\n-Total                                       US$.19350" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==9){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe          US$.19,350::" +
                    "\n AMENIDADES:" +
                    "\n-Orange fury                                       0.00 " +
                    "\n-Total                                       US$.193500" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==10){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe          US$.19,350::" +
                    "\n AMENIDADES:" +
                    "\n-Helios yellow                                       0.00 " +
                    "\n-Total                                       US$.19350" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==11){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe          US$.19,350::" +
                    "\n AMENIDADES:" +
                    "\n-sonic gray                                       0.00 " +
                    "\n-Total                                         US$.19350" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==12){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe          US$.19,350::" +
                    "\n AMENIDADES:" +
                    "\n-polished                                          0.00 " +
                    "\n-Total                                         US$.19350" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     
                              }
                              else{
                              if(Opcion4==3){
                    System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE AROS:" +
                    "\n Tipos de aros" +
                    "\n1-15¨       0.000" +
                    "\n2-16¨       0.000" +
                    "\n3-17¨       1688.00" +
                    "\n4-18¨       1700.00" +
                    "\n5-19¨       3011.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de aro: ");
                     Opcion7= Tec.nextInt();
                     if(Opcion7==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe          US$.19,350::" +
                    "\n AMENIDADES: Aros" +
                    "\n-15¨                                               0.00 " +
                    "\n-Total                                              US$.19350" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     
                     }else{
                     if(Opcion7==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe          US$.19,350::" +
                    "\n AMENIDADES: Aros" +
                    "\n-16¨                                               0.00 " +
                    "\n-Total                                         US$.19350" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:   Coupe          US$.19,350:" +
                    "\n AMENIDADES: Aros" +
                    "\n-17¨                                              1688 " +
                    "\n-Total                                         US$.21038" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Coupe          US$.19,350:" +
                    "\n AMENIDADES: Aros" +
                    "\n-18¨                                              1700 " +
                    "\n-Total                                         US$.21050" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");   
                     }else{
                     if(Opcion7==5){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Coupe          US$.19,350 :" +
                    "\n AMENIDADES: Aros" +
                    "\n-19¨                                              3011 " +
                    "\n-Total                                         US$.22361" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                     }
                     }
                     }
                     }
                    }
                    
                              }else{
                              if(Opcion4==4){
                             System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS EXTERIORES:" +
                    "\n Tipos de Accesorios exteriores:" +
                    "\n1-Body side          217.00" +
                    "\n2-car cover          230.00" +
                    "\n3-declind spoiler    299.99" +
                    "\n4-door edge          42.00" +
                    "\n5-door edge guards   84.00" +
                    "\n6-door trim          285.00" +
                    "\n7-door visor         185.00" +
                    "\n8-front feder        50.00" +
                    "\n9-rear bumper        70.00" +
                    "\n10-fog ligths        325.00" +
                    "\n11-nose masccs       158.00" +
                    "\n12-moonrof visor     138.00" +
                    "\n13-splassh           104.00" +
                    "\n14-dust                 350.00" +
                    "\n15-door mirror cover    520.00" +
                    
                     "\n " +
                     "\n_Ingrese el tipo de exterior: "); 
                     Opcion8= Tec.nextInt();
                     if(Opcion8==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe          US$.19,350::" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-Body side                                       217.00 " +
                    "\n-Total                                         US$.19567" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe              US$.19,350 :" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-car cover                                        230.00"  +
                    "\n-Total                                         US$.19580" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-declind spoiler                                 299.99"  +
                    "\n-Total                                         US$.19649.99" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge                                        42.00"  +
                    "\n-Total                                         US$.19392" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge guards                                84.00     "  +
                    "\n-Total                                         US$.19434" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door trim                                      285.00"  +
                    "\n-Total                                         US$.19635" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==7){//if anidadas para seleccion dentro de los menus y submenus.
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door visor                                         185.00"  +
                    "\n-Total                                         US$.19535" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.19400" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==9){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350 :" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.19400" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==10){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-fog ligths                                       325.00"  +
                    "\n-Total                                          US$.19675" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                      if(Opcion8==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-nose masccs                                      158.00"  +
                    "\n-Total                                          US$.19478" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==12){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-moonrof visor                                     138.00"  +
                    "\n-Total                                          US$.19458" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==13){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-splassh                                           104.00"  +
                    "\n-Total                                          US$.19454" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==14){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door mirror cover                                520.00"  +
                    "\n-Total                                          US$.19870" +
                    "\n-" +
                    "\n___________________________________________________________");    
                      }
                      }
                      }
                      }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                   
                              }else{
                            if(Opcion4==5){ 
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS INTERIORES:" +
                    "\n Tipos de accesorios interiores:" +
                    "\n1-all-seansons        142.00" +
                    "\n2-automatic dim       219.00" +
                    "\n3-cargo hook          12.00" +
                    "\n4-cargo net           49.00" +
                    "\n5-console ilum        250.00" +
                    "\n6-cargo organizer     87.00" +
                    "\n7-door panel          149.00" +
                    "\n8-armrest             337.00" +
                    "\n9-door sill           290.00" +
                    "\n10-cargo cover        166.00" +
                    "\n11-cargo liner        87.00" +
                    "\n-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio Interior: ");
                     Opcion9= Tec.nextInt();
                     if(Opcion9==1){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-all-seansons                                      142.00"  +
                    "\n-Total                                          US$.19492" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo hook                                       12.00 "  +
                    "\n-Total                                           US$.19362" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.19569" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.19569" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo net                                         49.00 "  +
                    "\n-Total                                         US$.19399" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==5){
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-console ilum                                     250.00 "  +
                    "\n-Total                                          US$.19600" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==6){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo organizer                                  87.00 "  +
                    "\n-Total                                          US$.19437" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==7){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door panel                                        149.00 "  +
                    "\n-Total                                          US$.19499" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==8){
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-armrest                                         337.00 "  +
                    "\n-Total                                          US$.19687" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==9){
                                System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door sill                                       290.00 "  +
                    "\n-Total                                          US$.19640" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==10){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo cover                                      166.00"  +
                    "\n-Total                                          US$.19516" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo liner                                        87.00"  +
                    "\n-Total                                          US$.19537" +
                    "\n-" +
                    "\n-############################################");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                            }else{ 
                            if(Opcion4==6){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE ACCESORIOS ELECTRONICOS:" +
                    "\n Tipos de accesorios electronicos" +
                    "\n1-wirelless phone       0.000" +
                    "\n2-USB charger         0.000" +
                    "\n3-Puddle ligth       1688.00" +
                    "\n4-Parking ligth       1700.00" +
                    "\n5-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio electronico: ");
                     Opcion10= Tec.nextInt();
                     if(Opcion10==1){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-wirelless phone                                   0.000"  +
                    "\n-Total                                          US$.19350" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-USB charger                                       0.000"  +
                    "\n-Total                                          US$.19350" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Puddle ligth                                     1688.00"  +
                    "\n-Total                                          US$.21038" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                      if(Opcion10==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe              US$.19,350:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Parking ligth                                   1700.00"  +
                    "\n-Total                                          US$.21050" +
                    "\n-" +
                    "\n-############################################");
                      }
                     }
                     }
                     }
                            }
                            } 
                              }
                              
                              }
                      
                              }
                             }
                        }else{
                          if(Opcion3==2){
                           System.out.println("---CONSESIONARIO DE AUTOS" + 
                    "\n-VENTAS DE VEHICULOS " +
                     "\n " +
                    "\nGama seleccionada: Coupe              US$.19,350 " +
                    "\n " +
                    "\n1-Amenidades: Ninguna" +
                    "\n2-Total                              US$.19,350");
                          }
                        }
                           }
                        case 6:{
                            System.out.println("CONSESIONARIO DE AUTOS" + 
                    "\n-SELECCION DE GAMA DE VEHICULO"  +
                                "\nHa seleccionado la gama: Coupe Deportivo US$.24,100" +
                                "\n1" +
                                "\nDesea agregar amenidades:" +
                             "\n1-Si" +
                             "\n2-No"); 
                        Opcion3= Tec.nextInt();
                        if(Opcion3==1){
                        System.out.println("Ha seleccionado la gama: COUPE DEPORTIVO " +
                    "\n " +
                    "\n---TIPOS DE AMENIDADES:" +
                    "\n " +
                    "\n1-Tipo de transmision" +
                    "\n2-color de pintura " +
                    "\n3-Aros" +
                    "\n4-Accesorios exteriores" +
                    "\n5-Accesorios interiores" +
                    "\n6-Accesorios electronicos" +
                    "\n" +
                     "\n " +
                     "\nIngrese el tipo de amenidad: ");
                     Opcion4= Tec.nextInt();
                              if(Opcion4==1){
                             
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE TRANSMISION:" +
                    "\n Tipos de tranmision" +
                    "\n1-manual           0.0000" +
                    "\n2-CVT              800." +
                    "\n3-Manual con turbo 0.000" +
                    "\n4-CVT con turbo    800." +
                    "\n-////////////////////////////////////////////////////////" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion5= Tec.nextInt();
                                           
                                           if(Opcion5==1){
                                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-Manual                                     US$.0.000 " +
                    "\n-Total                                      US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");

                                           }else{
                                          if(Opcion5==2){//if anidadas para seleccion dentro de los menus y submenus.
                                          System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-CVT                                         US$.800.00 " +
                    "\n-Total                                      US$.24900" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                                          
                                          }else{
                                              
                                              if(Opcion5==3){
                                              
                                 System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100" +
                    "\n AMENIDADES:" +
                    "\n-Manual con turbo                           US$.00.00 " +
                    "\n-Total                                      US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                                              
                                              }else{
                                              if(Opcion==4){
                                              
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-" +
                    "\n-CVT con turbo                                   800." +
                    "\n-Total                                      US$.24900" +
                    "\n////////////////////////////////////////////////////////");    
                                                  
                                               }
                                              
                                              }
                                            }
                                           
                                           }
                                               
                                               
                              }else{
                              if(Opcion4==2){
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE COLOR DE PINTURA:" +
                    "\n Tipos de pintura:" +
                    "\n1-Cosmic Blue        0.00" +
                    "\n2-brugundy           0.00" +
                    "\n3-reallye            0.00" +
                    "\n4-crustal            0.00" +
                    "\n5-Modern             0.00" +
                    "\n6-taffeta while      0.00" +
                    "\n7-energu green       0.00" +
                    "\n8-kona coffe         0.00" +
                    "\n9-Orange fury        0.00" +
                    "\n10-Helios yellow     0.00" +
                    "\n11-sonic gray        0.00" +
                    "\n12-polished          0.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion6= Tec.nextInt();
                     
                     if(Opcion6==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n--Cosmic Blue                                     0.00 " +
                    "\n-Total                                      US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-brugundy                                        0.00 " +
                    "\n-Total                                        US$.24,100" +
                    "\n-" +  
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==3){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-reallye                                          0.00 " +
                    "\n-Total                                      US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==4){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-crustal                                          0.00 " +
                    "\n-Total                                       US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,1000:" +
                    "\n AMENIDADES:" +
                    "\n-Modern                                          0.00 " +
                    "\n-Total                                       US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-taffeta while                                   0.00 " +
                    "\n-Total                                       US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     }else{
                     if(Opcion6==7){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-energu green                                     0.00 " +
                    "\n-Total                                       US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-kona coffe                                       0.00 " +
                    "\n-Total                                       US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==9){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-Orange fury                                       0.00 " +
                    "\n-Total                                       US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==10){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-Helios yellow                                       0.00 " +
                    "\n-Total                                       US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==11){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-sonic gray                                       0.00 " +
                    "\n-Total                                         US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==12){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES:" +
                    "\n-polished                                          0.00 " +
                    "\n-Total                                         US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     
                              }
                              else{
                              if(Opcion4==3){
                    System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE AROS:" +
                    "\n Tipos de aros" +
                    "\n1-15¨       0.000" +
                    "\n2-16¨       0.000" +
                    "\n3-17¨       1688.00" +
                    "\n4-18¨       1700.00" +
                    "\n5-19¨       3011.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de aro: ");
                     Opcion7= Tec.nextInt();
                     if(Opcion7==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Aros" +
                    "\n-15¨                                               0.00 " +
                    "\n-Total                                              US$.24,100" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     
                     }else{
                     if(Opcion7==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Aros" +
                    "\n-16¨                                               0.00 " +
                    "\n-Total                                         US$.23,570" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100::" +
                    "\n AMENIDADES: Aros" +
                    "\n-17¨                                              1688 " +
                    "\n-Total                                         US$.25788" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Aros" +
                    "\n-18¨                                              1700 " +
                    "\n-Total                                         US$.25800" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");   
                     }else{
                     if(Opcion7==5){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Aros" +
                    "\n-19¨                                              3011 " +
                    "\n-Total                                         US$.27411" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                     }
                     }
                     }
                     }
                    }
                    
                              }else{
                              if(Opcion4==4){
                             System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS EXTERIORES:" +
                    "\n Tipos de Accesorios exteriores:" +
                    "\n1-Body side          217.00" +
                    "\n2-car cover          230.00" +
                    "\n3-declind spoiler    299.99" +
                    "\n4-door edge          42.00" +
                    "\n5-door edge guards   84.00" +
                    "\n6-door trim          285.00" +
                    "\n7-door visor         185.00" +
                    "\n8-front feder        50.00" +
                    "\n9-rear bumper        70.00" +
                    "\n10-fog ligths        325.00" +
                    "\n11-nose masccs       158.00" +
                    "\n12-moonrof visor     138.00" +
                    "\n13-splassh           104.00" +
                    "\n14-dust                 350.00" +
                    "\n15-door mirror cover    520.00" +
                    
                     "\n " +
                     "\nINGRESE EL TIO DE ACCESORIO EXTERIOR: "); 
                     Opcion8= Tec.nextInt();
                     if(Opcion8==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-Body side                                       217.00 " +
                    "\n-Total                                         US$.24317" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-car cover                                        230.00"  +
                    "\n-Total                                         US$.24330" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-declind spoiler                                 299.99"  +
                    "\n-Total                                         US$.24399.99" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge                                        42.00"  +
                    "\n-Total                                         US$.24142" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge guards                                84.00     "  +
                    "\n-Total                                         US$.24184" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door trim                                      285.00"  +
                    "\n-Total                                         US$.24385" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==7){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door visor                                         185.00"  +
                    "\n-Total                                         US$.24385" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.24150" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==9){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100 :" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.24150" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==10){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-fog ligths                                       325.00"  +
                    "\n-Total                                          US$.24425" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                      if(Opcion8==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-nose masccs                                      158.00"  +
                    "\n-Total                                          US$.24258" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==12){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-moonrof visor                                     138.00"  +
                    "\n-Total                                          US$24238" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==13){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-splassh                                           104.00"  +
                    "\n-Total                                          US$.24204" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==14){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door mirror cover                                520.00"  +
                    "\n-Total                                          US$.24620" +
                    "\n-" +
                    "\n___________________________________________________________");    
                      }
                      }
                      }
                      }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                   
                              }else{
                            if(Opcion4==5){ 
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS INTERIORES:" +
                    "\n Tipos de accesorios interiores:" +
                    "\n1-all-seansons        142.00" +
                    "\n2-automatic dim       219.00" +
                    "\n3-cargo hook          12.00" +
                    "\n4-cargo net           49.00" +
                    "\n5-console ilum        250.00" +
                    "\n6-cargo organizer     87.00" +
                    "\n7-door panel          149.00" +
                    "\n8-armrest             337.00" +
                    "\n9-door sill           290.00" +
                    "\n10-cargo cover        166.00" +
                    "\n11-cargo liner        87.00" +
                    "\n-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio Interior: ");
                     Opcion9= Tec.nextInt();
                     if(Opcion9==1){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-all-seansons                                      142.00"  +
                    "\n-Total                                          US$.24242" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo hook                                       12.00 "  +
                    "\n-Total                                           US$.24112" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.24319" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.24319" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo net                                         49.00 "  +
                    "\n-Total                                         US$.24149" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==5){
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-console ilum                                     250.00 "  +
                    "\n-Total                                          US$.24350" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==6){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo organizer                                  87.00 "  +
                    "\n-Total                                          US$.24187" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==7){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door panel                                        149.00 "  +
                    "\n-Total                                          US$.24249" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==8){
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-armrest                                         337.00 "  +
                    "\n-Total                                          US$.24437" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==9){
                                System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door sill                                       290.00 "  +
                    "\n-Total                                          US$.24390" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==10){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo cover                                      166.00"  +
                    "\n-Total                                          US$.24266" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==11){//if anidadas para seleccion dentro de los menus y submenus.
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo liner                                        87.00"  +
                    "\n-Total                                          US$.24187" +
                    "\n-" +
                    "\n-############################################");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                            }else{ 
                            if(Opcion4==6){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE ACCESORIOS ELECTRONICOS:" +
                    "\n Tipos de accesorios electronicos" +
                    "\n1-wirelless phone       0.000" +
                    "\n2-USB charger         0.000" +
                    "\n3-Puddle ligth       1688.00" +
                    "\n4-Parking ligth       1700.00" +
                    "\n5-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio electronico: ");
                     Opcion10= Tec.nextInt();
                     if(Opcion10==1){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-wirelless phone                                   0.000"  +
                    "\n-Total                                          US$.24100" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-USB charger                                       0.000"  +
                    "\n-Total                                          US$.24100" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Puddle ligth                                     1688.00"  +
                    "\n-Total                                          US$.25788" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                      if(Opcion10==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Coupe Deportivo US$.24,100:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Parking ligth                                   1700.00"  +
                    "\n-Total                                          US$.25800" +
                    "\n-" +
                    "\n-############################################");
                      }
                     }
                     }
                     }
                            }
                            } 
                              }
                              
                              }
                      
                              }
                             }
                        }else{
                          if(Opcion3==2){
                           System.out.println("---CONSESIONARIO DE AUTOS" + 
                    "\n-VENTAS DE VEHICULOS " +
                     "\n " +
                    "\nGama seleccionada: Coupe Deportivo US$.24,100 " +
                    "\n " +
                    "\n1-Amenidades: Ninguna" +
                    "\n2-Total                              US$.24,100 ");
                          }
                        }
                           }
                        case 7:{
                            System.out.println("CONSESIONARIO DE AUTOS" + 
                    "\n-SELECCION DE GAMA DE VEHICULO"  +
                                "\nHa seleccionado la gama: COMPACTO US$.16,190  " +
                                "\n1" +
                                "\nDesea agregar amenidades:" +
                             "\n1-Si" +
                             "\n2-No"); 
                        Opcion3= Tec.nextInt();
                        if(Opcion3==1){
                        System.out.println("Ha seleccionado la gama: COMPACTO " +
                    "\n " +
                    "\n---TIPOS DE AMENIDADES:" +
                    "\n " +
                    "\n1-Tipo de transmision" +
                    "\n2-color de pintura " +
                    "\n3-Aros" +
                    "\n4-Accesorios exteriores" +
                    "\n5-Accesorios interiores" +
                    "\n6-Accesorios electronicos" +
                    "\n" +
                     "\n " +
                     "\nIngrese el tipo de amenidad: ");
                     Opcion4= Tec.nextInt();
                              if(Opcion4==1){
                             
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE TRANSMISION:" +
                    "\n Tipos de tranmision" +
                    "\n1-manual           0.0000" +
                    "\n2-CVT              800." +
                    "\n3-Manual con turbo 0.000" +
                    "\n4-CVT con turbo    800." +
                    "\n-////////////////////////////////////////////////////////" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion5= Tec.nextInt();
                                           
                                           if(Opcion5==1){
                                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  COMPACTO US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n-Manual                                     US$.0.000 " +
                    "\n-Total                                      US$.16190" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");

                                           }else{
                                          if(Opcion5==2){
                                          System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  COMPACTO       US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n-CVT                                         US$.800.00 " +
                    "\n-Total                                      US$.16990" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                                          
                                          }else{
                                              
                                              if(Opcion5==3){
                                              
                                 System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n-Manual con turbo                           US$.00.00 " +
                    "\n-Total                                      US$.16190" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                                              
                                              }else{
                                              if(Opcion==4){
                                              
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n-" +
                    "\n-CVT con turbo                                   800." +
                    "\n-Total                                      US$.16990" +
                    "\n////////////////////////////////////////////////////////");    
                                                  
                                               }
                                              
                                              }
                                            }
                                           
                                           }
                                               
                                               
                              }else{
                              if(Opcion4==2){
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE COLOR DE PINTURA:" +
                    "\n Tipos de pintura:" +
                    "\n1-Cosmic Blue        0.00" +
                    "\n2-brugundy           0.00" +
                    "\n3-reallye            0.00" +
                    "\n4-crustal            0.00" +
                    "\n5-Modern             0.00" +
                    "\n6-taffeta while      0.00" +
                    "\n7-energu green       0.00" +
                    "\n8-kona coffe         0.00" +
                    "\n9-Orange fury        0.00" +
                    "\n10-Helios yellow     0.00" +
                    "\n11-sonic gray        0.00" +
                    "\n12-polished          0.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion6= Tec.nextInt();
                     
                     if(Opcion6==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n--Cosmic Blue                                     0.00 " +
                    "\n-Total                                      US$.16190" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:COMPACTO       US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n-brugundy                                        0.00 " +
                    "\n-Total                                        US$.16190" +
                    "\n-" +  
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==3){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n-reallye                                          0.00 " +
                    "\n-Total                                      US$.16190" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==4){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:COMPACTO       US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n-crustal                                          0.00 " +
                    "\n-Total                                       US$.16190" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n-Modern                                          0.00 " +
                    "\n-Total                                       US$.19190" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:COMPACTO       US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n-taffeta while                                   0.00 " +
                    "\n-Total                                       US$.16190" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     }else{
                     if(Opcion6==7){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n-energu green                                     0.00 " +
                    "\n-Total                                       US$.16190" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n-kona coffe                                       0.00 " +
                    "\n-Total                                       US$.16190" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==9){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n-Orange fury                                       0.00 " +
                    "\n-Total                                       US$.16190" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==10){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n-Helios yellow                                       0.00 " +
                    "\n-Total                                       US$.16190" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==11){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n-sonic gray                                       0.00 " +
                    "\n-Total                                         US$.16190" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==12){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES:" +
                    "\n-polished                                          0.00 " +
                    "\n-Total                                         US$.16190" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     
                              }
                              else{
                              if(Opcion4==3){
                    System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE AROS:" +
                    "\n Tipos de aros" +
                    "\n1-15¨       0.000" +
                    "\n2-16¨       0.000" +
                    "\n3-17¨       1688.00" +
                    "\n4-18¨       1700.00" +
                    "\n5-19¨       3011.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de aro: ");
                     Opcion7= Tec.nextInt();
                     if(Opcion7==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Aros" +
                    "\n-15¨                                               0.00 " +
                    "\n-Total                                              US$.16190" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     
                     }else{
                     if(Opcion7==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Aros" +
                    "\n-16¨                                               0.00 " +
                    "\n-Total                                         US$.16190" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO                 US$.16,190       :" +
                    "\n AMENIDADES: Aros" +
                    "\n-17¨                                              1688 " +
                    "\n-Total                                         US$.17878" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  COMPACTO          US$.16,190:" +
                    "\n AMENIDADES: Aros" +
                    "\n-18¨                                              1700 " +
                    "\n-Total                                         US$.17880" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");   
                     }else{
                     if(Opcion7==5){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Aros" +
                    "\n-19¨                                              3011 " +
                    "\n-Total                                         US$.19201" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                     }
                     }
                     }
                     }
                    }
                    
                              }else{
                              if(Opcion4==4){
                             System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS EXTERIORES:" +
                    "\n Tipos de Accesorios exteriores:" +
                    "\n1-Body side          217.00" +
                    "\n2-car cover          230.00" +
                    "\n3-declind spoiler    299.99" +
                    "\n4-door edge          42.00" +
                    "\n5-door edge guards   84.00" +
                    "\n6-door trim          285.00" +
                    "\n7-door visor         185.00" +
                    "\n8-front feder        50.00" +
                    "\n9-rear bumper        70.00" +
                    "\n10-fog ligths        325.00" +
                    "\n11-nose masccs       158.00" +
                    "\n12-moonrof visor     138.00" +
                    "\n13-splassh           104.00" +
                    "\n14-dust                 350.00" +
                    "\n15-door mirror cover    520.00" +
                    
                     "\n " +
                     "\n___________________________________________________________: "); 
                     Opcion8= Tec.nextInt();
                     if(Opcion8==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-Body side                                       217.00 " +
                    "\n-Total                                         US$.160407" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-car cover                                        230.00"  +
                    "\n-Total                                         US$.16420" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-declind spoiler                                 299.99"  +
                    "\n-Total                                         US$.16489.99" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge                                        42.00"  +
                    "\n-Total                                         US$.16232" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge guards                                84.00     "  +
                    "\n-Total                                         US$.16274" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door trim                                      285.00"  +
                    "\n-Total                                         US$.16275" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==7){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door visor                                         185.00"  +
                    "\n-Total                                         US$.16375" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.16210" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==9){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190 :" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.16210" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==10){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-fog ligths                                       325.00"  +
                    "\n-Total                                          US$.16515" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                      if(Opcion8==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-nose masccs                                      158.00"  +
                    "\n-Total                                          US$.16375" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==12){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-moonrof visor                                     138.00"  +
                    "\n-Total                                          US$.16328" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==13){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-splassh                                           104.00"  +
                    "\n-Total                                          US$.16294" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==14){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door mirror cover                                520.00"  +
                    "\n-Total                                          US$.16710" +
                    "\n-" +
                    "\n___________________________________________________________");    
                      }
                      }
                      }
                      }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                   
                              }else{
                            if(Opcion4==5){ 
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS INTERIORES:" +
                    "\n Tipos de accesorios interiores:" +
                    "\n1-all-seansons        142.00" +
                    "\n2-automatic dim       219.00" +
                    "\n3-cargo hook          12.00" +
                    "\n4-cargo net           49.00" +
                    "\n5-console ilum        250.00" +
                    "\n6-cargo organizer     87.00" +
                    "\n7-door panel          149.00" +
                    "\n8-armrest             337.00" +
                    "\n9-door sill           290.00" +
                    "\n10-cargo cover        166.00" +
                    "\n11-cargo liner        87.00" +
                    "\n-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio Interior: ");
                     Opcion9= Tec.nextInt();
                     if(Opcion9==1){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-all-seansons                                      142.00"  +
                    "\n-Total                                          US$.16332" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo hook                                       12.00 "  +
                    "\n-Total                                           US$.16202" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.16409" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.16409" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo net                                         49.00 "  +
                    "\n-Total                                         US$.16239" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==5){
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-console ilum                                     250.00 "  +
                    "\n-Total                                          US$.16440" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==6){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo organizer                                  87.00 "  +
                    "\n-Total                                          US$.16277" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==7){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door panel                                        149.00 "  +
                    "\n-Total                                          US$.16339" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==8){
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-armrest                                         337.00 "  +
                    "\n-Total                                          US$.16527" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==9){
                                System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door sill                                       290.00 "  +
                    "\n-Total                                          US$.16480" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==10){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo cover                                      166.00"  +
                    "\n-Total                                          US$.16356" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo liner                                        87.00"  +
                    "\n-Total                                          US$.16277" +
                    "\n-" +
                    "\n-############################################");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                            }else{ 
                            if(Opcion4==6){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE ACCESORIOS ELECTRONICOS:" +
                    "\n Tipos de accesorios electronicos" +
                    "\n1-wirelless phone       0.000" +
                    "\n2-USB charger         0.000" +
                    "\n3-Puddle ligth       1688.00" +
                    "\n4-Parking ligth       1700.00" +
                    "\n5-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio electronico: ");
                     Opcion10= Tec.nextInt();
                     if(Opcion10==1){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-wirelless phone                                   0.000"  +
                    "\n-Total                                          US$.16190" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-USB charger                                       0.000"  +
                    "\n-Total                                          US$.16190" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Puddle ligth                                     1688.00"  +
                    "\n-Total                                          US$.17888" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                      if(Opcion10==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:COMPACTO       US$.16,190:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Parking ligth                                   1700.00"  +
                    "\n-Total                                          US$.17890" +
                    "\n-" +
                    "\n-############################################");
                      }
                     }
                     }
                     }
                            }
                            } 
                              }
                              
                              }
                      
                              }
                             }
                        }else{
                          if(Opcion3==2){
                           System.out.println("---CONSESIONARIO DE AUTOS" + 
                    "\n-VENTAS DE VEHICULOS " +
                     "\n " +
                    "\nGama seleccionada: COMPACTO            US$.16,190 " +
                    "\n " +
                    "\n1-Amenidades: Ninguna" +
                    "\n2-Total                              US$.16,190 ");
                          }
                        }
                           }
                        case 8:{
                            System.out.println("CONSESIONARIO DE AUTOS" + 
                    "\n-SELECCION DE GAMA DE VEHICULO"  +
                                "\nHa seleccionado la gama: Hatchback   US$.20,150  " +
                                "\n1" +
                                "\nDesea agregar amenidades:" +
                             "\n1-Si" +
                             "\n2-No"); 
                        Opcion3= Tec.nextInt();
                        if(Opcion3==1){//if anidadas para seleccion dentro de los menus y submenus.
                        System.out.println("Ha seleccionado la gama: HATCHBACK " +
                    "\n " +
                    "\n---TIPOS DE AMENIDADES:" +
                    "\n " +
                    "\n1-Tipo de transmision" +
                    "\n2-color de pintura " +
                    "\n3-Aros" +
                    "\n4-Accesorios exteriores" +
                    "\n5-Accesorios interiores" +
                    "\n6-Accesorios electronicos" +
                    "\n" +
                     "\n " +
                     "\nIngrese el tipo de amenidad: ");
                     Opcion4= Tec.nextInt();
                              if(Opcion4==1){
                             
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE TRANSMISION:" +
                    "\n Tipos de tranmision" +
                    "\n1-manual           0.0000" +
                    "\n2-CVT              800." +
                    "\n3-Manual con turbo 0.000" +
                    "\n4-CVT con turbo    800." +
                    "\n-////////////////////////////////////////////////////////" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion5= Tec.nextInt();
                                           
                                           if(Opcion5==1){
                                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback   US$.20,150 :" +
                    "\n AMENIDADES:" +
                    "\n-Manual                                     US$.0.000 " +
                    "\n-Total                                      US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");

                                           }else{
                                          if(Opcion5==2){
                                          System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback   US$.20,150 :" +
                    "\n AMENIDADES:" +
                    "\n-CVT                                         US$.800.00 " +
                    "\n-Total                                      US$.20950" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                                          
                                          }else{
                                              
                                              if(Opcion5==3){
                                              
                                 System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback   US$.20,150 " +
                    "\n AMENIDADES:" +
                    "\n-Manual con turbo                           US$.00.00 " +
                    "\n-Total                                      US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                                              
                                              }else{
                                              if(Opcion==4){
                                              
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback   US$.20,150 :" +
                    "\n AMENIDADES:" +
                    "\n-" +
                    "\n-CVT con turbo                                   800." +
                    "\n-Total                                      US$.20950" +
                    "\n////////////////////////////////////////////////////////");    
                                                  
                                               }
                                              
                                              }
                                            }
                                           
                                           }
                                               
                                               
                              }else{
                              if(Opcion4==2){
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE COLOR DE PINTURA:" +
                    "\n Tipos de pintura:" +
                    "\n1-Cosmic Blue        0.00" +
                    "\n2-brugundy           0.00" +
                    "\n3-reallye            0.00" +
                    "\n4-crustal            0.00" +
                    "\n5-Modern             0.00" +
                    "\n6-taffeta while      0.00" +
                    "\n7-energu green       0.00" +
                    "\n8-kona coffe         0.00" +
                    "\n9-Orange fury        0.00" +
                    "\n10-Helios yellow     0.00" +
                    "\n11-sonic gray        0.00" +
                    "\n12-polished          0.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion6= Tec.nextInt();
                     
                     if(Opcion6==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback   US$.20,150 :" +
                    "\n AMENIDADES:" +
                    "\n--Cosmic Blue                                     0.00 " +
                    "\n-Total                                      US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback   US$.20,150 :" +
                    "\n AMENIDADES:" +
                    "\n-brugundy                                        0.00 " +
                    "\n-Total                                        US$.20150" +
                    "\n-" +  
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==3){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback   US$.20,150 :" +
                    "\n AMENIDADES:" +
                    "\n-reallye                                          0.00 " +
                    "\n-Total                                      US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==4){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback   US$.20,150 :" +
                    "\n AMENIDADES:" +
                    "\n-crustal                                          0.00 " +
                    "\n-Total                                       US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Hatchback   US$.20,150:" +
                    "\n AMENIDADES:" +
                    "\n-Modern                                          0.00 " +
                    "\n-Total                                       US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Hatchback   US$.20,150:" +
                    "\n AMENIDADES:" +
                    "\n-taffeta while                                   0.00 " +
                    "\n-Total                                       US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     }else{
                     if(Opcion6==7){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback   US$.20,150:" +
                    "\n AMENIDADES:" +
                    "\n-energu green                                     0.00 " +
                    "\n-Total                                       US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Hatchback   US$.20,150:" +
                    "\n AMENIDADES:" +
                    "\n-kona coffe                                       0.00 " +
                    "\n-Total                                       US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==9){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback   US$.20,150:" +
                    "\n AMENIDADES:" +
                    "\n-Orange fury                                       0.00 " +
                    "\n-Total                                       US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==10){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback   US$.20,150:" +
                    "\n AMENIDADES:" +
                    "\n-Helios yellow                                       0.00 " +
                    "\n-Total                                       US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==11){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback   US$.20,150:" +
                    "\n AMENIDADES:" +
                    "\n-sonic gray                                       0.00 " +
                    "\n-Total                                         US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==12){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Hatchback   US$.20,150:" +
                    "\n AMENIDADES:" +
                    "\n-polished                                          0.00 " +
                    "\n-Total                                         US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     
                              }
                              else{
                              if(Opcion4==3){//if anidadas para seleccion dentro de los menus y submenus.
                    System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE AROS:" +
                    "\n Tipos de aros" +
                    "\n1-15¨       0.000" +
                    "\n2-16¨       0.000" +
                    "\n3-17¨       1688.00" +
                    "\n4-18¨       1700.00" +
                    "\n5-19¨       3011.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de aro: ");
                     Opcion7= Tec.nextInt();
                     if(Opcion7==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback            US$.20,150:" +
                    "\n AMENIDADES: Aros" +
                    "\n-15¨                                               0.00 " +
                    "\n-Total                                              US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     
                     }else{
                     if(Opcion7==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Hatchback            US$.20,150:" +
                    "\n AMENIDADES: Aros" +
                    "\n-16¨                                               0.00 " +
                    "\n-Total                                         US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Hatchback            US$.20,150:" +
                    "\n AMENIDADES: Aros" +
                    "\n-17¨                                              1688 " +
                    "\n-Total                                         US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Hatchback            US$.20,150:" +
                    "\n AMENIDADES: Aros" +
                    "\n-18¨                                              1700 " +
                    "\n-Total                                         US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");   
                     }else{
                     if(Opcion7==5){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback            US$.20,150:" +
                    "\n AMENIDADES: Aros" +
                    "\n-19¨                                              3011 " +
                    "\n-Total                                         US$.20150" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                     }
                     }
                     }
                     }
                    }
                    
                              }else{
                              if(Opcion4==4){
                             System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS EXTERIORES:" +
                    "\n Tipos de Accesorios exteriores:" +
                    "\n1-Body side          217.00" +
                    "\n2-car cover          230.00" +
                    "\n3-declind spoiler    299.99" +
                    "\n4-door edge          42.00" +
                    "\n5-door edge guards   84.00" +
                    "\n6-door trim          285.00" +
                    "\n7-door visor         185.00" +
                    "\n8-front feder        50.00" +
                    "\n9-rear bumper        70.00" +
                    "\n10-fog ligths        325.00" +
                    "\n11-nose masccs       158.00" +
                    "\n12-moonrof visor     138.00" +
                    "\n13-splassh           104.00" +
                    "\n14-dust                 350.00" +
                    "\n15-door mirror cover    520.00" +
                    
                     "\n " +
                     "\n___________________________________________________________: "); 
                     Opcion8= Tec.nextInt();
                     if(Opcion8==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback            US$.20,150:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-Body side                                       217.00 " +
                    "\n-Total                                         US$.20367" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==2){//if anidadas para seleccion dentro de los menus y submenus.
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback            US$.20,150:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-car cover                                        230.00"  +
                    "\n-Total                                         US$20367" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback            US$.20,150:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-declind spoiler                                 299.99"  +
                    "\n-Total                                         US$.20449.99" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Hatchback            US$.20,150:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge                                        42.00"  +
                    "\n-Total                                         US$.20192" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback            US$.20,150:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge guards                                84.00     "  +
                    "\n-Total                                         US$.20234" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  Hatchback            US$.20,150:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door trim                                      285.00"  +
                    "\n-Total                                         US$.20435" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==7){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback            US$.20,150:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door visor                                         185.00"  +
                    "\n-Total                                         US$.20335" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.20200" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==9){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150 :" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.20200" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==10){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-fog ligths                                       325.00"  +
                    "\n-Total                                          US$.20475" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                      if(Opcion8==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-nose masccs                                      158.00"  +
                    "\n-Total                                          US$.20308" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==12){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-moonrof visor                                     138.00"  +
                    "\n-Total                                          US$.20288" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==13){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-splassh                                           104.00"  +
                    "\n-Total                                          US$.2054" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==14){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door mirror cover                                520.00"  +
                    "\n-Total                                          US$.20670" +
                    "\n-" +
                    "\n___________________________________________________________");    
                      }
                      }
                      }
                      }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                   
                              }else{
                            if(Opcion4==5){ 
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS INTERIORES:" +
                    "\n Tipos de accesorios interiores:" +
                    "\n1-all-seansons        142.00" +
                    "\n2-automatic dim       219.00" +
                    "\n3-cargo hook          12.00" +
                    "\n4-cargo net           49.00" +
                    "\n5-console ilum        250.00" +
                    "\n6-cargo organizer     87.00" +
                    "\n7-door panel          149.00" +
                    "\n8-armrest             337.00" +
                    "\n9-door sill           290.00" +
                    "\n10-cargo cover        166.00" +
                    "\n11-cargo liner        87.00" +
                    "\n-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio Interior: ");
                     Opcion9= Tec.nextInt();
                     if(Opcion9==1){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-all-seansons                                      142.00"  +
                    "\n-Total                                          US$.20292" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo hook                                       12.00 "  +
                    "\n-Total                                           US$.20162" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.20369" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.24369" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){//if anidadas para seleccion dentro de los menus y submenus.
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo net                                         49.00 "  +
                    "\n-Total                                         US$.20199" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==5){
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-console ilum                                     250.00 "  +
                    "\n-Total                                          US$.20400" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==6){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo organizer                                  87.00 "  +
                    "\n-Total                                          US$.20237" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==7){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door panel                                        149.00 "  +
                    "\n-Total                                          US$.20299" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==8){
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-armrest                                         337.00 "  +
                    "\n-Total                                          US$.20487" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==9){
                                System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door sill                                       290.00 "  +
                    "\n-Total                                          US$.20440" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==10){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo cover                                      166.00"  +
                    "\n-Total                                          US$.20316" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo liner                                        87.00"  +
                    "\n-Total                                          US$.20237" +
                    "\n-" +
                    "\n-############################################");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                            }else{ 
                            if(Opcion4==6){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE ACCESORIOS ELECTRONICOS:" +
                    "\n Tipos de accesorios electronicos" +
                    "\n1-wirelless phone       0.000" +
                    "\n2-USB charger         0.000" +
                    "\n3-Puddle ligth       1688.00" +
                    "\n4-Parking ligth       1700.00" +
                    "\n5-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio electronico: ");
                     Opcion10= Tec.nextInt();
                     if(Opcion10==1){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-wirelless phone                                   0.000"  +
                    "\n-Total                                          US$.20150" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-USB charger                                       0.000"  +
                    "\n-Total                                          US$.20150" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Puddle ligth                                     1688.00"  +
                    "\n-Total                                          US$.21838" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                      if(Opcion10==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Hatchback          US$.20,150:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Parking ligth                                   1700.00"  +
                    "\n-Total                                          US$.21840" +
                    "\n-" +
                    "\n-############################################");
                      }
                     }
                     }
                     }
                            }
                            } 
                              }
                              
                              }
                      
                              }
                             }
                        }else{
                          if(Opcion3==2){
                           System.out.println("---CONSESIONARIO DE AUTOS" + 
                    "\n-VENTAS DE VEHICULOS " +
                     "\n " +
                    "\nGama seleccionada: Hatchback          US$.20,150 " +
                    "\n " +
                    "\n1-Amenidades: Ninguna" +
                    "\n2-Total                              US$.20,150 ");
                          }
                        }
                           }
                        case 9:{
                            System.out.println("CONSESIONARIO DE AUTOS" + 
                    "\n-SELECCION DE GAMA DE VEHICULO"  +
                                "\nHa seleccionado la gama: Economico version rally US$.34,700  " +
                                "\n1" +
                                "\nDesea agregar amenidades:" +
                             "\n1-Si" +
                             "\n2-No"); 
                        Opcion3= Tec.nextInt();
                        if(Opcion3==1){
                        System.out.println("Ha seleccionado la gama: ECONOMICO VERSION REALLY " +
                    "\n " +
                    "\n---TIPOS DE AMENIDADES:" +
                    "\n " +
                    "\n1-Tipo de transmision" +
                    "\n2-color de pintura " +
                    "\n3-Aros" +
                    "\n4-Accesorios exteriores" +
                    "\n5-Accesorios interiores" +
                    "\n6-Accesorios electronicos" +
                    "\n" +
                     "\n " +
                     "\nIngrese el tipo de amenidad: ");
                     Opcion4= Tec.nextInt();
                              if(Opcion4==1){
                             
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE TRANSMISION:" +
                    "\n Tipos de tranmision" +
                    "\n1-manual           0.0000" +
                    "\n2-CVT              800." +
                    "\n3-Manual con turbo 0.000" +
                    "\n4-CVT con turbo    800." +
                    "\n-////////////////////////////////////////////////////////" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion5= Tec.nextInt();
                                           
                                           if(Opcion5==1){
                                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: Economico version rally US$.34,700:" +
                    "\n AMENIDADES:" +
                    "\n-Manual                                              US$.0.000 " +
                    "\n-Total                                               US$.34,700" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");

                                           }else{
                                          if(Opcion5==2){
                                          System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES:" +
                    "\n-CVT                                         US$.800.00 " +
                    "\n-Total                                      US$.35500" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                                          
                                          }else{
                                              
                                              if(Opcion5==3){//if anidadas para seleccion dentro de los menus y submenus.
                                              
                                 System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700" +
                    "\n AMENIDADES:" +
                    "\n-Manual con turbo                           US$.00.00 " +
                    "\n-Total                                      US$.34700" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                                              
                                              }else{
                                              if(Opcion==4){
                                              
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES:" +
                    "\n-" +
                    "\n-CVT con turbo                                   800." +
                    "\n-Total                                      US$.35500" +
                    "\n////////////////////////////////////////////////////////");    
                                                  
                                               }
                                              
                                              }
                                            }
                                           
                                           }
                                               
                                               
                              }else{
                              if(Opcion4==2){
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE COLOR DE PINTURA:" +
                    "\n Tipos de pintura:" +
                    "\n1-Cosmic Blue        0.00" +
                    "\n2-brugundy           0.00" +
                    "\n3-reallye            0.00" +
                    "\n4-crustal            0.00" +
                    "\n5-Modern             0.00" +
                    "\n6-taffeta while      0.00" +
                    "\n7-energu green       0.00" +
                    "\n8-kona coffe         0.00" +
                    "\n9-Orange fury        0.00" +
                    "\n10-Helios yellow     0.00" +
                    "\n11-sonic gray        0.00" +
                    "\n12-polished          0.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de transmision: ");
                     Opcion6= Tec.nextInt();
                     
                     if(Opcion6==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES:" +
                    "\n--Cosmic Blue                                     0.00 " +
                    "\n-Total                                      US$.34700" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES:" +
                    "\n-brugundy                                        0.00 " +
                    "\n-Total                                        US$.34700" +
                    "\n-" +  
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==3){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES:" +
                    "\n-reallye                                          0.00 " +
                    "\n-Total                                      US$34700" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==4){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES:" +
                    "\n-crustal                                          0.00 " +
                    "\n-Total                                       US$.34700" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES:" +
                    "\n-Modern                                          0.00 " +
                    "\n-Total                                       US$.34700" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES:" +
                    "\n-taffeta while                                   0.00 " +
                    "\n-Total                                       US$.34700" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     }else{
                     if(Opcion6==7){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES:" +
                    "\n-energu green                                     0.00 " +
                    "\n-Total                                       US$.34700" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES:" +
                    "\n-kona coffe                                       0.00 " +
                    "\n-Total                                       US$.34700" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==9){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES:" +
                    "\n-Orange fury                                       0.00 " +
                    "\n-Total                                       US$.34700" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==10){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES:" +
                    "\n-Helios yellow                                       0.00 " +
                    "\n-Total                                       US$.34700" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==11){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES:" +
                    "\n-sonic gray                                       0.00 " +
                    "\n-Total                                         US$.34700" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion6==12){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES:" +
                    "\n-polished                                          0.00 " +
                    "\n-Total                                         US$.34700" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     
                              }
                              else{
                              if(Opcion4==3){//if anidadas para seleccion dentro de los menus y submenus.
                    System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE AROS:" +
                    "\n Tipos de aros" +
                    "\n1-15¨       0.000" +
                    "\n2-16¨       0.000" +
                    "\n3-17¨       1688.00" +
                    "\n4-18¨       1700.00" +
                    "\n5-19¨       3011.00" +
                    "\n-" +
                     "\n " +
                     "\nIngrese el tipo de aro: ");
                     Opcion7= Tec.nextInt();
                     if(Opcion7==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Aros" +
                    "\n-15¨                                               0.00 " +
                    "\n-Total                                              US$.34700" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     
                     
                     }else{
                     if(Opcion7==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Aros" +
                    "\n-16¨                                               0.00 " +
                    "\n-Total                                         US$.34700" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Aros" +
                    "\n-17¨                                              1688 " +
                    "\n-Total                                         US$.36388" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");
                     }else{
                     if(Opcion7==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Aros" +
                    "\n-18¨                                              1700 " +
                    "\n-Total                                         US$.36390" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////");   
                     }else{
                     if(Opcion7==5){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:  EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Aros" +
                    "\n-19¨                                              3011 " +
                    "\n-Total                                         US$.37711" +
                    "\n-" +
                    "\n////////////////////////////////////////////////////////"); 
                     }
                     }
                     }
                     }
                    }
                    
                              }else{
                              if(Opcion4==4){
                             System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS EXTERIORES:" +
                    "\n Tipos de Accesorios exteriores:" +
                    "\n1-Body side          217.00" +
                    "\n2-car cover          230.00" +
                    "\n3-declind spoiler    299.99" +
                    "\n4-door edge          42.00" +
                    "\n5-door edge guards   84.00" +
                    "\n6-door trim          285.00" +
                    "\n7-door visor         185.00" +
                    "\n8-front feder        50.00" +
                    "\n9-rear bumper        70.00" +
                    "\n10-fog ligths        325.00" +
                    "\n11-nose masccs       158.00" +
                    "\n12-moonrof visor     138.00" +
                    "\n13-splassh           104.00" +
                    "\n14-dust                 350.00" +
                    "\n15-door mirror cover    520.00" +
                    
                     "\n " +
                     "\n_INFESE EL NUMERO DE ACCESORIO EXTERIOR__: "); 
                     Opcion8= Tec.nextInt();
                     if(Opcion8==1){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-Body side                                       217.00 " +
                    "\n-Total                                         US$.34917" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-car cover                                        230.00"  +
                    "\n-Total                                         US$.35000" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==3){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-declind spoiler                                 299.99"  +
                    "\n-Total                                         US$.34999.99" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==4){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge                                        42.00"  +
                    "\n-Total                                         US$.34742" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==5){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door edge guards                                84.00     "  +
                    "\n-Total                                         US$.34874" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==6){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door trim                                      285.00"  +
                    "\n-Total                                         US$.34985" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==7){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door visor                                         185.00"  +
                    "\n-Total                                         US$.34885" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==8){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.34724.50" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==9){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-front feder                                       50.00"  +
                    "\n-Total                                          US$.34750" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                     if(Opcion8==10){//if anidadas para seleccion dentro de los menus y submenus.
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-fog ligths                                       325.00"  +
                    "\n-Total                                          US$.35025" +
                    "\n-" +
                    "\n___________________________________________________________");
                     }else{
                      if(Opcion8==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-nose masccs                                      158.00"  +
                    "\n-Total                                          US$.34858" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==12){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-moonrof visor                                     138.00"  +
                    "\n-Total                                          US$2.34838" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==13){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-splassh                                           104.00"  +
                    "\n-Total                                          US$.34804" +
                    "\n-" +
                    "\n___________________________________________________________");
                      }else{
                      if(Opcion8==14){
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios exteriores" +
                    "\n-door mirror cover                                520.00"  +
                    "\n-Total                                          US$.35220" +
                    "\n-" +
                    "\n___________________________________________________________");    
                      }
                      }
                      }
                      }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                   
                              }else{
                            if(Opcion4==5){ 
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE ACCESORIOS INTERIORES:" +
                    "\n Tipos de accesorios interiores:" +
                    "\n1-all-seansons        142.00" +
                    "\n2-automatic dim       219.00" +
                    "\n3-cargo hook          12.00" +
                    "\n4-cargo net           49.00" +
                    "\n5-console ilum        250.00" +
                    "\n6-cargo organizer     87.00" +
                    "\n7-door panel          149.00" +
                    "\n8-armrest             337.00" +
                    "\n9-door sill           290.00" +
                    "\n10-cargo cover        166.00" +
                    "\n11-cargo liner        87.00" +
                    "\n-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio Interior: ");
                     Opcion9= Tec.nextInt();
                     if(Opcion9==1){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-all-seansons                                      142.00"  +
                    "\n-Total                                          US$.34842" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==2){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo hook                                       12.00 "  +
                    "\n-Total                                           US$.34712" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.34919" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-automatic dim                                     219.00 "  +
                    "\n-Total                                         US$.34919" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==4){
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo net                                         49.00 "  +
                    "\n-Total                                         US$.34749" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==5){
                         System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-console ilum                                     250.00 "  +
                    "\n-Total                                          US$.34950" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==6){
                           System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo organizer                                  87.00 "  +
                    "\n-Total                                          US$.34787" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==7){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door panel                                        149.00 "  +
                    "\n-Total                                          US$.34849" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==8){
                              System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-armrest                                         337.00 "  +
                    "\n-Total                                          US$.35037" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==9){
                                System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-door sill                                       290.00 "  +
                    "\n-Total                                          US$.34990" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==10){//if anidadas para seleccion dentro de los menus y submenus.
                        System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo cover                                      166.00"  +
                    "\n-Total                                          US$.34866" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion9==11){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios interiores" +
                    "\n-cargo liner                                        87.00"  +
                    "\n-Total                                          US$.34787" +
                    "\n-" +
                    "\n-############################################");
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                     }
                            }else{ 
                            if(Opcion4==6){
                            System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--SELECCION DE AMENIDADES " +
                    "\n---SELECCION DE IPO DE ACCESORIOS ELECTRONICOS:" +
                    "\n Tipos de accesorios electronicos" +
                    "\n1-wirelless phone       0.000" +
                    "\n2-USB charger         0.000" +
                    "\n3-Puddle ligth       1688.00" +
                    "\n4-Parking ligth       1700.00" +
                    "\n5-Regresar a la seleccion de gama de Amenidades" +
                     "\n " +
                     "\nIngrese el tipo de accesorio electronico: ");
                     Opcion10= Tec.nextInt();
                     if(Opcion10==1){
                      System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA:EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-wirelless phone                                   0.000"  +
                    "\n-Total                                          US$.34700" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==2){
                     System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-USB charger                                       0.000"  +
                    "\n-Total                                          US$.34700" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                     if(Opcion10==3){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Puddle ligth                                     1688.00"  +
                    "\n-Total                                          US$.36388" +
                    "\n-" +
                    "\n-############################################");
                     }else{
                      if(Opcion10==4){
                       System.out.println("CONSESIONARIO DE AUTOS" +
                    "\n--RESUMEN DE AMENIDADES " +
                    "\n****HA SELECCIONADO LA GAMA: EconomicoV.rally US$.34,700:" +
                    "\n AMENIDADES: Accesorios electronicos" +
                    "\n-Parking ligth                                   1700.00"  +
                    "\n-Total                                          US$.36390" +
                    "\n-" +
                    "\n-############################################");
                      }
                     }
                     }
                     }
                            }
                            } 
                              }
                              
                              }
                      
                              }
                             }
                        }else{
                          if(Opcion3==2){
                           System.out.println("---CONSESIONARIO DE AUTOS" + 
                    "\n-VENTAS DE VEHICULOS " +
                     "\n " +
                    "\nGama seleccionada: EconomicoV.rally US$.34,700 " +
                    "\n " +
                    "\n1-Amenidades: Ninguna" +
                    "\n2-Total                              US$.34,700 ");
                          }
                        }
                           }
                        case 10:{
                           System.out.println("---CONSESIONARIA DE VEHICULOS---" +
                           "\n SELECCIONE DE GAMA DE VEHICULO" +
                           "\n1-Seleccionar automóvil" +
                           "\n2-Salir");
                           Opcion=Tec.nextInt();
                           }
                    
                    }
                      
               }
            }
        }while(Opcion!=12);//el while lo utilice para que me siga mostrando los menus, pero no pude utilizarlo de la manera apropiada, es por eso que en todos me siguió saliendo un menu.
    }
    
}
