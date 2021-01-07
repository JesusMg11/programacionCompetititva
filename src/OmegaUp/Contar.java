/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OmegaUp;

/**
 *
 * @author Francisco
 */
import java.io.*;
import java.util.ArrayList;
public class Contar {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        try{
            int tam=Integer.parseInt(br.readLine());
            int lee;
            ArrayList<Integer> v1=new ArrayList<>();
            for (int i = 0; i < tam; i++) {
               lee=Integer.parseInt(br.readLine());
               v1.add(lee);
            }
            System.out.println("El numero de elementos del vector es: "+tam);
        }catch(Exception e){;}
    }
}
