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
public class menores {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        try{
            int tam=Integer.parseInt(br.readLine());
            String cad=br.readLine();
            ArrayList<Integer> v1=new ArrayList<>();
            ArrayList<Integer> v2=new ArrayList<>();
            StringTokenizer st=new StringTokenizer(cad, " ");
            for (int i = 0; i < tam; i++) {
                v1.add(Integer.parseInt(st.nextToken()));
            }
            int cont=0;
            for (int i = 0; i < v1.size(); i++) {
                for (int j = i+1; j < v1.size(); j++) {
                    if (v1.get(i)>v1.get(j)) {
                        cont++;
                    }
                }
                v2.add(cont);
                cont=0;
            }
            for (int i = 0; i < v2.size(); i++) {
                System.out.print(v2.get(i)+" ");
            }
        }catch(Exception e){;}
    }
}
