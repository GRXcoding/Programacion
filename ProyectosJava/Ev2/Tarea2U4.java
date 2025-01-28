package ProyectosJava.Ev2;

import java.util.Scanner;

/*
* Crear una aplicación que solicite 5 números entre el 0 y el 50 y los inserte en un array.
Una vez almacenados todos los números en el array crear un método "sumar" que devuelva la suma de todos los números del array. 

Invocar al método sumar desde el main para que muestre el resultado de sumar todos los números.
*/

public class Tarea2U4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] listaNumeros = new int[5];
        int numero = 0;

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println("Introduce el " + (i + 1) + "º número: ");
            numero = sc.nextInt();

            if (numero >= 0 && numero <= 50) {
                listaNumeros[i] = numero;
            } else {
                System.out.println("El número debe estar entre 0 y 50.");
                i--;
            }
        }

        System.out.println("La suma de los números es: " + sumar(listaNumeros));
    }
