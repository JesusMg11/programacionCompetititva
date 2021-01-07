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
public class edificio {
    public static void main(String[] args) {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int veces=Integer.parseInt(br.readLine());
            String cad=br.readLine();
            StringTokenizer st=new StringTokenizer(cad," ");
            ArrayList<Integer> v1=new ArrayList<>();
            ArrayList<Integer> v2=new ArrayList<>();
            for (int i = 0; i < veces; i++) {
                v1.add(Integer.parseInt(st.nextToken()));
            }
            int cont=0,cont2;
            for (int i = 0; i < v1.size(); i++) {
                for (int j = i; j < v1.size(); j++) {
                    if (v1.get(i)>=v1.get(j)) {
                       cont++; 
                    }else{
                        break;
                    }
                }
                    cont2=cont;
                    cont=0;
                for (int j = i-1; j >= 0; j--) {
                    if (j>=0 && j<=v1.size()) {
                        if (v1.get(i)>v1.get(j)) {
                           cont2++; 
                        }else{
                            break;
                        }
                    }else{
                        break;
                    }
                }
               v2.add(cont2);
            }
            System.out.println(v2);
        }catch(Exception e){}
    }
 
}
