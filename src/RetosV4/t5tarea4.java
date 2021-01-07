/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetosV4;

/**
 *
 * @author Francisco
 */
import java.util.ArrayList;
import java.util.Scanner;

public class t5tarea4 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();


String e, nombre;
        do {
            
            System.out.println("****Que opcion desea ejecutar:agregar, buscar, eliminar y salir*****");
            e = dato.nextLine();


            if (e.equals("agregar")) {
                System.out.println("que nombre desea agregar");
                nombre = dato.nextLine();
                int b = 0;
                for (int j = 0; j < a.size(); j++) {
                    if (a.get(j).equals(nombre)) { //.equals sirve para comparar si la posicion contiene el valor de nombre
                        b = 1;

                    }
                }
                if (b == 0) {
                    a.add(nombre);
                }
                System.out.println(a); //imprime el arreglo
                
            }
           
           else if (e.equals("buscar")) { //.equals sirve para ver si la variable e contiene la palabra "buscar"
                System.out.println("ingrese el nombre que busca");
                nombre = dato.nextLine();
                int b = 0;
                System.out.println(a);
                for (int h = 0; h < a.size(); h++) {
                    if (a.get(h).equals(nombre)) {
                        b = 1;
                        System.out.println("el nombre si existe " + a.get(h)+" en la posicion "+h);
                    }
                }
                if (b == 0) {
                    System.out.println("el nombre no existe");
                }

            }
          else  if (e.equals("eliminar")) {
                System.out.println("ingrese el nombre que desea eliminar");
                nombre = dato.nextLine();
                int b = 0;
                for (int w = 0; w < a.size(); w++) {
                    if (a.get(w).equals(nombre)) {
                        b = 1;
                        a.remove(w);
                        System.out.println("el nombre a sido eliminado");
                    }
                }
                if (b == 0) {
                    System.out.println("no existe ese registro");
                }
            }
            else if (e.equals("salir")) {
                System.exit(0); //Funciona como el break, funcion del sistema para terminar la ejecucion
            }
        } while (true);
    }
}
