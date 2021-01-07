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
public class Reto515 {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int num,num2,cont=1;
            do{
              num=Integer.parseInt(br.readLine());
                if (num==0) {
                    System.exit(0);
                }else if(num==1){
                    System.out.println(num);
                }else {
                    num2=num-1;
                    while(num2!=0) {
                    if ((num2%2)==0) {
                        if ((cont%2)!=0) {
                          num2=num2-2;
                        cont++;  
                        }else{
                        num2--;
                        cont++;
                        }
                       // System.out.println("YA JALA MASO: "+num2);
                    }else{
                        num2--;
                        cont++;
                       // System.out.println("A VER EL ELSE : "+num2);
                    }    
                    }
                    System.out.println(cont);
                    cont=1;
                }
            }while(num!=0);
        }catch(Exception e){;}
    }
}
