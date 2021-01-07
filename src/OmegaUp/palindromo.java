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
public class palindromo {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            String cad=br.readLine();
            char aux=cad.charAt(0);
            StringTokenizer st=new StringTokenizer(cad,aux+"");
            String p1=st.nextToken();
            String p2=st.nextToken();
            if (p1.charAt(0)!=aux) {
                p1=aux+p1+aux;
            }
            else if (p2.charAt(0)!=aux) {
                p2=aux+p2+aux;
            }else{
                
            }
            System.out.println(p1);
            System.out.println(p2);
        }catch(Exception e){;}
    }
}
