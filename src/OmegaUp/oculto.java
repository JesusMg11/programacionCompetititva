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
import java.util.StringTokenizer;
public class oculto {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int casos=Integer.parseInt(br.readLine());
            for (int i = 0; i < casos; i++) {
                String cad=br.readLine();
                StringTokenizer st=new StringTokenizer(cad," ");
                long num1=Long.parseLong(st.nextToken());
                long num2=Long.parseLong(st.nextToken());
                long x1=num1-num2;
                long x2=num1+num2;
                System.out.println(x1+""+x2);
            }
        }catch(Exception e){;}
    }
}
