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
public class digitos {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
            String cad=br.readLine();
            StringTokenizer st=new StringTokenizer(cad," ");
            long l=Integer.parseInt(st.nextToken());
            long r=Integer.parseInt(st.nextToken());
            if (l<r) {
                for (int i = 0; i < 10; i++) {
                    
                }
            }else{
                System.out.println("-1");
            }
        }catch(Exception e){}
    }
}
