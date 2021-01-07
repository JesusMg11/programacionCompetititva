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
import java.util.StringTokenizer;
public class adivina {
    public static void main(String[] args) {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      try{
          String cad=br.readLine();
          StringTokenizer st=new StringTokenizer(cad," ");
          int num1=Integer.parseInt(st.nextToken());
          int num2=Integer.parseInt(st.nextToken());
          int res=Integer.parseInt(st.nextToken());
          if (num1*num2==res) {
              System.out.println("*");
          }else if (num1+num2==res) {
              System.out.println("+");
          }else if (num1-num2==res) {
              System.out.println("-");
          }else if (num1/num2==res) {
              System.out.println("/");
          }else{
              System.out.println("D:");
          }
      }catch(Exception e){}
    }
}
