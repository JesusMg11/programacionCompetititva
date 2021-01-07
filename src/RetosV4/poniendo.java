package RetosV4;

/**
 *
 * @author Francisco
 */
import java.io.*;

public class poniendo {

    public static void main(String[] args) {
        poniendo p = new poniendo();
        p.iniciar();
    }

    public void iniciar() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cop, cont = 0,copn;
        try {
            do {
                cop = Integer.parseInt(br.readLine()); //leemos el numero de copas en total
                copn=cop-1;//damos por sentado que el primer viaje lo lleva el hermano menor,asi que tenemos menos una copa
                cont++;//aumentamos este primer viaje
                 if (cop==0) {//si es 0 la enteada, termina el programa
                System.exit(0);
            }else{
                   while(copn!=0){//mientras que tengamos copas
                        if (copn % 2 == 0) {//si es par llevamos dos
                            copn = copn - 2;
                            cont++;
                        } else {//si es impar, llevamos de una sola
                            copn = copn - 1;
                            cont++;
                        }
                    }
                    System.out.println(cont);//imprimimos total de viajes
                    cont=0;  //dejamos nuestro contador de vaijes en 0 para un nuevo caso
                 }
            } while (copn != 100000000);//While que es infinito pero a la vez no xd
        } catch (Exception e) {

        }
    }
}
