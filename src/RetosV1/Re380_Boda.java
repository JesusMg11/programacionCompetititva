package RetosV1;

/**
 *
 * @author Jesus
 */
import java.io.*;
import java.util.StringTokenizer;
public class Re380_Boda {
    public static void main(String[] args) {
        try{
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             StringTokenizer st;
             int x=0,y=0;
             String cad="";
             do{
                 x=Integer.parseInt(br.readLine());
                 if (x==0) {
                     break;
                 }else{
                     int num=0,res=0;
                     cad=br.readLine();
                     for (int i = 0; i < x; i++) {
                      st=new StringTokenizer(cad," ");
                      num=Integer.parseInt(st.nextToken());
                      res=res+num;
                     }
                     System.out.println(res);
                 }
             }while(x!=0);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
