/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetosV4;

/**
 *
 * @author Francisco
 */
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Reto_511 {

    public static void main(String[] ar) {
        Reto_511 pv = new Reto_511();
        pv.cargar();
    }

    public void cargar() {
        try {
            ArrayList<Integer> veca = new ArrayList<>(); //declaramos los vectores
            ArrayList<Integer> vecb = new ArrayList<>();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String cad = "", cadva = "", cadvb = ""; //nuestros 3 renglones
            int va, vb; //los grupos de vectores
            int auxv1, auxv2;
            int auxv3, auxv4;
            int tot = 0;
            while (true) { //ciclo infinito
                cad = br.readLine(); //primer renglon
                StringTokenizer st = new StringTokenizer(cad, " ");
                va = Integer.parseInt(st.nextToken()); //primer grupo
                vb = Integer.parseInt(st.nextToken()); //segundo grupo
                cadva = br.readLine(); //segundo renglon
                StringTokenizer st2 = new StringTokenizer(cadva, " ");//separamos por parejas de numeros el segundo renglon
                for (int i = 0; i < va; i++) { //vector a, for del tamaño del primer grupo
                    auxv1 = Integer.parseInt(st2.nextToken());
                    auxv2 = Integer.parseInt(st2.nextToken());
                    for (int j = 0; j < auxv1; j++) { //el primer digito indica las veces que añadiremos el segundo digito, for del tamaño del primer digito
                        veca.add(auxv2); //añadimos el segundo digito al vector
                    }
                }
                cadvb = br.readLine();
                StringTokenizer st3 = new StringTokenizer(cadvb, " ");
                for (int i = 0; i < vb; i++) { //vector b, mismo proceso que arriba
                    auxv3 = Integer.parseInt(st3.nextToken());
                    auxv4 = Integer.parseInt(st3.nextToken());
                    for (int j = 0; j < auxv3; j++) {
                        vecb.add(auxv4);
                    }
                }
                for (int x = 0; x < veca.size(); x++) { //multiplicamos las posiciones de los vectores, for del tamaño de los vectores
                    tot = tot + (veca.get(x) * vecb.get(x)); //sumatoria de posx de vector 1 por posx de vector 2
                }
                System.out.println(tot); //imprimimos el resultado final
                tot=0;//deja en blanco el total y los vectores, y se repite todo nuevamente
                veca.clear(); 
                vecb.clear();
            }
        } catch (Exception e) {
        }
    }
}
