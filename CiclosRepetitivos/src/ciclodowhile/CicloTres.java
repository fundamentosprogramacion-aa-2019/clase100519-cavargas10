/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclodowhile;

import java.util.Scanner;

/**
 *
 * @author cavargas10
 */
public class CicloTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); 
        
        String cadena = "";
        String nombres = "";
        String apellidos = "";
        int edad = 0;
        int sumaEdades = 0;
        double promedioEdades = 0;
        boolean bandera = true;
        int contador = 0;
        String valorUsuario = "";
        
        cadena = String.format("%s%s\n", cadena, 
                "Listado de Personas Ingresadas: ");
        
        do{ 
            
            contador = contador + 1;
            
            System.out.printf("Ingrese sus nombres: ");
            nombres = entrada.nextLine();
            System.out.printf("Ingrese sus apellidos: ");
            apellidos = entrada.nextLine();
            System.out.printf("Ingrese su edad: ");
            edad = entrada.nextInt();
            
            cadena = String.format("%s %s %s edad %d", cadena, 
                    nombres, apellidos, edad);
            
            sumaEdades = sumaEdades + edad;
            
            entrada.nextLine(); //limpiar el buffer
            
            System.out.println("Desea salir ingrese 'n' ");
            valorUsuario = entrada.nextLine();
            
            if (valorUsuario.equals("n")){
                bandera = false;
            }
                
        }while (bandera == true) ;
        
        promedioEdades = (double)sumaEdades/contador;
        cadena = String.format("%sPromedio de edades: %.2f\n", 
                cadena, promedioEdades);
        System.out.printf("%s", cadena);
        
    }
        
 }
    
    

