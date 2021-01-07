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
public class par {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
        int num=Integer.parseInt(br.readLine());
            if (num%2==0) {
                System.out.println("Par");
            }else{
                System.out.println("Impar");
            }
        }catch(Exception e){}
    }
}
