
package RetosV5;

/**
 *
 * @author Francisco
 */
import java.io.*;
import java.util.StringTokenizer;
public class Reto512 {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int casos,conejo,caballo,tot,regla;
            casos=Integer.parseInt(br.readLine());
            while(casos!=0){
                String cad=br.readLine();
                StringTokenizer st=new StringTokenizer(cad," ");
                conejo=Integer.parseInt(st.nextToken());
                caballo=Integer.parseInt(st.nextToken());
                tot=conejo+caballo;
                regla=(conejo*100)/tot;
                System.out.println(regla);
                casos--;
            }
        }catch(Exception e){;}
    }
}
