
package RetosV1;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class MatrizCero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tam1=0,tam2=0;
        System.out.println("Ingresa el numero de filas de la matriz: ");
        tam1=sc.nextInt();
        System.out.println("Ingresa el numero de columnas de la matriz");
        tam2=sc.nextInt();
        int mat[][]=new int [tam1][tam2];
        for (int i = 0; i < tam1; i++) {
            for (int j = 0; j < tam2; j++) {
                mat[i][j]=(int)(Math.random()*100);
            }
        }
       for (int i = 0; i < tam1; i++) {
            for (int j = 0; j < tam2; j++) {
                System.out.print("|"+mat[i][j]+"|");
            }
            System.out.println("");
        }
        
        //MATRIZ CON BORDES EN 0
        for (int i = 0; i < tam2; i++) { //HACE LAS FILAS 1 Y ULTIMA EN 0
                mat[0][i]=0;
                mat[tam1-1][i]=0;
            }
            for (int j = 0; j < tam1; j++) { //HACE LAS COLUMNAS 1 Y DE LA ORILLA EN 0
                mat[j][0]=0;
                mat[j][tam2-1]=0;
            }
            for (int i = 0; i < tam1; i++) 
            {
             for (int j = 0; j < tam2; j++) {
                System.out.print("|"+mat[i][j]+"|");
            }
            System.out.println("");
        }
    }
}
