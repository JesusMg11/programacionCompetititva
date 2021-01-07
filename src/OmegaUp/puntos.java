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
public class puntos {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            String cad=br.readLine();
            StringTokenizer st=new StringTokenizer(cad," ");
            int num1=Integer.parseInt(st.nextToken());
            int num2=Integer.parseInt(st.nextToken());
            int aux,cont=0;
            for (int i = 0; i < num1; i++) {
                aux=Integer.parseInt(br.readLine());
                if (aux>=num2) {
                    cont++;
                }
            }
            System.out.println(cont);
        }catch(Exception e){}
    }
}
