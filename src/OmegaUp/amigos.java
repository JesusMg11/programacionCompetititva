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
public class amigos {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
            long casos=Integer.parseInt(br.readLine());
            long cont=0,cont2=0;
            for (long i = 0; i < casos; i++) {
                String cad=br.readLine();
                StringTokenizer st=new StringTokenizer(cad," ");
                for (long j = 0; j < 3; j++) {
                    if (st.nextToken().contains("1")) {
                        cont2++;
                    }
                }
                if (cont2>=2) {
                    cont++;
                }
                cont2=0;
            }
            System.out.println(cont);
        }catch(Exception e){}
    }
}
