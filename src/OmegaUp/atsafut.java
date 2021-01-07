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
public class atsafut {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int veces=Integer.parseInt(br.readLine());
            String cad=br.readLine();
            StringTokenizer st=new StringTokenizer(cad," ");
            ArrayList<Integer> v1=new ArrayList<>();
            for (int i = 0; i < veces; i++) {
                v1.add(Integer.parseInt(st.nextToken()));
            }
            int aux = 0;
            for (int i = 0; i < v1.size(); i++) {
                for (int j = i+1; j < v1.size(); j++) {
                    aux=(v1.get(i)*v1.get(j));
                }
            }
            System.out.println(aux);
        }catch(Exception e){}
    }
}
