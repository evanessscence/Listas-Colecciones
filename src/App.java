import java.util.*;
import javax.swing.*;
import model.Cajero;
import model.Medicamento;

        public class App {
            static List<Medicamento> medicamentos = new ArrayList();
            public static void main(String[] args) throws Exception {
                int eleccion;
                do {
                    String[] options = {"1. Comprar Medicamento", "2. Vender Medicamento"};
                    eleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

                    Cajero cajero = new Cajero(); // create an instance of the Cajero class

                    switch(eleccion) {
                        case 0:
                            mostrarMedicamentos(medicamentos);
                            Cajero.comprarMedicamento(medicamentos); 
                            break;
                        case 1:
                            mostrarMedicamentos(medicamentos);
                            Cajero.venderMedicamento(medicamentos);
                            break;
                        default:
                            System.exit(0);
                            System.out.print("Programa terminado");
                            break;
                    }
                } while (eleccion<=1); } 

           public static void mostrarMedicamentos(List<Medicamento> medicamentos)
            {
                for (Medicamento medicamento : medicamentos) {
                    System.out.println(medicamento);
                }
            }
           }




