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
public class planas {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            String cad=br.readLine();
            StringTokenizer st=new StringTokenizer(cad," ");
            String pal=st.nextToken();
            int num=Integer.parseInt(st.nextToken());
            for (int i = 0; i < num; i++) {
                System.out.println(pal);
            }
        }catch(Exception e){}
    }
   
}
