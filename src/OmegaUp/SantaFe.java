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
public class SantaFe {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            String cad=br.readLine();
            if (cad.length()<=500) {
                int a=0,e=0,ii=0,o=0,u=0;
            for (int i = 0; i < cad.length(); i++) {
                if (cad.charAt(i)=='A' || cad.charAt(i)=='a') {
                    a++;
                }else if (cad.charAt(i)=='E' || cad.charAt(i)=='e') {
                    e++;
                }else if (cad.charAt(i)=='I' || cad.charAt(i)=='i') {
                    ii++;
                }else if (cad.charAt(i)=='O' || cad.charAt(i)=='o') {
                    o++;
                }else if (cad.charAt(i)=='U' || cad.charAt(i)=='u') {
                    u++;
                }
            }
            System.out.println(a+" "+e+" "+ii+" "+o+" "+u);
            }else{
            System.exit(0);
        }
            
        }catch(Exception e){;}
    }
}
