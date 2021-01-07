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


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class matriz {
    
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            if (n >= 1 && n <= 100) {
                int mx[][] = new int[n][n];
                String cad = br.readLine();
                StringTokenizer st;
                for (int i = 0; i < n; i++) {
                    st = new StringTokenizer(cad, " ");
                }
                for (int i = 0; i < mx.length; i++) {
                    for (int j = 0; j < mx.length; j++) {
                        mx[i][j] = Integer.parseInt(br.readLine());
                    }
                }
                int res = 0;
                for (int i = 0; i < mx.length; i++) {
                    for (int j = 0; j < mx.length; j++) {
                        if (i == j) {
                            res += mx[i][j];
                        }
                    }
                }
                System.out.println("" + res);
                for (int i = 0; i < mx.length; i++) {
                    for (int j = 0; j < mx.length; j++) {
                        System.out.print("" + mx[i][j] + " ");
                    }
                    System.out.println("");
                }
            } else {
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}