/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

/**
 *
 * @author JESUS
 */
import java.util.*;
public class nive {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(); //Se crea arreglo para guardar los nombres
        nombres.add(0,"jose");
        nombres.add(1,"edwin");
        nombres.add(2,"brandon");
        nombres.add(3,"alejandra");
        nombres.add(4,"juan"); //Se añaden 5 nombres
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println((i+1)+".- "+nombres.get(i));
        } //Se imprimen los nombres 
        int r, j, k; //variables que guardaran la posicion del arreglo
        r = (int) (Math.random()*nombres.size()); //se escoge al azar una posicion del arreglo 
        System.out.println("Primer lugar: "+nombres.get(r)); //se imprime el nombre seleccionado
        nombres.remove(r); //Se quita del arreglo el nombre
        //Se repite el proceso dos veces mas
        j = (int) (Math.random()*nombres.size());
        System.out.println("Segundo lugar: "+nombres.get(j));
        nombres.remove(j);
        k = (int) (Math.random()*nombres.size());
        System.out.println("Tercer lugar: "+nombres.get(k));
        nombres.remove(k);
    }
}
