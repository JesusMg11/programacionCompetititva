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
import java.util.Collections;
public class Maestro {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            ArrayList<Long> v1=new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                v1.add(Long.parseLong(br.readLine()));
            }
            Collections.sort(v1);
            System.out.println(Collections.max(v1));
            System.out.println(v1.get(3));
            System.out.println(Collections.min(v1));
        }catch(Exception e){}
    }
}
