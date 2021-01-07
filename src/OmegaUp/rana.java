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
public class rana {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int ranas=Integer.parseInt(br.readLine());
            ArrayList<Double> v1=new ArrayList<>();
            int tam = 0;
            for (int i = 0; i < ranas; i++) {
                v1.add(Double.parseDouble(br.readLine()));
            }
            for (int i = 0; i <= v1.size(); i++) {
                if (i%2==0) {
                    tam=tam+(i);
                }else{
                }
            }
            DecimalFormat numf=new DecimalFormat("#######.#");
            double al=Double.parseDouble(numf.format(tam));
            System.out.println(al);
        }catch(Exception e){}
    }
}
