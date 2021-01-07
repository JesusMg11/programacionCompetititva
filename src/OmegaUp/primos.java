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
public class primos {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(br.readLine());
            int cont = 0;
            for (int i = 1; i <= num; i++) {
                if ((num % i) == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        } catch (Exception e) {;}
    }
}
