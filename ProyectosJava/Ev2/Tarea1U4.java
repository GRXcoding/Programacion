package ProyectosJava.Ev2;

import java.util.Scanner;

/*
 * Crear una aplicación que solicite 5 nombres por teclado y los almacene en un array.

Una vez insertados los 5 nombres los muestra por consola.

** Validar que la longitud del nombre introducido sea mínimo de 3 caracteres. 

Si no se válido mostrar mensaje de error y volver a solicitar otro nombre.
 */



public class Tarea1U4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String [] listaNombres = new String[5];
        String nombre = "";

        for (int i = 0; i < listaNombres.length; i++) {
            System.out.println("Introduce el "+ (i+1)+ "º nombre: ");
            nombre = sc.nextLine();

            if (nombre.length() >= 3) {
                listaNombres[i] = nombre;
            } else {
                System.out.println("El nombre debe tener al menos 3 caracteres.");
                i--;
            }
        }

        for (int i = 0; i < listaNombres.length; i++) {
            System.out.println("Nombre " + (i + 1) + ": " + listaNombres[i]);
        }
    }
}
