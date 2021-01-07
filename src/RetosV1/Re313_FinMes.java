package RetosV1;

/**
 *
 * @author Jesus
 */
import java.io.*;
import java.util.StringTokenizer;
public class Re313_FinMes {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int x=0,num1=0,num2=0;
            String cad="";
            StringTokenizer st;
            x=Integer.parseInt(br.readLine());
            for (int i = 0; i < x; i++) {
                cad=br.readLine();
                st=new StringTokenizer(cad," ");
                num1=Integer.parseInt(st.nextToken());
                num2=Integer.parseInt(st.nextToken());
               int res=0;
               res=num1+num2;
                if (res>=0) {
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
