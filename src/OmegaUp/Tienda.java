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
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class Tienda {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            ArrayList<Integer> v1=new ArrayList<>();
            String cad=br.readLine();
            int rompe=7;
            StringTokenizer st = new StringTokenizer(cad, " ");
            while(st.hasMoreTokens()){
                if (rompe==0) {
                    break;
                }else{
                v1.add(Integer.parseInt(st.nextToken()));
                rompe--;
                }
            }
            int res;
            if (v1.size()<7) {
                res=7-v1.size();
                for (int i = 0; i <res; i++) {
                v1.add(0);
            }
            }
            
            int sum = 0;
            for (int i = 0; i < v1.size(); i++) {
                sum=sum+v1.get(i);
            }
            int prom, max, min;
            prom=sum/7;
            max=Collections.max(v1);
            min=Collections.min(v1);
            System.out.println(v1);
            System.out.println("Promedio de ganancias: "+prom);
            System.out.println("Mayor ganancia: "+max);
            System.out.println("Menor ganancia: "+min);
        }catch(Exception e){;}
    }
   
}
