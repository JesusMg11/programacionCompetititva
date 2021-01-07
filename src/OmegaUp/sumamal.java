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
import java.util.StringTokenizer;
public class sumamal {
    public static void main(String[] args) {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       try{
           String cad=br.readLine();
           StringTokenizer st=new StringTokenizer(cad, " ");
           int a=Integer.parseInt(st.nextToken());
           int b=Integer.parseInt(st.nextToken());
           if (a>0 && b>0) {
               System.out.println(BigInteger.valueOf(a+b));
           }else{
               System.exit(0);
           }
          
       }catch(Exception e){;}
    }
}
