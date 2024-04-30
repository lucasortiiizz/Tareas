/*
    Lucas Ortiz
*/
package orientadoaobj;

import java.util.ArrayList;
import java.util.Scanner;

public class Orientadoaobj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Automovil> registro = new ArrayList<>();
        int opc = 0;
        do {
            System.out.println("---------MENU-----------");
            System.out.println("1. Crear un nuevo registro");
            System.out.println("2. Buscar un registro");
            System.out.println("3. Editar un registro");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
                case 1:
                    Automovil.cargarRegistro(scanner, registro);
                    break;
                case 2:
                    System.out.print("Ingrese el id para buscar: ");
                    int idBuscar = scanner.nextInt();
                    scanner.nextLine();
                    Automovil.buscarRegistro(idBuscar, registro);
                    break;
                case 3:
                    System.out.print("Ingrese el id para editar: ");
                    int idEditar = scanner.nextInt();
                    scanner.nextLine();
                    Automovil.editarRegistro(idEditar, registro, scanner);
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese una opción válida.");
            }

        } while(opc != 4);
    }
}

class Automovil {
    private int id;
    private String marca;
    private String modelo;
    private int año;
    private String tipo;
    private String numeroChasis;
    private String color;

    public Automovil(int id, String marca, String modelo, int año, String tipo, String numeroChasis, String color) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.numeroChasis = numeroChasis;
        this.color = color;
    }
     public int getId() {
        return id;
    }
    public static void cargarRegistro(Scanner scanner, ArrayList<Automovil> registro) {
        int id = 0;
        while (true) {
            try {
                System.out.print("ID: ");
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ID debe ser un numero entero.");
            }
        }

        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        while (marca.isEmpty()) {
            System.out.println("Este campo no puede estar vacía.");
            System.out.print("Marca: ");
            marca = scanner.nextLine();
        }

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        while (modelo.isEmpty()) {
            System.out.println("Este campo no puede estar vacío.");
            System.out.print("Modelo: ");
            modelo = scanner.nextLine();
        }

        int año = 0;
        while (true) {
            try {
                System.out.print("Año: ");
                año = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Año debe ser un numero entero.");
            }
        }

        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        while (tipo.isEmpty()) {
            System.out.println("Este campo no puede estar vacío.");
            System.out.print("Tipo: ");
            tipo = scanner.nextLine();
        }

        System.out.print("Numero de Chasis: ");
        String numeroChasis = scanner.nextLine();
        while (numeroChasis.isEmpty()) {
            System.out.println("Este campo no puede estar vacío.");
            System.out.print("Numero de Chasis: ");
            numeroChasis = scanner.nextLine();
        }

        System.out.print("Color: ");
        String color = scanner.nextLine();
        while (color.isEmpty()) {
            System.out.println("Este campo no puede estar vacío.");
            System.out.print("Color: ");
            color = scanner.nextLine();
        }

        Automovil nuevoAuto = new Automovil(id, marca, modelo, año, tipo, numeroChasis, color);
        registro.add(nuevoAuto);

        System.out.println("Añadido correctamente");
    }

    public static void buscarRegistro(int id, ArrayList<Automovil> registro) {
        boolean encontrado = false;
        for (Automovil auto : registro) {
            if (auto.getId() == id) {
                System.out.println("Registro encontrado:");
                auto.imprimirRegistro();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún registro con el ID especificado.");
        }
    }

    public static void editarRegistro(int id, ArrayList<Automovil> registro,Scanner scanner) {
        boolean encontrado = false;
        for (Automovil auto : registro) {
            if (auto.getId() == id) {
                System.out.println("Registro encontrado:");
                System.out.println(auto);
                System.out.println("Ingrese los nuevos datos:");
    
    
                System.out.print("Marca: ");
                String marca = scanner.nextLine();
                while (marca.isEmpty()) {
                    System.out.println("Error: Marca no puede estar vacía.");
                    System.out.print("Marca: ");
                    marca = scanner.nextLine();
                }
                auto.marca = marca;
    
                System.out.print("Modelo: ");
                String modelo = scanner.nextLine();
                while (modelo.isEmpty()) {
                    System.out.println("Error: Modelo no puede estar vacío.");
                    System.out.print("Modelo: ");
                    modelo = scanner.nextLine();
                }
                auto.modelo = modelo;
    
                int año = 0;
                while (true) {
                    try {
                        System.out.print("Año: ");
                        año = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Año debe ser un numero entero.");
                    }
                }
                auto.año = año;
    
                System.out.print("Tipo: ");
                String tipo = scanner.nextLine();
                while (tipo.isEmpty()) {
                    System.out.println("Error: Tipo no puede estar vacío.");
                    System.out.print("Tipo: ");
                    tipo = scanner.nextLine();
                }
                auto.tipo = tipo;
    
                System.out.print("Numero de Chasis: ");
                String numeroChasis = scanner.nextLine();
                while (numeroChasis.isEmpty()) {
                    System.out.println("Error: Numero de Chasis no puede estar vacío.");
                    System.out.print("Numero de Chasis: ");
                    numeroChasis = scanner.nextLine();
                }
                auto.numeroChasis = numeroChasis;
    
                System.out.print("Color: ");
                String color = scanner.nextLine();
                while (color.isEmpty()) {
                    System.out.println("Error: Color no puede estar vacío.");
                    System.out.print("Color: ");
                    color = scanner.nextLine();
                }
                auto.color = color;
    
                System.out.println("Registro actualizado");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No hay registros con ese ID");
        }
}
  
    public void imprimirRegistro() {
     System.out.println("ID: " + id);
       System.out.println("Marca: " + marca);
       System.out.println("Modelo: " + modelo);
       System.out.println("Año: " + año);
       System.out.println("Tipo: " + tipo);
       System.out.println("Numero de Chasis: " + numeroChasis);
       System.out.println("Color: " + color);
   } 
}