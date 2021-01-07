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
import java.util.*;

public class diamantes {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String cad = br.readLine();
            int n, q, l, r, s;
            StringTokenizer st = new StringTokenizer(cad, " ");
            StringTokenizer diamante;
            n = Integer.parseInt(st.nextToken());
            q = Integer.parseInt(st.nextToken());
           // ArrayList<Integer> rangos = new ArrayList<>();
            int rangos[]= new  int[n];
            String escaneos;
            for (int i = 0; i < q; i++) {
                escaneos = br.readLine();
                diamante = new StringTokenizer(escaneos, " ");
                l = Integer.parseInt(diamante.nextToken());
                r = Integer.parseInt(diamante.nextToken());
                for (int j = l; j <= r; j++) {
                   rangos[j]=1;
                }
            }
            
            int cont = 0, cont2 = 0;
            for (int i = 0; i < rangos.length; i++) {
              //  System.out.print(rangos[i]+"  ");
                if(rangos[i] != 0){
                    cont++;
                }else{
                    cont = 0;
                }
                if(cont != 0){
                    
                }else{
                    cont2++;
                }
            }
            System.out.println(cont2);
        } catch (Exception e) {;
        }
    }
}
