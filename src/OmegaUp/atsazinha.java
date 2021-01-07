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
public class atsazinha {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int lugares=Integer.parseInt(br.readLine());
            String cad=br.readLine();
            StringTokenizer st=new StringTokenizer(cad," ");
            ArrayList<Integer> v1=new ArrayList<>();
            for (int i = 0; i < lugares; i++) {
                v1.add(Integer.parseInt(st.nextToken()));
            }
            for (int i = 0; i < lugares-1; i++) {
                String cad2=br.readLine();
            }
            int q=Integer.parseInt(br.readLine());
            for (int i = 0; i < q; i++) {
                String cad3=br.readLine();
            StringTokenizer st2=new StringTokenizer(cad3," ");
            int in=Integer.parseInt(st2.nextToken());
            int fi=Integer.parseInt(st2.nextToken());
                if (v1.get(fi-1)>v1.get(in-1)) {
                    int res=(v1.get(fi-1))-(v1.get(in-1));
                    System.out.println(res);
                }else{
                   int res=(v1.get(in-1))-(v1.get(fi-1)); 
                    System.out.println(res);
                }
            }
        }catch(Exception e){}
    }
}
