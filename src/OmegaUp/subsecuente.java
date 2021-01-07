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
import java.util.ArrayList;
public class subsecuente {
    public static void main(String[] args) {
        try{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String cad1=br.readLine();
        String cad2=br.readLine();
        int cont=0;
        ArrayList<Integer> v1=new ArrayList<>();
        ArrayList<Integer> v2=new ArrayList<>();
//            if (cad1.length()>=cad2.length()) {
//                for (int i = 0; i < cad1.length(); i++) {
//                    for (int j = 0; j < cad2.length(); j++) {
//                     if (cad1.charAt(i)==cad2.charAt(j)) {
//                        cont++;
//                        v1.add(i);
//                        v2.add(j);
//                        break;
//                    }   
//                    }
//                }
//                System.out.println(cont);
//                for (int i = 0; i < cont; i++) {
//                System.out.println(v1.get(i)+" "+v2.get(i));
//            }
//            }else{
//                for (int i = 0; i < cad2.length(); i++) {
//                    for (int j = 0; j < cad1.length(); j++) {
//                     if (cad2.charAt(i)==cad1.charAt(j)) {
//                        cont++;
//                        v1.add(j);
//                        v2.add(i);
//                        break;
//                    }   
//                    }
//                }
//                System.out.println(cont);
//                for (int i = 0; i < cont; i++) {
//                System.out.println(v1.get(i)+" "+v2.get(i));
//            }
//            }
            if (cad1.contains(cad2)) {
                
            }
        }catch(Exception e){}
    }
}
