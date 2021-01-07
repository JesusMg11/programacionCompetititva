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
public class sumaRenglones {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String cad = br.readLine();
            String ren;
            StringTokenizer st = new StringTokenizer(cad, " ");
            StringTokenizer reng;
            int r1, r2, sum = 0;
            r1 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());
            for (int i = 0; i < r1; i++) { // for de hacia abajo
                ren = br.readLine();
                reng = new StringTokenizer(ren, " ");
                for (int j = 0; j < r2 ;j++) { //for para los lados
                    sum = sum + (Integer.parseInt(reng.nextToken()));
                }
                System.out.println(sum);
                sum = 0;
            }
            
        }catch (Exception e){;}
             
    }
}
