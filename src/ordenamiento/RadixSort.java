/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author Romero
 */
import java.util.Arrays;
import java.util.Scanner;
public class RadixSort {
    public static void main(String[] args) {
       
        System.out.println("Algoritmo Radix ordenamiento por digitos");
        Scanner sc = new Scanner(System.in);

        // Pedir cuantos numeros va a ingresar el usuario
        System.out.print("Ingresa la cantidad de numeros ");
        int cantidad = sc.nextInt();

        // Crear el arreglo con el tamano indicado
        int[] numeros = new int[cantidad];

        // Pedir los numeros uno por uno
        System.out.println("Ingresa los " + cantidad + " numeros");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Ordenar el arreglo con radix
        radixSort(numeros);

        // Mostrar el resultado final
        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(numeros));
    }

    // Metodo principal que ejecuta radix sort
    private static void radixSort(int[] numeros) {

        // Buscar el numero mas grande
        int max = Arrays.stream(numeros).max().orElseThrow();

        // Revisar unidades decenas centenas etc
        for (int exp = 1; (max / exp) > 0; exp *= 10) {
            ordenarPorColumna(numeros, exp);
        }
    }

    // Ordena el arreglo segun el digito actual
    private static void ordenarPorColumna(int[] numeros, int exp) {

        int cant = numeros.length;

        int[] ordenado = new int[cant];   // Arreglo temporal para ordenar
        int[] posiciones = new int[10];   // Contador de digitos 0 a 9

        // Contar los numeros por digito
        for (int i = 0; i < cant; i++) {
            int digito = (numeros[i] / exp) % 10;
            posiciones[digito]++;
        }

        // Crear acomulado de posiciones
        for (int i = 1; i < 10; i++) {
            posiciones[i] = posiciones[i] + posiciones[i - 1];
        }

        // Ordenar usando el digito actual recorriendo al reves
        for (int i = cant - 1; i >= 0; i--) {
            int digito = (numeros[i] / exp) % 10;
            int posFinal = posiciones[digito] - 1;
            ordenado[posFinal] = numeros[i];
            posiciones[digito]--;
        }

        // Copiar el arreglo ordenado al original
        System.arraycopy(ordenado, 0, numeros, 0, cant);
    }
}
