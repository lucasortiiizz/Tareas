
package tarea2;

import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
         int buena = 15;
         int normalmin = 16;
         int normalmax = 25;
         int peligroso = 26;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el momento del dia (manana, tarde, noche):");
        String momento = sc.nextLine();

        System.out.println("le recuerdo que buena: es menor a 15, normal es entre 16 y 25, peligroso arriba de los 25");
        
        System.out.println("Ingrese la temperatura:");
        int temp = Integer.parseInt(sc.nextLine());

        int indiceMomentoDia;
        switch (momento.toLowerCase()) {
            case "manana":
                indiceMomentoDia = 1;
                break;
            case "tarde":
                indiceMomentoDia = 2;
                break;
            case "noche":
                indiceMomentoDia = 3;
                break;
            default:
                System.out.println("Error: Momento del día no válido.");
                return;
        }

        
        String clasificacion;
        
        if (temp < buena) {
            clasificacion = "Muy Buena";
        } 
        else if (temp >= normalmin && temp <= normalmax) {
            clasificacion = "Normal";
        }
        else if (temp >= peligroso) {
            clasificacion = "Peligrosa";
        } 
        else {
            clasificacion = "Error: Valor de temperatura no válido.";
        }

        System.out.println("La temperatura del tanque de combustible durante la " + momento +
                " es: " + clasificacion);
    }
}
