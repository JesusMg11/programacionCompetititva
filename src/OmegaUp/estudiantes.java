/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OmegaUp;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
/**
 *
 * @author Francisco
 */
public class estudiantes {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int casos=Integer.parseInt(br.readLine());
            ArrayList<Integer> v1=new ArrayList<>();
            for (int i = 0; i <casos; i++) {
                String cad=br.readLine();
                StringTokenizer st=new StringTokenizer(cad," ");
                int n1=Integer.parseInt(st.nextToken());
                int n2=Integer.parseInt(st.nextToken());
               switch(n1){
                   case 1:
                       v1.add(n2);
                       break;
                   case 2:
                       int x=0;
                       int aux=n2;
                       for (int j = 0; j < n2; j++) {
                         x=x+(Collections.frequency(v1, aux));
                         aux--;
                       }
                       System.out.println(x);
                       break;
                   default:
                       System.exit(0);
                       break;
               }
            }
        }catch(Exception e){;}
    }
}
