
package OmegaUp;

/**
 *
 * @author Francisco
 */
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class ContarLapices {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String cad=br.readLine();
            ArrayList<Integer> v1=new ArrayList<>();
             StringTokenizer st = new StringTokenizer(cad, " ");
             int n1=Integer.parseInt(st.nextToken());
             int n2=Integer.parseInt(st.nextToken());
             int cont=0,lap;
             for (int i = 0; i < n1; i++) {
                 lap=Integer.parseInt(br.readLine());
                 v1.add(lap);
            }
             for (int i = 0; i < v1.size(); i++) {
                 if (v1.get(i).equals(n2)) {
                     cont++;
                 }
            }
             System.out.println(cont);
        }catch(Exception e){;}
    }
}
