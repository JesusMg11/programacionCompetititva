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
public class mejor {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            String cad=br.readLine();
            String cad2=br.readLine();
            StringTokenizer st=new StringTokenizer(cad," ");
            StringTokenizer st2=new StringTokenizer(cad2," ");
            String nom1=st.nextToken();
            int cal1=Integer.parseInt(st.nextToken());
            String nom2=st2.nextToken();
            int cal2=Integer.parseInt(st2.nextToken());
            if (cal1>cal2) {
                System.out.println(nom1);
            }else{
                System.out.println(nom2);
            }
        }catch(Exception e){;}
    }
   
}
