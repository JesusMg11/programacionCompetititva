/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OmegaUp;

/**
 *
 * @author JESUS
 */
import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
public class calificaciones2 {
    public static void main(String[] args) {
        calificaciones2 c2=new calificaciones2();
        c2.inicio();
    }
    int cont_apro=0,cont_repro=0;
    double cal,sum=0;
    String nom;
        ArrayList<alumno> alu_nom =new ArrayList<>();
    public void inicio(){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
        int alumnos;
        alumnos = Integer.parseInt(br.readLine());
    
          alumno aux = new alumno();
          
       for(int i=0;i<alumnos;i++){
           nom=br.readLine();
           cal=Double.parseDouble(br.readLine());
           if(cal>100 || cal<0){
               recursividad(nom,cal,alu_nom);
           }else{
           if (cal>=60) {
               cont_apro++;
           }else{
               cont_repro++;
           }
           aux.setCalificacion(cal);
           aux.setNombre(nom);
           alu_nom.add(aux);
           }
            
       }
       
            for (int i = 0; i < alu_nom.size(); i++) {
                sum+=alu_nom.get(i).getCalificacion();
            }
            double prom=(sum/alumnos);
            DecimalFormat numfinal=new DecimalFormat("#.##");
            double promedio_final=Double.parseDouble(numfinal.format(prom));
            System.out.println("PROMEDIO GRUPAL: "+promedio_final);
            System.out.println("ALUMNOS APROBADOS "+cont_apro);
            System.out.println("ALUMNOS REPROBADOS "+cont_repro);
     
             
        }catch (Exception e){;}
    }
    
    public void recursividad(String nom, double cal, ArrayList alu_nom){
        System.out.println("UPS, ERROR!, DIGITE DE NUEVO LA CALIFICACION DE "+nom);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            alumno aux = new alumno();
             this.cal=Double.parseDouble(br.readLine());
            if (this.cal>0 && this.cal<=100) {
                 aux.setCalificacion(this.cal);
                aux.setNombre(this.nom);
               this. alu_nom.add(aux);
            }else{
                recursividad(this.nom,this.cal,this.alu_nom);
            }
        }catch(Exception e){;}
    }
}


