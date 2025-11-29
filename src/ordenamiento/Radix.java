/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

import java.util.Arrays;

/**
 *
 * @author Romero
 */
public class Radix {
    public static void main(String[] args) {
        System.out.println("ALgoritmo radix");
        
        int[] numeros={329,457,657,839,436,720,355};
        
        radixSort(numeros);
        
        System.out.println(Arrays.toString(numeros));
    }
    private static void ordenarPorColumna(int[] numeros, int exp){
        int cant = numeros.length;
        int[] ordenado= new int [cant];
        int[] posiciones= new int[10];
        /// Crear un acomulado de las posiciones
        for (int i = 0; i < cant; i++) {
            int digito = (numeros[i]/exp) %10;
            posiciones[digito] ++;
        }
        /// Crear un arreglo acomulado por el orden
        for(int i = 1; i<10; i++){
            posiciones[i]=posiciones[i]+ posiciones[i-1];
        }
        /// Crear un arreglo nuevo ordenado
        for(int i=cant-1; i>=0; i--){
            int digito= (numeros[i]/exp)%10;
            int posicionFinal=posiciones[digito]-1;
            ordenado[posicionFinal]=numeros[i];
            posiciones[digito]--; 
        }
        System.arraycopy(ordenado, 0, numeros, 0, cant);
    }
     private static void radixSort(int[] numeros){
       //Obtener el valor mayor del arreglo
       int max= Arrays.stream(numeros).max().orElseThrow();
      //  System.out.println("EL numero mayor es: "+ max);
       for(int exp= 1; (max/exp)>0; exp*=10){
           ordenarPorColumna(numeros,exp);
       }
    }
 
}
