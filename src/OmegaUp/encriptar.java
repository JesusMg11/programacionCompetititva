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
public class encriptar {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            String cad=br.readLine();
            if (cad.length()<=100000) {
                String cada = cad.replace('a', 'e').replace('o','u').replace('e','i').replace('u', 'a').replace('i', 'o');
                System.out.println(cada);
            }else{
                System.exit(0);
            }
        }catch(Exception e){;}
    }
}
