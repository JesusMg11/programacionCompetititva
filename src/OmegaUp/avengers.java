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
public class avengers {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int num=Integer.parseInt(br.readLine());
            String cad=br.readLine();
            String cad2=br.readLine();
            ArrayList<Integer> v1=new ArrayList<>();
            ArrayList<Integer> v2=new ArrayList<>();
            StringTokenizer st=new StringTokenizer(cad," ");
            StringTokenizer st2=new StringTokenizer(cad2," ");
            for (int i = 0; i < num; i++) {
                v1.add(Integer.parseInt(st.nextToken()));
                v2.add(Integer.parseInt(st2.nextToken()));
            }
            int  thanos=0, avengers=0;
            for (int j = 0; j < v1.size(); j++) {
                for (int i = 0; i < v1.size(); i++) {
                if (v1.get(j)>v2.get(i)) {
                    avengers++;
                }else if (v1.get(j)<v2.get(i)) {
                    thanos++;
                }else if (v1.get(j)==v2.get(i)) {
                }
            }
            }
            if (avengers>thanos) {
                System.out.println("Avengers");
                System.out.println(avengers);
            }else{
                int sal = 0;
                for (int i = avengers; i <= thanos; i++) {
                    sal++;
                }
                System.out.println("Thanos");
                System.out.println(sal);
            }
        }catch(Exception e){;}
    }
}
