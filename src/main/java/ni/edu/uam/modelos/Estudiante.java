package ni.edu.uam.modelos;

import java.util.ArrayList;

/*Crear un ArrayList de nombres de estudiantes. Eliminar un nombre y mostrar la lista actualizada.*/
public class Estudiante
{
    ArrayList<String> nombres = new ArrayList<String>();
    public Estudiante()
    {
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Ana");
    }
    public void eliminarNombre(String nombre)
    {
        nombres.remove(nombre);
    }
    public void mostrarNombres()
    {
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
