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
public class yoyo {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int limite=Integer.parseInt(br.readLine());
            int cont=0;
            for (int i = 0; i < 7; i++) {
                int dia=Integer.parseInt(br.readLine());
                if (dia>limite) {
                    cont++;
                }
            }
            System.out.println(cont);
        }catch(Exception e){}
    }
}
