/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodingCup2020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author JESUS
 */
public class copia {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine()), token = 0, r = 0;
            if (n < 0) {
                System.exit(0);
            } else {
                String cad = br.readLine();
                StringTokenizer st = new StringTokenizer(cad, " ");
                r = Integer.parseInt(st.nextToken());
                for (int i = 0; i < n; i++) {
                    // do{
                    while (st.hasMoreElements()) {
                        token = Integer.parseInt(st.nextToken());
                        if (token < r) {
                            r = token;
                        }
                    }
                }

                //  }while(st.hasMoreTokens());
                // }
                System.out.println(r);

            }
        } catch (Exception e) {
        }
    }
}
