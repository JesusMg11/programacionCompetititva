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
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
public class Calificaciones {
    public static void main(String[] args) {
        Calificaciones c=new Calificaciones();
        c.inicio();
    }
        int apro=0, rep=0;
            String nom, mayor , menor ;
            double cal, sum=0, prom, maxim, minim;
            ArrayList<String> v1=new ArrayList<>();
            ArrayList<String> v11=new ArrayList<>();
            ArrayList<String> v12=new ArrayList<>();
            ArrayList<Double> v2=new ArrayList<>();
    public void inicio(){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int veces=Integer.parseInt(br.readLine());
            if (veces>1001) {
                System.exit(0);
            }else{
                for (int i = 0; i < veces; i++) {
                nom=br.readLine();
                cal=Double.parseDouble(br.readLine());
                if (cal>0 && cal<=100) {
                    v1.add(nom);
                    v2.add(cal);
                }else{
                     cal(nom,v1,v2);
                }
            }
            maxim=Collections.max(v2);
            minim=Collections.min(v2);
            for (int i = 0; i < v2.size(); i++) {
                sum=sum+v2.get(i);
                if (v2.get(i)>=60) {
                    apro++;
                }else{
                    rep++;
                }
                if (v2.get(i).equals(maxim)) {
                    v11.add(v1.get(i));
                }
                if (v2.get(i).equals(minim)) {
                    v12.add(v1.get(i));
                }
            }
            Collections.sort(v11);
            Collections.sort(v12);
            mayor=v11.get(0);
            menor=v12.get(0);
            prom=sum/veces;
            DecimalFormat numf=new DecimalFormat("#.##");
            double al=Double.parseDouble(numf.format(prom));
            System.out.println("PROMEDIO GRUPAL: "+al);
            System.out.println("ALUMNOS APROBADOS "+apro);
            System.out.println("ALUMNOS REPROBADOS "+rep);
            System.out.println(mayor+" "+maxim);
            System.out.println(menor+" "+minim);
            }
            
        }catch(Exception e){;}
    }
    public void cal(String nom, ArrayList v1, ArrayList v2){
        System.out.println("UPS, ERROR!, DIGITE DE NUEVO LA CALIFICACION DE "+nom);
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            this.cal=Double.parseDouble(br.readLine());
            if (cal>0 && cal<=100) {
                this.v1.add(nom);
                this.v2.add(cal);
            }else{
                cal(nom,v1,v2);
            }
        }catch(Exception e){;}
    }
}
