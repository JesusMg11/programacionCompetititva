/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetosV1;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class aiuda {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String pass=entrada.nextLine();
        boolean banderaNumero=false;  //Banderita para ayudarnos a saber si hay o no numeritos
        if (pass.contains("1") || pass.contains("2") || pass.contains("3") || pass.contains("4") || //If para comparar los 10 caracteres de los numeros, asi haya un 1 o un 192963872681 en la cadena se va a activar
                pass.contains("5") || pass.contains("6") ||pass.contains("7") || pass.contains("8") ||
                pass.contains("9") ||pass.contains("0") ) { //Contains es herramienta que sirve para indicar si algun caracter está en la cadena. Contains=contiene 
            banderaNumero=true;
        } if (banderaNumero) {
            System.out.println("HAY NUMEROS EN LA CADENA");
        }else{
            System.out.println("NO HAY NUMEROS");
        }
        boolean banderaMinusculas=false; //Banderita para las minusculas
        for (int i = 0; i < pass.length(); i++) { //for que recorre toda la cadena
            if (pass.charAt(i)>=97 && pass.charAt(i)<=122) { //Se va evaluando cada caracter de la palabra con el codigo ascii indicando el rango del abecedario en minusculas
                banderaMinusculas=true; //Si el caracter en cuestion tiene minuscula se activa la bandera
                break; //Paramos el recorrido pues ya no es necesario seguir recorriendo la cadena y rompemos el for con el break;
            }
        }
        if (banderaMinusculas) {
            System.out.println("HAY MINUSCULAS EN LA CADENA");
        }else{
            System.out.println("NO HAY MINUSCULAS");
        }
    }
}
