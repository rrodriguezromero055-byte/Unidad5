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
public class IndexOf {
    public static void main(String[] args) {
        ArrayList<String> frutas= new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        
        int indice= frutas.indexOf("Naranja");
        
        if(indice != -1){
            System.out.println("Banana esta e el indice: "+ indice);
        }else{
            System.out.println("No encontrado");
        }
    }
}
