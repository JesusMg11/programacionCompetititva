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
import java.util.StringTokenizer;
public class SumVec {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        try{
            int tam=Integer.parseInt(br.readLine());
            String cad=br.readLine();
            ArrayList<Integer> v1=new ArrayList<>();
            StringTokenizer st = new StringTokenizer(cad, " ");
            int rompe=tam;
            while(st.hasMoreTokens()){
                if (rompe==0) {
                break;    
                } else{
                    v1.add(Integer.parseInt(st.nextToken()));
                    rompe--;
                }
            }
            if (v1.size()<tam) {
                int res=tam-v1.size();
                for (int i = 0; i < res; i++) {
                    v1.add(0);
                }
            }
            int sum=0;
            for (int i = 0; i < v1.size(); i++) {
                sum=sum+v1.get(i);
            }
            System.out.println("La suma de los elementos del vector es: "+sum);
        }catch(Exception e){;}
    }
}

