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
public class Radio {
    public static void main(String[] args) {
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(580);
        ar.add(980);
        ar.add(1190);
        ar.add(1250);
        ar.add(1420);
        String a="";
        int num=Integer.parseInt(br.readLine());
        int aux=0;
        if (num<540 || num>1520) {
            System.out.println("error");
        }else{
            for (int i = 0; i < ar.size(); i++) {
                aux=Math.abs(num-ar.get(i));
                int x1=num-ar.get(i+1);
                if (aux>x1) {
                    
                }
                
            }
            System.out.println(a+" "+aux);
        }
    }catch(Exception e){;}
    }
}
