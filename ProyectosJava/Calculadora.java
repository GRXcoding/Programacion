package ProyectosJava;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Crear una calculadora:

Para hacer esto tenemos que hacer una aplicación que de las opciones de sumar, restar, multiplicar, dividir, calcular raiz cuadrada,.

La última opción que sea apagar (cuando se seleccione esa opción finalizaremos la aplicación).

Para cada operación nos crearemos un método que realice la operación solicitada.

** Utiliza el bloque try catch para tratar las excepciones. */

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String mensaje = "Elige una opción para comenzar a operar:\n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Raíz cuadrada \n 6. Salir";

        int opcion = 0;

        do {
            opcion = obtenerEntero(mensaje);
            
            switch (opcion) {
                
                case 1:
                System.out.println("Resultado de la suma: " + sumar(obtenerNumero("Introduzca el 1º numero:"), obtenerNumero("Introduzca el 2º numero:")));
                break;

                case 2:
                System.out.println("Resultado de la resta: " + restar(obtenerNumero("Introduzca el 1º numero:"), obtenerNumero("Introduzca el 2º numero:")));
                break;

                case 3:
                System.out.println("Resultado de la multiplicación: " + multiplicar(obtenerNumero("Introduzca el 1º numero:"), obtenerNumero("Introduzca el 2º numero:")));
                break;

                case 4:
                System.out.println("Resultado de la división: " + dividir(obtenerNumero("Introduzca el 1º numero:"), obtenerNumero("Introduzca el 2º numero:")));
                break;

                case 5:
                System.out.println("Resultado de la raíz cuadrada: " + raizCuadrada(obtenerNumero("Introduzca el numero para calcular su raiz:")));
                break;
                
                case 6:
                System.out.println("El programa se ha cerrado con exito");
                break;

                default:
                System.out.println("Error: Introduzca un numero entero");
                break;
            }
        } while ( opcion != 6);       
    }


    public static int obtenerEntero(String msn) {
        Scanner sc = new Scanner(System.in);
        int numEntero = 0;
        boolean valido;
        do {
            try {
                System.out.println(msn);
                numEntero = sc.nextInt();
                valido = true;
            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.println("Error: Introduzca un numero entero");
                valido = false;
            }
        } while (valido == false);
        return numEntero;
    }

    public static double obtenerNumero(String msn) {
        Scanner sc = new Scanner(System.in);
        double num = 0;
        boolean valido;
        do {
            try {
                System.out.println(msn);
                num = sc.nextDouble();
                valido = true;
            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.println("Error: Introduzca un numero");
                valido = false;
            }
        } while (valido == false);
        return num;
    }

    public static double sumar(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double restar(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double multiplicar(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double dividir(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

    public static double raizCuadrada(double num1) {
        double result = Math.sqrt(num1);
        return result;
    }
}

