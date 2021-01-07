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
public class devtequila {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int num=Integer.parseInt(br.readLine());
            System.out.println(num*num);
            System.out.println((num*num)*num);
        }catch(Exception e){}
    }
}
