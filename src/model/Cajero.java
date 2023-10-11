package model;
import java.util.List;
import java.util.Scanner;

// Clase de utilidad que no posee atributos, solo métodos.
public class Cajero {

    public static void comprarMedicamento(List<Medicamento> medicamentos) {
        Scanner scanner = new Scanner(System.in);  // Crear un objeto de tipo Scanner

        // Leer input del usuario
        System.out.println("Medicamento: ");
        String nombre = scanner.nextLine(); 
        System.out.print("Ingrese la cantidad comprada: ");
        int cantidad = scanner.nextInt(); 

        boolean encontrado = false;
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getNombre().equals(nombre)) {
                encontrado = true;
                // Actualizar la cantidad de medicamentos
                medicamento.setCantidad(medicamento.getCantidad() + cantidad);
                System.out.println("Se compraron " + cantidad + " unidades de " + medicamento.getNombre());
                break;
            }
        }
        // Si no se encontró el medicamento, se crea uno nuevo
        if (!encontrado) {
            Medicamento nuevoMedicamento = new Medicamento(nombre, cantidad);
            medicamentos.add(nuevoMedicamento);
            System.out.println("Se creó un nuevo medicamento: " + nuevoMedicamento.getNombre() + " con " + nuevoMedicamento.getCantidad() + " unidades");
        }
    }
        
        public static void venderMedicamento(List<Medicamento> medicamentos) {
        Scanner scanner = new Scanner(System.in);

        for (Medicamento medicamento : medicamentos) {
        
        System.out.println("Medicamento: ");
        String nombre = scanner.nextLine(); 
        medicamento.setNombre(nombre); 
            
            if (medicamento.getNombre().equals(nombre) == true) { // Encuentra el medicamento dentro de la list
                System.out.print("Ingrese la cantidad comprada: ");
                int cantidad = scanner.nextInt(); 
                if (medicamento.getCantidad() >= cantidad) { // Comprueba si hay suficientes unidades
                    medicamento.setCantidad(medicamento.getCantidad() - cantidad); // Actualiza la cantidad de medicamentos
                    System.out.println("Se vendieron " + cantidad + " unidades de " + medicamento.getNombre());
                } else {
                    System.out.println("No hay suficientes unidades de " + medicamento.getNombre() + " o este medicamento no existe.");
                }
                return; // Salir del loop si el elemento se encontró
            }

        }
        
    }
     }
