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
import java.util.StringTokenizer;

public class Iggy {

    public static void main(String[] args) {
        Iggy i = new Iggy();
        i.inicio();
    }

    public void inicio() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int valio = 0;
            String cad = br.readLine();
            String rio = br.readLine();
            int cont = 0, xi,punto;
            ArrayList<Integer> aux = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(cad, " ");
            int tam = Integer.parseInt(st.nextToken());
            xi=tam;
            int saltos = Integer.parseInt(st.nextToken());
            if (tam == rio.length()) {
                for (int i = 0; i < rio.length(); i++) {
                    aux.add(Integer.parseInt(rio.charAt(i) + ""));
                }
                for (int i = saltos-1; i < aux.size(); i++) {
                    if (aux.get(i).equals(1)) {
                        //int ayuda=aux.get(i);
                        if (aux.get(i-(saltos-1))==1 ) {
                            cont++;
                        }else{
                           valio++;
                        }
                    }
                 //   System.out.println(cont);
                }
                    
                if (valio>0) {
                    System.out.println("-1");
                } else {
                    System.out.println(cont);
                }
            } else {
                System.exit(0);
            }
        } catch (Exception e) {;
        }
    }

}
