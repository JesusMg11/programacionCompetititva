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
import java.util.GregorianCalendar;
public class bisciesto {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int a1=Integer.parseInt(br.readLine());
            int a2=Integer.parseInt(br.readLine());
            int cont=0;
            GregorianCalendar calendar=new GregorianCalendar();
            for (int a = a1; a <= a2; a++) {
                if ((a % 4 == 0 && a % 100 != 0) || (a % 100 == 0 && a % 400 == 0) || calendar.isLeapYear(a)) {
               //if (calendar.isLeapYear(a)){
            // if((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))){    
             cont++;
                }
            }
            System.out.println(cont);
        }catch(Exception e){;}
    }
}
