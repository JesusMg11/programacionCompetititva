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
public class mateitza {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            String cad=br.readLine();
            StringTokenizer st=new StringTokenizer(cad," ");
            int inicio=Integer.parseInt(st.nextToken());
            int fin=Integer.parseInt(st.nextToken());
            int suma=0;
            for (int i = inicio; i <= fin; i++) {
                suma=suma+(i);
            }
            System.out.println(suma);
        }catch(Exception e){;}
    }
}
