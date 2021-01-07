
package RetosV1;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class Minutos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa los segundos");
        int sec=sc.nextInt();
       int hor=sec/3600,hor2=sec%3600,min=hor2/60,sec2=hor2%60;
      
        System.out.println(hor+":"+min+":"+sec2);
    }
}
