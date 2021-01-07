/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodingCup2020;

/**
 *
 * @author JESUS
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class pelotas {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(br.readLine());
            if(n < 0 ){
                System.exit(0);
            }else{
                String cad = br.readLine();
                StringTokenizer st = new StringTokenizer(cad," ");
                ArrayList<Integer> arr = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    arr.add(Integer.parseInt(st.nextToken()));
                }
                //System.out.println("ARREGLO NORMAL "+arr);
                Collections.sort(arr);
                System.out.println(arr.get(0));
            }
        }catch(Exception e){;}
    }
}
