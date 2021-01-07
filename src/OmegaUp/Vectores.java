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
public class Vectores {
    public static void main(String[] args) {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         try{
             int n = Integer.parseInt(br.readLine());
             String cad=br.readLine();
             String cad2=br.readLine();
             ArrayList<Integer> v1=new ArrayList<>();
             ArrayList<Integer> v2=new ArrayList<>();
             ArrayList<Integer> sum=new ArrayList<>();
             StringTokenizer st = new StringTokenizer(cad, " ");
             StringTokenizer st2 = new StringTokenizer(cad2, " ");
             for (int i = 0; i < n; i++) {
                 v1.add(Integer.parseInt(st.nextToken()));
                 v2.add(Integer.parseInt(st2.nextToken()));
             }
             for (int i = 0; i < n; i++) {
                int res= v1.get(i)+v2.get(i);
                sum.add(res);
             }
             for (int i = 0; i < sum.size(); i++) {
                 System.out.print(sum.get(i)+" ");
             }
         }catch(Exception e){;}
    }
}
