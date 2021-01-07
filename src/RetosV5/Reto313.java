/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetosV5;

/**
 *
 * @author Francisco
 */
import java.io.*;
import java.util.StringTokenizer;
public class Reto313 {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int casos=Integer.parseInt(br.readLine());
            for (int i = 0; i < casos; i++) {
            String cad=br.readLine();
            StringTokenizer st=new StringTokenizer(cad," ");
            int num1=Integer.parseInt(st.nextToken());
            int num2=Integer.parseInt(st.nextToken());
            int sum=num1+num2;
                if (sum>=0) {
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }
            }
        }catch(Exception e){;}
    }
  
}
