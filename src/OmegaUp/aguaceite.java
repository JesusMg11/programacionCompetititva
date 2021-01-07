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
public class aguaceite {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            ArrayList<Integer> v1=new ArrayList<>();
            ArrayList<Integer> v2=new ArrayList<>();
            int veces=Integer.parseInt(br.readLine());
            String cad=br.readLine();
            StringTokenizer st=new StringTokenizer(cad," ");
            for (int i = 0; i <veces; i++) {
            int num=Integer.parseInt(st.nextToken());
                if (num%2==0) {
                    v1.add(num);
                }else{
                    v2.add(num);
                }
            }
            v1.addAll(v2);
            for (int i = 0; i < v1.size(); i++) {
                System.out.print(v1.get(i)+" ");
            }
        }catch(Exception e){;}
    }
}
