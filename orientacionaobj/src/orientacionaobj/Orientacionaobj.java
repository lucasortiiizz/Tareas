package orientacionaobj;

import java.util.Scanner;
import java.util.ArrayList;

public class Orientacionaobj {
    private int id;
    private String marca;
    private String modelo;
    private int año;
    private String tipo;
    private String numeroChasis;
    private String color;

    // Constructor
    public Orientacionaobj(int id, String marca, String modelo, int año, String tipo, String numeroChasis, String color) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.numeroChasis = numeroChasis;
        this.color = color;
    }

    // Getter y setter 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Procedimiento para mostrar registro
    public void mostrarRegistro() {
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Tipo: " + tipo);
        System.out.println("Número de Chasis: " + numeroChasis);
        System.out.println("Color: " + color);
    }

    // Metodo para buscar
    public static void buscarRegistro(int n, ArrayList<Orientacionaobj> registro) {
        for(Orientacionaobj re : registro) {   //for each para recorrer el array
            if (n == re.getId()) {
                System.out.println("Registro encontrado:");
                re.mostrarRegistro();
                return; // Salir del método una vez que se encuentra el registro
            }
        }
        // Si no se encuentra el registro después del bucle
        System.out.println("Registro no encontrado.");  
    }

    // Metodo para editar
    public static void editarRegistro(int n, ArrayList<Orientacionaobj> registro) {
        Scanner sc = new Scanner(System.in); // Crear objeto escaner para utilizar dentro de la clase
        for(Orientacionaobj re : registro) {
            if (n == re.getId()) {
                System.out.println("Registro encontrado:");
                int id = 0;
                while (true) {        // Comprobar si el dato ingresado es un número entero
                    try {
                        System.out.print("ID: ");
                        id = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: ID debe ser un número entero.");
                    }
                }
                re.setId(id); 
                System.out.print("Marca: ");
                String marca = sc.nextLine();
                while (marca.isEmpty()) { // Comprobar que el campo no esté vacío
                    System.out.println("Error: Marca no puede estar vacía."); 
                    System.out.print("Marca: ");
                    marca = sc.nextLine();
                }
                re.setMarca(marca);
                // Resto de la lógica de edición...
            }
        }
    }
}
