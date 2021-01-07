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
public class sucesion {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            String cad=br.readLine();
            StringTokenizer st=new StringTokenizer(cad, " ");
            int n1=Integer.parseInt(st.nextToken());
            int n2=Integer.parseInt(st.nextToken());
            int aux = 0;
            for (int i = 0; i < n1; i++) {
                aux=aux+n2;
            }
            System.out.println(aux);
        }catch(Exception e){;}
    }
}
