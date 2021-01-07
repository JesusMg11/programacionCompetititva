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
public class botones {
    public static void main(String[] args) {
        botones b=new botones();
        b.inicio();
    }
    public void inicio(){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            String cad=br.readLine();
            StringTokenizer st=new StringTokenizer(cad," ");
            long num1=Long.parseLong(st.nextToken());
            long num2=Long.parseLong(st.nextToken());
            long cont=0;
            recur(num1,num2,cont);
        }catch(Exception e){}
    }
    public void recur(long num1,long num2, long cont){
         if (num1==num2) {
                    System.out.println(cont);
                }else {
             if (num1>num2) {
                    num1=num1*2;
                    cont=cont+1;
                    recur(num1,num2,cont);
                }else if(num2>num1){
                    num1=num1-1;
                    cont=cont+1;
                    recur(num1,num2,cont);
                } 
         }
    }
}
