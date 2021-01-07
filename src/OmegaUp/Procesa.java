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
import java.util.StringTokenizer;
public class Procesa {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int n=Integer.parseInt(br.readLine());
            ArrayList<Integer> v1=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String cad=br.readLine();
                StringTokenizer st=new StringTokenizer(cad," ");
                String pal=st.nextToken();
                String num=st.nextToken();
                if ("REGISTRA".equals(pal)) {
                  v1.add(Integer.parseInt(num));
                }else if("CUENTA".equals(pal)){
                    StringTokenizer st3=new StringTokenizer(cad," ");
                    String pierde=st3.nextToken();
                    int cuenta=Integer.parseInt(st3.nextToken());
                    int inicio=Integer.parseInt(st3.nextToken());
                    int fin=Integer.parseInt(st3.nextToken());
                    int cont=0;
                    for (int j = inicio-1; j <= fin-1; j++) {
                        if (v1.get(j).equals(cuenta)) {
                            cont++;
                        }
                    }
                    System.out.println(cont);
                }
               // System.out.println(v1);
            }
        }catch(Exception e){;}
    }
   
}
