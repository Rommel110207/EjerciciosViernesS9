package ni.edu.uam;
import ni.edu.uam.modelos.*;
import java.util.Scanner;
//Menu interactivo
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int opcion;
        do
        {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Estudiantes");
            System.out.println("2. Productos");
            System.out.println("3. Números");
            System.out.println("4. Salir");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    Estudiante estudiante = new Estudiante();
                    estudiante.mostrarNombres();
                    estudiante.eliminarNombre("Pedro");
                    System.out.println("Después de eliminar a Pedro:");
                    estudiante.mostrarNombres();
                    break;
                case 2:
                    Producto producto = new Producto();
                    producto.mostrarCantidadProductos();
                    break;
                case 3:
                    Numero numero = new Numero();
                    numero.mostrarNumeros();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }


        }while (opcion != 4);



    }
}