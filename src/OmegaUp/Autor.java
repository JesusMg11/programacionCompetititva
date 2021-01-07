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
public class Autor {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String cad = br.readLine();
            boolean b=true;
            ArrayList<Integer> v1=new ArrayList<>();
            ArrayList<Integer> v2=new ArrayList<>();
            ArrayList<Integer> v3=new ArrayList<>();
                StringTokenizer st = new StringTokenizer(cad, " ");
                int w = Integer.parseInt(st.nextToken());
                int n = Integer.parseInt(st.nextToken());
                int p,q,res;
                for (int i = 1; i <= n; i++) {
                v1.add(i);
            }
                for (int i = 1; i < v1.size(); i++) {
               p=w%v1.get(i);
                    v2.add(p);
            }
                for (int i = 0; i <= v1.size(); i++) {
                    int aux=v2.get(i);
                  
                if (v2.get(i).equals(aux) && v2.get(i+1).equals(aux)) {
                    }
                else{
                    b=false;
                }
                break;
            }
                if (b) {
                    System.out.println("No");
            }else{
                    System.out.println("Si");
                }
        }catch(Exception e){;}
    }
}
