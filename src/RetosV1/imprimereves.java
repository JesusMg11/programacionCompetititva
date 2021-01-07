
package RetosV1;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class imprimereves {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String cad="";
        int cont=0;
        System.out.println("Ingresa la cadena");
        cad=sc.nextLine();
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i)>=48&&cad.charAt(i)<=57) {//codigo ascii de numeros de 0-9
               cont=0; //Si contador es =0 significa que toda la cadena son numeros
            }else{
                cont++;
            }
        }
        if (cont==0) {
            for (int i = cad.length()-1; i >=0; i--) {//empezamos desde la ultima posicion,que llegue hasta la primera (i >=0) y como es al reves en vez de aumentar disminuye
                System.out.print(cad.charAt(i));
            }
        }else{
            System.out.println("Erro, ingresa solo numeros");
        }
                
    }
    
}
