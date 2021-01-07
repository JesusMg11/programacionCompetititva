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
import java.util.StringTokenizer;

public class token {

    public static void main(String[] args) {
        token t = new token();
        t.iniciar();
    }

    public void iniciar() {
        try {
            int vasos, pos, p1, p2, aux = 0, aux2,aux3;
            String cad = "", cad2 = "";
            boolean bandera=false;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            do { // mientras que los primeros valores sean distintos de 0 0
                cad = br.readLine(); //leer primer renglon
                StringTokenizer st2 = new StringTokenizer(cad, " ");//separarlo
                vasos = Integer.parseInt(st2.nextToken());
                pos = Integer.parseInt(st2.nextToken());
                if (vasos == 0 && pos == 0) {
                    System.exit(0); // si ambos son 0 0 se truena
                } else {
                    do {//mientras que nuestros dos nuevos valores sean distintos de 0 
                        cad2 = br.readLine(); //leer segundo renglon
                        do { //mientras que las posociones sean disntintas de 0
                            StringTokenizer st = new StringTokenizer(cad2, " "); //separarlo y guardarlo en dos variables
                            p1 = Integer.parseInt(st.nextToken());
                            p2 = Integer.parseInt(st.nextToken());
                            if ((p1>vasos)&& (p2>vasos)) { //if que compare que si es mayor la poscion que el numero total de vasos, truene
                                System.exit(0);
                            }else if((p1<vasos)&& (p2<vasos)&&bandera==false){
                                aux = p1; //guardamos en auxiliares los valores originales
                                aux2 = p2;
                                p2 = aux; //intercambiamos los valores originales, asi la bola ya está en el valor indicado
                                p1 = aux2;
                                aux3=p1; //auxilar con posicion de la bolita
                                bandera=true; //bandera que si entró a este ciclo
                                if (bandera=true) { // si entró al ciclo anterior se repite lo mismo pero guardando la posicion de la bolita
                                aux3=p1;
                                aux = p1; //guardamos en auxiliares los valores originales
                                aux2 = p2;
                                p2 = aux; //intercambiamos los valores originales, asi la bola ya está en el valor indicado
                                p1 = aux2;
                                bandera=false;
                            }
                            }
                            
                        } while (p1 == 0 && p2 == 0);
                    } while (p1 == 0 && p2 == 0);
                    System.out.println(p1); //imprimimos posicion final donde está la bolita
                }
            } while (true);
        } catch (Exception e) {

        }
    }
}
