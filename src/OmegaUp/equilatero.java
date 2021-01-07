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
public class equilatero {
    public static void main(String[] args) {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         try{
             int veces=Integer.parseInt(br.readLine());
             for (int i = 0; i < veces; i++) {
                 double triangulo=Double.parseDouble(br.readLine());
                 double cat, mitad, rest, altura;
                 cat=triangulo*triangulo;
                 mitad=triangulo/2;
                 rest=cat-(mitad*mitad);
                 altura=Math.sqrt(rest);
                 DecimalFormat numf=new DecimalFormat("#######.##");
            double al=Double.parseDouble(numf.format(altura));
                 System.out.println(al);
             }
         }catch(Exception e){}
    }
}
