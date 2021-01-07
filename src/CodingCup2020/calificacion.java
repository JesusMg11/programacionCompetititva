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
import java.util.StringTokenizer;

public class calificacion {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int cal, pon, sumCal = 0, sumPon = 0, prom = 0;
            int n = Integer.parseInt(br.readLine());
            String cad;
            StringTokenizer st;
            for (int i = 0; i < n; i++) {
                cad = br.readLine();
                st = new StringTokenizer(cad, " ");
                cal = Integer.parseInt(st.nextToken());
                if(cal >10 || cal < 0){
                    System.exit(0);
                }else{
                pon = Integer.parseInt(st.nextToken());
                sumCal = sumCal + cal;
                sumPon = sumPon + pon;
                for (int j = 0; j < cal; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            }
            
            prom = sumCal / n;
            if (sumPon > 100) {
                System.exit(0);
            } else {
                if (prom <= 5) {
                    System.out.println("0");
                    System.out.println(":(");
                } else {
                    System.out.println(prom);
                    System.out.println(":)");
                }
            }

        } catch (Exception e) {;
        }
    }
}
