/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos_busqueda;

/**
 *
 * @author Romero
 */
import java.util.ArrayList;
public class Contains {
    public static void main(String[] args) {
        ArrayList<Integer> numeros= new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        
        //Verfifica si la lista contiene el numero 20
        boolean existe = numeros.contains(20);
        
        if(existe){
            System.out.println("La lista contien el numero 20");
        }
    }
}
