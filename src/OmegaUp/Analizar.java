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
public class Analizar {
    public static void main(String[] args) {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         try{
             String nom=br.readLine();
             int tot=nom.length();
             int cont=0;
             for (int i = 0; i < nom.length(); i++) {
                 if ((nom.charAt(i)=='a') || (nom.charAt(i)=='e') || (nom.charAt(i)=='i') || (nom.charAt(i)=='o') || (nom.charAt(i)=='u')
                    ||    (nom.charAt(i)=='A') || (nom.charAt(i)=='E') || (nom.charAt(i)=='I') || (nom.charAt(i)=='O') || (nom.charAt(i)=='U') ) {
                    cont++;
                }
             }
             System.out.println(tot);
             System.out.println(cont);
             for (int i = nom.length()-1; i >=0; i--){
                 System.out.print(nom.charAt(i));
             }
             System.out.println("");
         }catch(Exception e){;}
    }
}
