
 
package RetosV4;

import java.util.ArrayList;
import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author Jesus
 */
public class R219_Loteria {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           StringTokenizer st;
        String linea="";
        ArrayList<String> arr=new ArrayList<>();
        int num2=0,c=0,c3=0;
        int num=Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
             num2=Integer.parseInt(br.readLine());
             linea=br.readLine();
             st=new StringTokenizer(linea," ");
             while(st.hasMoreTokens()){
                 arr.add(st.nextToken());
                 c++;
             }
             int vector[]=new int[c];
             for (int j = 0; j < vector.length; j++) {
                vector[j]=Integer.parseInt(st.nextToken());
                 System.out.println("|"+vector[j]+"|");
            }
             for (int j = 0; j < vector.length; j++) {
                 if (vector[j]%2==0) {
                     c3++;
                 }
            }
             System.out.println("xd"+c3);
        }
        }catch(Exception e){
            
        }
        }
        }

    

