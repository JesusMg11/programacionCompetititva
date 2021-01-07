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
import java.math.BigInteger;
import java.io.*;
public class caracter {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        try{
            String cad=br.readLine();
            if (cad.isEmpty()) {
                System.exit(0);
            }else{
            System.out.println(BigInteger.valueOf(cad.length()));
            }
        }catch(Exception e){}
    }
}
