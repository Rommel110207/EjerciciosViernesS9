package ni.edu.uam.modelos;

import java.util.ArrayList;

//Crear un ArrayList de números enteros y agregar 5 números. Luego mostrar todos los elementos.
public class Numero
{
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    public Numero()
    {
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

    }
    public void mostrarNumeros()
    {
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }

}
