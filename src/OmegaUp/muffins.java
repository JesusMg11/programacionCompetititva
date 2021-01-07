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
public class muffins {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int muf=Integer.parseInt(br.readLine());
            int personas=Integer.parseInt(br.readLine());
            int tot=(muf/personas)+(muf%personas);
            System.out.println(tot);
        }catch(Exception e){}
    }
}
