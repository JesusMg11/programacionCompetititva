package RetosV1;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class ConvertirMonedas {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);    
        int mon=0,dol=0,yen=0,eur=0;
        System.out.println("Ingrese la cantidad en pesos: ");
        mon=sc.nextInt();
        dol=mon*99;
        yen=mon*99;
        eur=mon*99;
        System.out.println("La cantidad de "+mon+" es: "+dol+" dolares, "+yen+" yenes, "+eur+" euros");
    }
    
}
