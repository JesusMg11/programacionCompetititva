/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetosV5;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author Francisco
 */
public class Reto321 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int casos = Integer.parseInt(br.readLine());
            for (int i = 0; i < casos; i++) {
                String cad = br.readLine();
                StringTokenizer st = new StringTokenizer(cad, " ");
                int num1 = Integer.parseInt(st.nextToken());
                int num2 = Integer.parseInt(st.nextToken());
                int sum=num1+num2;
                int rango=((sum*(sum+1))/2)+1;
                rango=rango+num1;
                System.out.println(rango);
            }
        } catch (Exception e) {;}
    }
}
