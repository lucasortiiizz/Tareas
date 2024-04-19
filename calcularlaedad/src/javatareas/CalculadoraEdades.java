package javatareas;

import java.util.Scanner;

/**
* Lucas Ortiz
 */

public class CalculadoraEdades {
    private int edades[];

    public CalculadoraEdades(int[] edades) {
        this.edades = edades;
    }
    public double CalculadoraPromedioMayoresEdades (){
        int sumaMayores=0;
        int cantidadMayores=0;
        for(int edad:edades){
            if (17<edad){
                sumaMayores=edad+sumaMayores;
                cantidadMayores++;
            }
        }
        return sumaMayores/cantidadMayores;
        
    } 
        public double CalculadoraPromedioMenoresEdades (){
        int sumaMenores=0;
        int cantidadMenores=0;
        for(int edad:edades){
            if (edad<17){
                sumaMenores=edad+sumaMenores;
                cantidadMenores++;
            }
        }
        return sumaMenores/cantidadMenores;
        }
    
    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         System.out.print("Ingrese la cantidad de personas: ");
         int can=sc.nextInt();
         int[] edades = new int[can];
        for (int i = 0; i <can; i++) {
            System.out.print("Ingrese su edad: ");
            edades[i]=sc.nextInt();
        }
        CalculadoraEdades calculadora = new CalculadoraEdades(edades);
 

        System.out.println("Promedio de edades de mayores de edad: " + calculadora.CalculadoraPromedioMayoresEdades());
        System.out.println("Promedio de edades de menores de edad: " + calculadora.CalculadoraPromedioMenoresEdades());
        sc.close();
    }
}