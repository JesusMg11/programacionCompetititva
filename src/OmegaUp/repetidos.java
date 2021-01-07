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
public class repetidos {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            String cad=br.readLine();
            String cont=br.readLine();
            String casos=br.readLine();
            StringTokenizer st=new StringTokenizer(cad," ");
            StringTokenizer st2=new StringTokenizer(cont," ");
            StringTokenizer st3=new StringTokenizer(casos," ");
            ArrayList<Integer> v1=new ArrayList<>();
            ArrayList<Integer> v2=new ArrayList<>();
            int tam=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
              for (int i = 0; i < tam; i++) {
                v1.add(Integer.parseInt(st2.nextToken()));
            }
            for (int i = 0; i < c; i++) {
                v2.add(Integer.parseInt(st3.nextToken()));
            }
            for (int i = 0; i < c; i++) {
                int var=Collections.frequency(v1, v2.get(i));
                System.out.println(v2.get(i)+" "+var);
            }  
            
            
        }catch(Exception e){;}
    }
}
