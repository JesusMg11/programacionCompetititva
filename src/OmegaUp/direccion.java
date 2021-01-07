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
import java.util.Collections;
import java.util.StringTokenizer;

public class direccion {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String cad = br.readLine();
            StringTokenizer st = new StringTokenizer(cad, " ");
            int alto = Integer.parseInt(st.nextToken());
            int ancho = Integer.parseInt(st.nextToken());
            int matriz[][] = new int[alto][ancho];
            int aux = 0;
            for (int i = 0; i < alto; i++) {
                String fila = br.readLine();
                StringTokenizer st2 = new StringTokenizer(fila, " ");

                for (int j = 0; j <= matriz.length; j++) {
                    matriz[aux][j] = Integer.parseInt(st2.nextToken());
                }
                aux++;
            }
            boolean co = false;
//            for (int i = 0; i < matriz.length; i++) {
//                for (int j = 0; j < matriz[i].length; j++) {
//                    if (matriz[i][j] == matriz[i - 1][j - 1]) {
//                        co = true;
//                    } else {
//                        if (matriz[i][j] == 0) {
//                            matriz[i-1][j-1] = 8;
//                            co = false;
//                        } else if (matriz[i][j] == 1) {
//                             matriz[i + 1][j]=8;
//                            co = false;
//                        } else if (matriz[i][j] == 2) {
//                            matriz[i - 1][j]=8;
//                            co = false;
//                        } else if (matriz[i][j] == 3) {
//                            matriz[i - 1][j - 1]=8;
//                            co = false;
//                        }
//                    }
//
//                }
//
//            }


 int aux2 = 0;
            for (int i = 0; i < alto; i++) {
                for (int j = 0; j <= matriz.length; j++) {
                    if (matriz[i][j] == matriz[i - 1][j - 1]) {
                        co = true;
                    } else {
                        if (matriz[i][j] == 0) {
                            matriz[i-1][j-1] = 8;
                            co = false;
                        } else if (matriz[i][j] == 1) {
                             matriz[i + 1][j]=8;
                            co = false;
                        } else if (matriz[i][j] == 2) {
                            matriz[i - 1][j]=8;
                            co = false;
                        } else if (matriz[i][j] == 3) {
                            matriz[i - 1][j - 1]=8;
                            co = false;
                        }
                    }
                }
                aux2++;
            }
            if (co) {
                System.out.println("llegaste");
            } else {
                System.out.println("te perdiste");
            }

//          for (int x = 0; x < matriz.length; x++) {
//              System.out.println();
//              for (int y = 0; y < matriz[x].length; y++) {
//                  System.out.print("|"+matriz[x][y]+"|");
//              }
//              
//          }
        } catch (Exception e) {;
        }
    }

}
