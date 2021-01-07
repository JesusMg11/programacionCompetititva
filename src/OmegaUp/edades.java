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
import java.util.StringTokenizer;

public class edades {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int tam = Integer.parseInt(br.readLine());
            if (tam >= 1 && tam <= 1000000) {
                String cad = br.readLine();
                StringTokenizer st = new StringTokenizer(cad, " ");
                ArrayList<Integer> v1 = new ArrayList<>();
                for (int i = 0; i < tam; i++) {
                    v1.add(Integer.parseInt(st.nextToken()));    
                } 
                Collections.sort(v1);
                for (int i = 0; i < v1.size(); i++) {
                    if (v1.get(i)<=0 || v1.get(i)>100) {
                        System.exit(0);
                    }
                }
                for (int i = 0; i < v1.size(); i++) {
                    System.out.print(v1.get(i) + " ");
                }
            } else {
                System.exit(0);
            }

        } catch (Exception e) {
        }
    }
}
