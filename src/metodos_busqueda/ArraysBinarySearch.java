/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos_busqueda;

/**
 *
 * @author Romero
 */

import java.util.Arrays;
public class ArraysBinarySearch {
    public static void main(String[] args) {
       int[] numeros= {5,2,9,1,6};
       
       Arrays.sort(numeros);
       int index= Arrays.binarySearch(numeros, 6);
       
       if(index>= 0){
           System.out.println("Encontrado en el indice: "+ index);
       }else{
           System.out.println("No encontrado");
       }
    }
}
