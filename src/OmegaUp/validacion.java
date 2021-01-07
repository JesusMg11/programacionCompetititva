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
public class validacion {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            do{
                int num1=Integer.parseInt(br.readLine());
                int num2=Integer.parseInt(br.readLine());
                if (num1==num2) {
                    System.out.println("YA");
                    break;
                }
                else if ((num1<1000 && num2<1000) && ((num1%2==0 && num2%2>0) || (num2%2==0 && num1%2>0))
                       && num1!=num2) {
                    System.out.println("TODAVIA NO");
                }else{
                   System.out.println("YA");
                   break;
               }  
            }while(true);
        }catch(Exception e){}
    }
}
