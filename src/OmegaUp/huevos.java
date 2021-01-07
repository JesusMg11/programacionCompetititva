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
public class huevos {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int huevos=Integer.parseInt(br.readLine());
            if (huevos>=6 && huevos<=100) {
            int pq6=huevos%6;
            int pq8=huevos%8;
            int tot6,tot8;
                if (pq6==0 || pq8==0) {
                    tot6=huevos/6;
                    tot8=huevos/8;
                    if (pq6==0 && pq8!=0) {
                        System.out.println(tot6);
                    }else if (pq8==0 && pq6!=0) {
                        System.out.println(tot8);
                    }else{
                        
                       if (tot6<tot8) {
                        System.out.println(tot6);
                    }else{
                        System.out.println(tot8);
                    } 
                       
                    }
                    
                }else{
                    System.out.println("0");
                }
            }else{
                System.exit(0);
            }
        }catch(Exception e){;}
    }
}
