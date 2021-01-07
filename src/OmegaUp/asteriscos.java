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
public class asteriscos {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            String cad=br.readLine();
            StringTokenizer st=new StringTokenizer(cad," ");
            ArrayList<Integer> v1=new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                v1.add(Integer.parseInt(st.nextToken()));
            }
            for (int i = 0; i < v1.size(); i++) {
                for (int j = 0; j < v1.get(i); j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }catch(Exception e){}
    }
  
}
